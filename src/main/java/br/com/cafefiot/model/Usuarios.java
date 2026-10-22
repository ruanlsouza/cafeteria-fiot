package br.com.cafefiot.model;

import jdk.internal.vm.annotation.Stable;

import javax.annotation.processing.Generated;{

@Entity
@Table
public class Usuarios {

    @Id
    @GeneratedValue(strategy = generationtype.IDETITY)
    public lang id;
    private Integer registro;
    @Colum(length = 80)
    private String nome;
    @colum(length = 40)
    private String email;
    @DateTimeFormat
    private String dataadimisao;
    private boolean ativo;


    //contructor


    public Usuarios() {
    }

    public Usuarios(lang id, Integer registro, String nome, String email, String dataadimisao, boolean ativo) {
        this.id = id;
        this.registro = registro;
        this.nome = nome;
        this.email = email;
        this.dataadimisao = dataadimisao;
        this.ativo = ativo;
    }

    //seters


    public void setId(lang id) {
        this.id = id;
    }

    public void setRegistro(Integer registro) {
        this.registro = registro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataadimisao(String dataadimisao) {
        this.dataadimisao = dataadimisao;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}

//guters




