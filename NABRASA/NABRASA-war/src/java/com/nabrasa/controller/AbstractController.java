package com.nabrasa.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 
 */
public abstract class AbstractController implements Controller{
    private String returnPage;
    private HttpServletRequest request;
    private HttpServletResponse response;

    @Override
    public String getReturnPage(){
        return this.returnPage;
    };
    
    public void setReturnPage(String rp){
        this.returnPage = rp;
    }

    @Override
    public void init(HttpServletRequest request, HttpServletResponse response){
        this.request = request;
        this.response = response;
    };

    public HttpServletRequest getRequest() {
        return request;
    }

    public HttpServletResponse getResponse() {
        return response;
    }
    
    
    
    
}
