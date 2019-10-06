package com.syyb.web.controller;

import com.syyb.common.pojo.JQueryPager;
import com.syyb.seat.exception.SeatException;
import com.syyb.seat.pojo.TBook;
import com.syyb.seat.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

@Controller
public class BookController {

    @Resource(name = "bookService")
    BookService bookService;
    @RequestMapping("/user/downSeat")
    @ResponseBody
    public String downSeat(@RequestParam int seatNumber,@RequestParam int userId, HttpServletResponse response){
        response.setContentType("text/html;charset=utf-8");
        try {
            bookService.downSeat(seatNumber,userId);
        } catch (SeatException e) {
            return e.getMessage();
        }
        return "1";
    }

    @RequestMapping(value = "/bookList",params = "json")
    @ResponseBody
    public JQueryPager<TBook> userList(@RequestParam(defaultValue = "10") int rows, @RequestParam(defaultValue = "1") int page ){
        JQueryPager<TBook> pager = bookService.selByPage(rows, page);
        return  pager;
    }

    @RequestMapping(value = "/bookList")
    public String userList(){
        return "admin/seat/bookList";
    }
}
