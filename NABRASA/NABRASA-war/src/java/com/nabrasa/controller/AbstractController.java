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
    private boolean erro = false;

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

    @Override
    public void sendErrorMsg(String msg) {
        this.getRequest().getSession().setAttribute("messageType", "MessageError");
        this.getRequest().getSession().setAttribute("message", msg);
    }

    @Override
    public void sendAdverMsg(String msg) {
        this.getRequest().getSession().setAttribute("messageType", "MessageAdver");
        this.getRequest().getSession().setAttribute("message", msg);
    }

    @Override
    public void sendSucessMsg(String msg) {
        this.getRequest().getSession().setAttribute("messageType", "MessageConfirm");
        this.getRequest().getSession().setAttribute("message", msg);
    }

    public boolean isErro() {
        return erro;
    }

    public void setErro(boolean erro) {
        this.erro = erro;
    }
    
    
    
    
    
}
