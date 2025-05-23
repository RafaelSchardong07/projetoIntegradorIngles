
package com.mycompany.projetointegrador3;

import java.util.List;

public class Financeiro {
    
    private double totalArrecadado;
    private double totalGasto;
    
    private double salarioPorfessor;
    private double mensalidadeAluno;
    
   public void calcularFinanceiro(List<Alunos> alunos, List<Professores> professores) {
    this.totalArrecadado = alunos.size() * this.mensalidadeAluno;
    this.totalGasto = professores.size() * this.salarioPorfessor;

    System.out.println("Total arrecadado com mensalidades: R$ " + this.totalArrecadado);
    System.out.println("Total gasto com salários: R$ " + this.totalGasto);
    System.out.println("Saldo do mês: R$ " + (this.totalArrecadado - this.totalGasto));
}
    
    
    public Financeiro(double totalArrecadado, double totalGasto) {
        this.totalArrecadado = totalArrecadado;
        this.totalGasto = totalGasto;
    }

    public Financeiro() {
    }

    public double getTotalArrecadado() {
        return totalArrecadado;
    }

    public void setTotalArrecadado(double totalArrecadado) {
        this.totalArrecadado = totalArrecadado;
    }

    public double getTotalGasto() {
        return totalGasto;
    }

    public void setTotalGasto(double totalGasto) {
        this.totalGasto = totalGasto;
    }

    public double getSalarioPorfessor() {
        return salarioPorfessor;
    }

    public void setSalarioPorfessor(double salarioPorfessor) {
        this.salarioPorfessor = salarioPorfessor;
    }

    public double getMensalidadeAluno() {
        return mensalidadeAluno;
    }

    public void setMensalidadeAluno(double mensalidadeAluno) {
        this.mensalidadeAluno = mensalidadeAluno;
    }
        
}
