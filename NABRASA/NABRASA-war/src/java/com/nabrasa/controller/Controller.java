package com.nabrasa.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 
 */
public interface Controller {
    public void init(HttpServletRequest request, HttpServletResponse response);
    public void execute();
    public String getReturnPage();
    public void sendErrorMsg(String msg);
    public void sendAdverMsg(String msg);
    public void sendSucessMsg(String msg);
}
