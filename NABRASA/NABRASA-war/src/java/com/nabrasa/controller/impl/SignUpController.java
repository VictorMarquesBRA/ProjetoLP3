/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nabrasa.controller.impl;

import com.nabrasa.controller.AbstractController;

/**
 *
 * @author 31507239
 */
public class SignUpController extends AbstractController {

    @Override
    public void execute() {
      String email = this.getRequest().getParameter("email");
      String username = this.getRequest().getParameter("username");
      String password = this.getRequest().getParameter("password");
      String repassword = this.getRequest().getParameter("repassword");
      
      
      
      if (!password.equals(repassword)) {
          this.setReturnPage("signup.jsp");
          this.getRequest().setAttribute("message", "As senhas informadas não conferem.");
          this.getRequest().setAttribute("messageType", "error");
          
      }
      
    }
    
}
