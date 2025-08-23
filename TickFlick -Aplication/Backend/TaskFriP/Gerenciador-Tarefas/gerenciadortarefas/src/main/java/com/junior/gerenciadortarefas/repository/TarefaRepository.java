package com.junior.gerenciadortarefas.repository;

import com.junior.gerenciadortarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
