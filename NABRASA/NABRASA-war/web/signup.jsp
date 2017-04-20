<%-- 
    Document   : signup
    Created on : 30/03/2017, 10:05:49
    Author     : Fernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/indexStyle.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="http://supremyum.com/MessageStrap/MessageStrap_Lastest.js" type="text/javascript"></script>
        <title>NABRASA</title>
    </head>
    <body>
        <div class="${messageType}">${message}</div>
        <section class="header absolute">
            <div id="logo">LOGO</div>
            <div id="nav"></div>
        </section>
        <section>
            <div class="form" id="entrar">
                <form action="FrontController" method="POST">
                    <h3 class="section-title hr">Cadastrar-se</h3><br>
                    <center><label for="email-entrar" class="label">E-mail</label></center>
                    <center><input autocomplete="no" id="usuario-entrar" name="email" type="text" /></center><br>
                    <center><label for="username-entrar" class="label">Nome</label></center>
                    <center><input id="username-entrar" name="username" type="text" /></center><br>
                    <center><label for="password-entrar" class="label">Senha</label></center>
                    <center><input id="password-entrar" name="password" type="password" /></center><br>
                    <center><label for="repassword-entrar" class="label">Repetir Senha</label></center>
                    <center><input id="repassword-entrar" name="repassword" type="password" /></center><br>
                    <input type="hidden" name="cmd" value="SignUp">
                    <center><input type="submit" /></center>
                </form>
                <a href="index.jsp"><div class="form-bottom-button">Já possui uma conta? Entre</div></a>
            </div>
        </section>
    </body>
</html>
