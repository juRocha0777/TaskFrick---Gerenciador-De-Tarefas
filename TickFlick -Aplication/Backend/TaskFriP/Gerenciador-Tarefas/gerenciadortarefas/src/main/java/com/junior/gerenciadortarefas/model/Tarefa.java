package com.junior.gerenciadortarefas.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String descricao;
    private boolean concluida;

    public Tarefa() {}

    public Tarefa(String descricao, boolean concluida) {
        this.descricao = descricao;
        this.concluida = concluida;
    }
}
