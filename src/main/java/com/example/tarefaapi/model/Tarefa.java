package com.example.tarefaapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tarefas")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "nome é obrigatório")
    private String nome;

    @NotNull(message = "dataEntrega é obrigatória")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataEntrega;

    @NotBlank(message = "responsavel é obrigatório")
    private String responsavel;

    public Tarefa() {}

    public Tarefa(String nome, LocalDate dataEntrega, String responsavel) {
        this.nome = nome;
        this.dataEntrega = dataEntrega;
        this.responsavel = responsavel;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
}
