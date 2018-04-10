package br.cefetrj.psw.trabalho;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Matheus
 *
 * No doPost o servidor recebe os valores que o usuario escrever no formulario
 * como parametro e verifica(try) se todos foram preenchidos, se não(catch) o
 * servidor escreve "erro", se sim escreve em uma tabela o resultado do
 * formulario.
 *
 */
@WebServlet(name = "Servidor", urlPatterns = {"/Servidor"})
public class Servidor extends HttpServlet {

    ArrayList<Aluno> a = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * nessa parte (req.setAttribute("erroP1", null)) os erros estão sendo
         * setados como null pois quando abrir o formulario os erros não
         * existirão; no boolean verifica, estará verificando se em cada if o
         * erro existe;
         */

        req.setAttribute("erroP1", null);
        req.setAttribute("erroTrabalho", null);
        req.setAttribute("erroProjeto", null);
        req.setAttribute("erroPF", null);
        req.setAttribute("erroFrequencia", null);
        req.setAttribute("erroDisciplina", null);

        boolean verifica = false;

        try {

            String aluno = (String) req.getParameter("aluno");
            double p1 = Double.parseDouble(req.getParameter("p1"));
            double trabalho = Double.parseDouble(req.getParameter("trabalho"));
            double projeto = Double.parseDouble(req.getParameter("projeto"));
            double pf = Double.parseDouble(req.getParameter("pf"));
            double frequencia = Double.parseDouble(req.getParameter("frequencia"));
            String disciplina = (String) req.getParameter("disciplina");
            String situacao = situacao(frequencia, p1, trabalho, projeto, pf);
            
            /**
             * no if verificará se existe um erro, se sim atribuirá o erro ao aluno, se não passará o valor digitado normalmente
             */

            if (p1 > 10 || p1 < 0) {
                req.setAttribute("erroP1", "A nota da p1 deve estar entre 0 e 10!");
                verifica = true;
            }else{
                req.setAttribute("p1", p1);
            }
            
            if (trabalho > 10 || trabalho < 0) {
                req.setAttribute("erroTrabalho", "A nota do trabalho deve estar entre 0 e 10!");
                verifica = true;
            }else{
                req.setAttribute("trabalho", trabalho);
            }
            
            if (projeto > 10 || projeto < 0) {
                req.setAttribute("erroProjeto", "A nota do projeto deve estar entre 0 e 10!");
                verifica = true;
            }else{
                req.setAttribute("projeto", projeto);
            }
            
            if (pf > 10 || pf < 0) {
                req.setAttribute("erroPF", "A nota da pf deve estar entre 0 e 10!");
                verifica = true;
            }else{
                req.setAttribute("pf", pf);
            }
            
            if (frequencia > 100 || frequencia < 0) {
                req.setAttribute("erroFrequencia", "A frequencia deve estar entre 0 e 100!");
                verifica = true;
            }else{
                req.setAttribute("frequencia", frequencia);
            }
            
            if (disciplina == ""){
                req.setAttribute("erroDisciplina", "A disciplina deve ser selecionada!");
                verifica = true;
            }else{
                req.setAttribute("disciplina", disciplina);
            }
            
            /**
             * no momento que houver um erro a booleana será ativada e voltará à pagina do formulario, se não houver erro criará um novo objeto e enviará para a tabela.
             */


            if (verifica == true) {
                req.setAttribute("aluno",aluno);
                req.getRequestDispatcher("/Formulario.jsp").forward(req, resp);
            } else {
                a.add(new Aluno(aluno, p1, frequencia, trabalho, projeto, pf, disciplina, situacao));
                req.setAttribute("a", a);
                req.getRequestDispatcher("/Planilha.jsp").forward(req, resp);
            }

        } catch (Exception e) {
            resp.getWriter().print("erro");
        }

    }

    /**
     * Aqui está o algoritmo de resultado que verifica se o aluno está aprovado
     * ou reprovado, calculando as notas que foram providas no formulario.
     */
    public String situacao(double frequencia, double p1, double trabalho, double projeto, double pf) {
        double m1 = (0.7 * ((p1 + trabalho) / 2)) + (projeto * 0.3);
        String situacao;

        if (frequencia >= 75) {
            if (m1 >= 7) {
                situacao = "Aprovado";
            } else if (m1 < 3) {
                situacao = "Reprovado";
            } else {

                if (((pf + m1) / 2) >= 5) {
                    situacao = "Aprovado";
                } else {
                    situacao = "Reprovado";
                }
            }
        } else {
            situacao = "Reprovado";
        }

        return situacao;
    }

}
