package com.syyb.web.controller;

import com.syyb.common.pojo.JQueryPager;
import com.syyb.common.qr.QRCodeUtil;
import com.syyb.seat.dto.SeatDto;
import com.syyb.seat.exception.SeatException;
import com.syyb.seat.pojo.TSeat;
import com.syyb.seat.service.SeatService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SeatController {

    @Resource(name = "seatService")
    SeatService seatService;
    @RequestMapping(value = "/seatList",params = "json")
    @ResponseBody
    public JQueryPager<TSeat> userList(@RequestParam(defaultValue = "10") int rows, @RequestParam(defaultValue = "1") int page ){
        JQueryPager<TSeat> pager = seatService.selByPage(rows, page);
        return  pager;
    }

    @RequestMapping(value = "/seatList")
    public String userList(){
        return "admin/seat/seatList";
    }
    @RequestMapping("/seatQr/{sence}")
    public void getSeatQr(@PathVariable String sence, HttpServletResponse response){
        try {
            QRCodeUtil.encode(sence,response.getOutputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("/seatQr")
    public void getSeatQrByParam(@RequestParam String sence, HttpServletResponse response){
        try {
            QRCodeUtil.encode(sence,response.getOutputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @RequestMapping(value = "/setSeatStatus")
    public String changeSeatStatus(@RequestParam int seatNumber){
        seatService.updateSeatBySeatNumber(seatNumber,300);
        return "redirect:index";
    }

    @RequestMapping("/user/downSeatInput")
    public String changeSeatStatusInput(@RequestParam int seatNumber, Model model){
        try {
            SeatDto seat = seatService.loadTSeat(seatNumber);
            String view ="user/downSeatInput";

            if(seat.getStatus()==1){
                //1表示占用
                seat.setSeatDesc("此座位被占用");
                view =  "user/SeatWarn";
            }else if(seat.getStatus()==2){
                //2表示预定
                seat.setSeatDesc("此座位被预定");
                view =  "user/SeatWarn";
            }else if(seat.getStatus()==3){
                //3表示暂离
                seat.setSeatDesc("此座位暂离");
                view =  "user/SeatWarn";
            }else {

            }
            model.addAttribute("seat",seat);
            return view;
        } catch (SeatException e) {
            model.addAttribute("msg",e.getMessage());
            return "user/seatError";
        }


    }
}
