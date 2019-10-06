package com.syyb.seat.pojo;

import java.util.Date;

public class TBook {
    private Integer id;

    private Integer seatId;

    private Integer userId;

    private Integer occupyStatus;

    private Date stratTime;

    private Date endTime;

    private Integer expire;

    private Integer violation;

    private Integer longTrem;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOccupyStatus() {
        return occupyStatus;
    }

    public void setOccupyStatus(Integer occupyStatus) {
        this.occupyStatus = occupyStatus;
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

    public Integer getExpire() {
        return expire;
    }

    public void setExpire(Integer expire) {
        this.expire = expire;
    }

    public Integer getViolation() {
        return violation;
    }

    public void setViolation(Integer violation) {
        this.violation = violation;
    }

    public Integer getLongTrem() {
        return longTrem;
    }

    public void setLongTrem(Integer longTrem) {
        this.longTrem = longTrem;
    }
}