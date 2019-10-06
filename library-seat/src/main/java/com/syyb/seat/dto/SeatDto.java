package com.syyb.seat.dto;

import java.util.Date;

public class SeatDto {
    private Integer seatNumber;
    private Integer roomNumber;
    private String seatDesc;
    private Integer userId;


    private Date stratTime;

    private Date endTime;
    private int status;

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getSeatDesc() {
        return seatDesc;
    }

    public void setSeatDesc(String seatDesc) {
        this.seatDesc = seatDesc;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public Date getStratTime() {
        return stratTime;
    }

    public void setStratTime(Date stratTime) {
        this.stratTime = stratTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
