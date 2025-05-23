package com.mycompany.projetointegrador3;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import java.time.LocalDate;

@Entity(name="Alunos")
public class Alunos {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_aluno") 
    private int id;

    private String nome;

    @Column(name = "data_nasc", nullable = false)
    private LocalDate data_nasc;

    private String telefone;
    private String cpf;

    @Column(name = "nivel_ingles")
    private String nivel_ingles;

    
    
    @ManyToOne
@JoinColumn(name = "id_turma")
private Turmas id_turma;
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(LocalDate data_nasc) {
        this.data_nasc = data_nasc;
    }

    public Turmas getId_turma() {
        return id_turma;
    }

    public void setId_turma(Turmas id_turma) {
        this.id_turma = id_turma;
    }


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNivel_ingles() {
        return nivel_ingles;
    }

    public void setNivel_ingles(String nivel_ingles) {
        this.nivel_ingles = nivel_ingles;
    }
}