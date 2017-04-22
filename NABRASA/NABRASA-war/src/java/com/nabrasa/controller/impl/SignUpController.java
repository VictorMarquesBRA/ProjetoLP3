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
        this.setReturnPage("index.jsp");
        String email;
        String username;
        String password = null;
        String repassword = null;
        if (this.getRequest().getParameter("email") != null) {
            this.sendErrorMsg("O campo 'Email' não pode ser vazio.");
            this.setErro(true);
        } else {
            email = this.getRequest().getParameter("email");
        }
        if (this.getRequest().getParameter("username") != null) {
            this.sendErrorMsg("O campo 'Nome' não pode ser vazio.");
            this.setErro(true);
        } else {
            username = this.getRequest().getParameter("username");
        }
        if (this.getRequest().getParameter("password") != null) {
            this.sendErrorMsg("O campo 'Senha' não pode ser vazio.");
            this.setErro(true);
        } else {
            password = this.getRequest().getParameter("password");
        }
        if (this.getRequest().getParameter("repassword") != null) {
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
            }
        }
    }

}
