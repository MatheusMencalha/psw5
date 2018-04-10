/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.trabalho;

/**
 *
 * @author Matheus
 * 
 * Classe aluno que possui nome, p1, frequencia, trabalho, projeto, pf, disciplina e situação
 * possui o construtor de cada atributo e seus getters e setters.
 */
public class Aluno {    
    private String nome;
    private double p1;
    private double frequencia;
    private double trabalho;
    private double projeto;
    private double pf;
    private String disciplina;
    private String situacao;

    public Aluno(String nome, double p1, double frequencia, double trabalho, double projeto, double pf, String disciplina, String situacao) {
        this.nome = nome;
        this.p1 = p1;
        this.frequencia = frequencia;
        this.trabalho = trabalho;
        this.projeto = projeto;
        this.pf = pf;
        this.disciplina = disciplina;
        this.situacao = situacao;
    }

 
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public double getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho;
    }

    public double getProjeto() {
        return projeto;
    }

    public void setProjeto(double projeto) {
        this.projeto = projeto;
    }

    public double getPf() {
        return pf;
    }

    public void setPf(double pf) {
        this.pf = pf;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    
    
}