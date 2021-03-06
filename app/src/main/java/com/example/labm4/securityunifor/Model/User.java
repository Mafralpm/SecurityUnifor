package com.example.labm4.securityunifor.Model;

import java.util.Collection;
import java.util.Date;

public class User {

    private Integer estabelecimento;

    private Integer matricula;

    private String dvMatricula;

    private String nmUsuario;

    private String dsTpUsuario;

    private String dsTpAluno;

    private String nmCurso;

    private String dsStAcademica;

    private Integer stAcesso;

    private String dsStAcesso;

    private Date dtValidade;

    private Integer nrCarteira;

    private Integer nrViaValida;

    Collection<Infraction> infracoes;

    Collection<Vehicle> veiculos;

    public Integer getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Integer estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNmUsuario() {
        return nmUsuario;
    }

    public void setNmUsuario(String nmUsuario) {
        this.nmUsuario = nmUsuario;
    }

    public String getDvMatricula() {
        return dvMatricula;
    }

    public void setDvMatricula(String dvMatricula) {
        this.dvMatricula = dvMatricula;
    }

    public String getDsTpAluno() {
        return dsTpAluno;
    }

    public void setDsTpAluno(String dsTpAluno) {
        this.dsTpAluno = dsTpAluno;
    }

    public String getDsTpUsuario() {
        return dsTpUsuario;
    }

    public void setDsTpUsuario(String dsTpUsuario) {
        this.dsTpUsuario = dsTpUsuario;
    }

    public String getNmCurso() {
        return nmCurso;
    }

    public void setNmCurso(String nmCurso) {
        this.nmCurso = nmCurso;
    }

    public String getDsStAcademica() {
        return dsStAcademica;
    }

    public void setDsStAcademica(String dsStAcademica) {
        this.dsStAcademica = dsStAcademica;
    }

    public Integer getStAcesso() {
        return stAcesso;
    }

    public void setStAcesso(Integer stAcesso) {
        this.stAcesso = stAcesso;
    }

    public String getDsStAcesso() {
        return dsStAcesso;
    }

    public void setDsStAcesso(String dsStAcesso) {
        this.dsStAcesso = dsStAcesso;
    }

    public Date getDtValidade() {
        return dtValidade;
    }

    public void setDtValidade(Date dtValidade) {
        this.dtValidade = dtValidade;
    }

    public Integer getNrCarteira() {
        return nrCarteira;
    }

    public void setNrCarteira(Integer nrCarteira) {
        this.nrCarteira = nrCarteira;
    }

    public Integer getNrViaValida() {
        return nrViaValida;
    }

    public void setNrViaValida(Integer nrViaValida) {
        this.nrViaValida = nrViaValida;
    }

    public Collection<Infraction> getInfracoes() {
        return infracoes;
    }

    public void setInfracoes(Collection<Infraction> infracoes) {
        this.infracoes = infracoes;
    }

    public Collection<Vehicle> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Collection<Vehicle> veiculos) {
        this.veiculos = veiculos;
    }
}