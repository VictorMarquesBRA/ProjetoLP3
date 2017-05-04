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
 * @author 31507239
 */
public class SignUpController extends AbstractController {


    @Override
    public void execute() {
        this.setReturnPage("index.jsp");
        String email = null;
        String username = null;
        String password = null;
        String repassword = null;
        if (this.getRequest().getParameter("email").equals("")) {
            this.sendErrorMsg("O campo 'Email' não pode ser vazio.");
            this.setErro(true);
        } else {
            email = this.getRequest().getParameter("email");
        }
        if (this.getRequest().getParameter("username").equals("")) {
            this.sendErrorMsg("O campo 'Nome' não pode ser vazio.");
            this.setErro(true);
        } else {
            username = this.getRequest().getParameter("username");
        }
        if (this.getRequest().getParameter("password").equals("")) {
            this.sendErrorMsg("O campo 'Senha' não pode ser vazio.");
            this.setErro(true);
        } else {
            password = this.getRequest().getParameter("password");
        }
        if (this.getRequest().getParameter("repassword").equals("")) {
            this.sendErrorMsg("O campo 'Repita senha' não pode ser vazio.");
            this.setErro(true);
        } else {
            repassword = this.getRequest().getParameter("repassword");
        }

        if (!this.isErro()) {
            if (!password.equals(repassword)) {
                this.sendErrorMsg("As senhas informadas não conferem.");
                this.setErro(true);
            } else {
                this.sendSucessMsg("Cadastrado com sucesso.");
                UserNABRASA user = new UserNABRASA();
                user.setEmail(email);
                user.setUsername(username);
                user.setPassword(password);
                UserNABRASADAO userNABRASADAO = new UserNABRASADAO();
                userNABRASADAO.create(user);
            }
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
