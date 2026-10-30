package br.com.cafefiot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name = "Catalogo")
public class Catalogo {

    private Integer id;
    private Integer codigo;
    @Column (length = 30)
    private String produto;
    private String decricao;
    @Column (length = 10,2)
    private Double valor ;


}
