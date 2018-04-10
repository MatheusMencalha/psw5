/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.trabalho;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author Matheus
 * A classe tag transforma um conjunto de linhas em uma tag e faz com que o campo de seleção com opções no formulário é substituido pela tag e todo o processo é feito nessa classe
 */
public class Tag extends SimpleTagSupport{
    
    private String perfilSelecionado;

    public String getPerfilSelecionado() {
        return perfilSelecionado;
    }

    public void setPerfilSelecionado(String perfilSelecionado) {
        this.perfilSelecionado = perfilSelecionado;
    }
    
    public void doTag() throws JspException,IOException{
        
       String selectHtml =
        "<select class= 'form-control' name='disciplina'>" +     
        "    <option value=''></option>" +
        "    <option value='PSW' " + ("PSW".equals(perfilSelecionado) ? "selected": "") +  " >PSW</option>" +
        "    <option value='APS' " + ("APS".equals(perfilSelecionado)  ? "selected": "") + " >APS</option>" +
        "</select>";
        getJspContext().getOut().print(selectHtml);
                
    }
    
    
}
