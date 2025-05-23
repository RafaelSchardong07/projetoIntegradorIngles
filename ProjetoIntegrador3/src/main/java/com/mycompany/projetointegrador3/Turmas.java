
package com.mycompany.projetointegrador3;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.List;

@Entity(name = "Turmas")
public class Turmas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_turma;
    
    @Column(name = "codigo_turma", nullable = false)
    private String codigoTurma;
    
    @ManyToOne
    @JoinColumn(name = "id_professor", nullable = false)
    private Professores professor;  
    
    private String horario;
    private String nivel;

    @Override
    public String toString() {
    return codigoTurma + " - " + nivel + " (" + horario + ")";
}
    public Turmas(int id_turma, String codigoTurma, Professores professor, List<Alunos> alunos, String horario, String nivel) {
        this.id_turma = id_turma;
        this.codigoTurma = codigoTurma;
        this.professor = professor;
       
        this.horario = horario;
        this.nivel = nivel;
    }

    public Turmas() {
    }

    public int getId_turma() {
        return id_turma;
    }

    public void setId_turma(int id_turma) {
        this.id_turma = id_turma;
    }

    public String getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(String codigoTurma) {
        this.codigoTurma = codigoTurma;
    }

    public Professores getProfessor() {
        return professor;
    }

    public void setProfessor(Professores professor) {
        this.professor = professor;
    }
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
}
