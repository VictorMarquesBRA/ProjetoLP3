<%-- 
    Document   : index
    Created on : 22/02/2017, 12:27:05
    Author     : Fernando Bontorin, 31568343
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/indexStyle.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>NABRASA</title>
    </head>
    <body>
        <section class="header absolute">
            <div id="logo">LOGO</div>
            <div id="nav"></div>
        </section>
        <section>
            <div class="form" id="entrar">
                <form>
                    <h3 class="section-title hr">Entrar</h3><br>
                    <center><label for="usuario-entrar" class="label">E-mail</label></center>
                    <center><input autocomplete="no" id="usuario-entrar" name="usuario" type="text" /></center><br>
                    <center><label for="password-entrar" class="label">Senha</label></center>
                    <center><input id="password-entrar" name="password" type="password" /></center><br>
                    <center><input type="submit" /></center>
                </form>
                <span class="form-bottom-button">Não tem conta? Criar</span>
            </div>
        </section>
    </body>
</html>
