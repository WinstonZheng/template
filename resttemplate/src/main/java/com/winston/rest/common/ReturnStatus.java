package com.winston.rest.common;

/**
 * author: winston
 * date: 10/29/2017.
 * description:
 */
public enum ReturnStatus {

    Success("ok"),Failure("error"),
    BAD_REQUEST("could_not_read_json"),
    METHOD_NOT_ALLOWED("request_method_not_supported"),
    UNSUPPORTED_MEDIA_TYPE("content_type_not_supported"),
    INTERNAL_SERVER_ERROR("Internal Server Error");

    private String message;

    ReturnStatus(String message){
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }


}
