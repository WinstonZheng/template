package com.winston.rest.common;

/**
 * author: winston
 * date: 10/29/2017.
 * description:
 */
public class Meta {

    private boolean success;
    private String message;

    public Meta(boolean success){
        this.success = success;
    }

    public Meta(boolean success, String message){
        this.success = success;
        this.message = message;
    }

    public boolean isSuccessful(){
        return this.success;
    }

    public String getMessage(){
        return this.message;
    }

}
