package com.winston.rest.utils;

import com.winston.rest.common.Meta;
import com.winston.rest.common.ReturnStatus;

/**
 * author: winston
 * date: 10/29/2017.
 * description: data类型如果用object，在反序列化过程中可能会出现问题。
 */
public class Response<T> {

    private Meta meta;
    private T data;

    public Response response(ReturnStatus returnStatus, T data){
        this.meta = new Meta(true, returnStatus.getMessage());
        this.data = data;
        return  this;
    }

    public Response success(){
        return response(ReturnStatus.Success, null);
    }

    public Response success(T data){
        return response(ReturnStatus.Success, data);
    }

    public Response failure(){
        return response(ReturnStatus.Failure, null);
    }

    public Response failure(ReturnStatus returnStatus){
        return response(returnStatus, null);
    }


    public Meta getMeta(){
        return this.meta;
    }

    public T getData(){
        return this.data;
    }



}
