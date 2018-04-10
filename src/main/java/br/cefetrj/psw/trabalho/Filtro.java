/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.trabalho;

import java.io.IOException;
import org.apache.log4j.Logger;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 *
 * @author Matheus
 * Todo erro que não foi tratado cai nessa classe e é armazenado em um documento de texto e despacha para uma página hmtl
 */

@WebFilter("/*")
public class Filtro implements Filter{

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
      try{
          chain.doFilter(request,response);
      }catch(Exception e){
          Logger log = Logger.getLogger(Filtro.class);
          log.error("Erro tá aqui:", e);
          request.getRequestDispatcher("/erro.html").forward(request,response);
      }
    }

    
    
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {   
    }

    @Override
    public void destroy() {
    }
    
    
    
}
