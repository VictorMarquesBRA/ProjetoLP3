/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nabrasa.controller.impl;

import com.nabrasa.controller.AbstractController;
import com.nabrasa.persistence.UserNABRASADAO;
import com.nabrasa.persistence.entities.UserNABRASA;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Fernando
 */
public class SignInController extends AbstractController{

    UserNABRASADAO userNABRASADAO = lookupUserNABRASADAOBean();

    @Override
    public void execute() {
        this.setReturnPage("index.jsp");
        String email;
        String password;
        email = this.getRequest().getParameter("email");
        password = this.getRequest().getParameter("password");
        UserNABRASA user = userNABRASADAO.readByEmail(email);
        if(user.getPassword().equals(password)){
            this.setReturnPage("user/home.jsp");
        }
    }

    private UserNABRASADAO lookupUserNABRASADAOBean() {
        try {
            Context c = new InitialContext();
            return (UserNABRASADAO) c.lookup("java:global/NABRASA/NABRASA-war/UserNABRASADAO!com.nabrasa.persistence.UserNABRASADAO");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
}
