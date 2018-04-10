<%-- 
    Document   : Formulario
    Created on : 26/03/2018, 16:21:09
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="selects" uri="WEB-INF/tagLib.tld"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
        <title>Formulario</title>
    </head>
    <body>
        <form action="Servidor" method="POST"> 
            <div class="form-group row">
                <label for="inputAluno" class="col-sm-2 col-form-label">Aluno:</label>
                <div class="col-sm-10">
                    <input type="text" name="aluno" value="${aluno}" class="form-control" id="inputAluno" placeholder="Aluno">${erroAluno}
                </div>
            </div>
            <div class="form-group row">
                <label for="inputFrequencia" class="col-sm-2 col-form-label">Frequencia:</label>
                <div class="col-sm-10">
                    <input type="text" name="frequencia" value ="${frequencia}" class="form-control" id="inputFrequencia" placeholder="Frequencia">${erroFrequencia}
                </div>
            </div> 
            <div class="form-group row">
                <label for="inputP1" class="col-sm-2 col-form-label">P1:</label>
                <div class="col-sm-10">
                    <input type="text" name="p1" value ="${p1}" class="form-control" id="inputP1" placeholder="P1">${erroP1}
                </div>
            </div>
        </div> 
        <div class="form-group row">
            <label for="inputTrabalho" class="col-sm-2 col-form-label">Trabalho:</label>
            <div class="col-sm-10">
                <input type="text" name="trabalho" value ="${trabalho}" class="form-control" id="inputTrabalho" placeholder="Trabalho">${erroTrabalho}
            </div>
        </div>  
    </div> 
    <div class="form-group row">
        <label for="inputProjeto" class="col-sm-2 col-form-label">Projeto:</label>
        <div class="col-sm-10">
            <input type="text" name="projeto" value ="${projeto}" class="form-control" id="inputProjeto" placeholder="Projeto">${erroProjeto}
        </div>
    </div>  
    </div> 
    <div class="form-group row">
        <label for="inputPF" class="col-sm-2 col-form-label">PF:</label>
        <div class="col-sm-10">
            <input type="text" name="pf" value ="${pf}" class="form-control" id="inputPF" placeholder="PF">${erroPF}
        </div>
    </div> 
    <div class="form-group row">
        <label class="col-sm-2 col-form-label" for="inlineDisciplina">Disciplina:</label>
        <div class="col-sm-10">
        <selects:Tag perfilSelecionado="${disciplina}"/>${erroDisciplina}
        </div>
    </div>    

<button type="submit" class="btn btn-primary offset-md-5">Enviar</button>             
<button type="submit" class="btn btn-primary">Limpar</button>          
</form>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
</body>
</html>
