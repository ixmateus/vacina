package com.vacina.vacinacao.domain.vacina;

import jakarta.persistence.*;

import java.time.LocalDate;

@Table(name = "vacina")
@Entity(name = "Vacina")
public class Vacina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private LocalDate dataAplicacao;

    public Vacina(){
    }

    public Vacina(Long id, String nome, String email, LocalDate dataAplicacao) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataAplicacao = dataAplicacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(LocalDate dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }
}
