<%-- 
    Document   : Planilha
    Created on : 26/03/2018, 16:21:27
    Author     : Matheus
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="br.cefetrj.psw.trabalho.Aluno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
        <title>Planilha</title>
    </head>
    <body>       
        <table class="table table-dark">
            <thead>
                <tr>
                    <th scope="col">Aluno</th>
                    <th scope="col">Frequencia</th>
                    <th scope="col">P1</th>
                    <th scope="col">Trabalho</th>
                    <th scope="col">Projeto</th>
                    <th scope="col">PF</th>
                    <th scope="col">Disciplina</th>
                    <th scope="col">Situacao</th>
                </tr>
            </thead>

            <tbody>
                <c:if test="${not empty a}">
                    <c:forEach items="${a}" var="b">

                        <tr>
                            <td>${b.nome}</td>
                            <td>${b.frequencia}</td>
                            <td>${b.p1}</td>
                            <td>${b.trabalho}</td>
                            <td>${b.projeto}</td>
                            <td>${b.pf}</td>
                            <td>${b.disciplina}</td>
                            <td>${b.situacao}</td>
                        </tr>

                    </c:forEach>
                </c:if>
            </tbody>
        </table>
        <button type="submit" class="btn btn-primary offset-md-5" onclick="location.href = 'http://localhost:8080/mavenproject2/Formulario.jsp'">Voltar</button>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
    </body>
</html>
