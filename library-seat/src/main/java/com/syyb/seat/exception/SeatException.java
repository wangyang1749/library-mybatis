package com.syyb.seat.exception;

public class SeatException extends RuntimeException {


    public SeatException() {
        super();
    }

    public SeatException(String message) {
        super(message);
    }

    public SeatException(String message, Throwable cause) {
        super(message, cause);
    }

    public SeatException(Throwable cause) {
        super(cause);
    }

    protected SeatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
