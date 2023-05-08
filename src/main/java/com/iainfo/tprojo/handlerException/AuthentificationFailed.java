package com.iainfo.tprojo.handlerException;

public class AuthentificationFailed extends Exception {

    private final String message = "username or password not found";

    @Override
    public String getMessage() {
        return message;
    }
}
