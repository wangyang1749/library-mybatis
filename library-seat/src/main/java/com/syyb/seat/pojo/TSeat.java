package com.syyb.seat.pojo;

import java.util.Date;

public class TSeat {
    private Integer seatNumber;

    private Integer roomNumber;

    private String qrDate;

    private Integer type;

    private Integer status;

    private String seatDesc;

    private Date createDate;

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

    public String getQrDate() {
        return qrDate;
    }

    public void setQrDate(String qrDate) {
        this.qrDate = qrDate == null ? null : qrDate.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSeatDesc() {
        return seatDesc;
    }

    public void setSeatDesc(String seatDesc) {
        this.seatDesc = seatDesc == null ? null : seatDesc.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}