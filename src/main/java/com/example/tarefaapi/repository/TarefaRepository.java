package com.example.tarefaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tarefaapi.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
