package com.iainfo.tprojo.handlerException;

public class SessionLostException extends Exception{

    private final String message ="SESSION LOST ";

    @Override
    public String getMessage() {
        return message;
    }
}
