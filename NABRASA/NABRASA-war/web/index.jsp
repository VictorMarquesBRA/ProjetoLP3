<%-- 
    Document   : index
    Created on : 22/02/2017, 12:27:05
    Author     : Fernando Bontorin, 31568343
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/Style.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="http://supremyum.com/MessageStrap/MessageStrap_Lastest.js" type="text/javascript"></script>
        <title>NABRASA</title>
    </head>
    <body>
        <div class="${messageType}">${message}</div>
        <section id="header">
            <div id="logo">NABRASA</div>
            <div id="nav"></div>
        </section>
        <div id="container-forms">
            <form class="form" id="cadastrar" action="FrontController" method="POST">
                <p class="section-title hr">Cadastrar-se</p><br>
                <input id="email-cadastrar" name="email" type="email" placeholder="Email" /><br>
                <input id="username-cadastrar" name="username" type="text" placeholder="Nome" /><br>
                <input id="password-cadastrar" name="password" type="password" placeholder="Senha" /><br>
                <input id="repassword-cadastrar" name="repassword" type="password" placeholder="Repetir senha" /><br>
                <input type="hidden" name="cmd" value="SignUp">
                <input type="submit" />
            </form>
            <form class="form" id="entrar" action="FrontController" method="POST">
                <p class="section-title hr">Entrar</p><br>
                <input id="email-entrar" name="email" type="email" placeholder="Email" /><br>
                <input id="password-entrar" name="password" type="password" placeholder="Senha" /><br>
                <input type="hidden" name="cmd" value="SignIn">
                <input type="submit" />
            </form>
        </div>
    </body>
</html>
