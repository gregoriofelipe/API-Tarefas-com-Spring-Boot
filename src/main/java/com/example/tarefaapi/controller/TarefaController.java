package com.example.tarefaapi.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import java.util.*;
import jakarta.validation.Valid;

import com.example.tarefaapi.model.Tarefa;
import com.example.tarefaapi.repository.TarefaRepository;
import com.example.tarefaapi.exception.ResourceNotFoundException;

@RestController
@RequestMapping("/api/tarefas")
public class TarefaController {

    private final TarefaRepository repo;

    public TarefaController(TarefaRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public ResponseEntity<Tarefa> create(@Valid @RequestBody Tarefa tarefa) {
        Tarefa saved = repo.save(tarefa);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping
    public List<Tarefa> listAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> getById(@PathVariable Long id) {
        Tarefa t = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Tarefa não encontrada com id " + id));
        return ResponseEntity.ok(t);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> update(@PathVariable Long id, @Valid @RequestBody Tarefa tarefa) {
        Tarefa existing = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Tarefa não encontrada com id " + id));
        existing.setNome(tarefa.getNome());
        existing.setDataEntrega(tarefa.getDataEntrega());
        existing.setResponsavel(tarefa.getResponsavel());
        repo.save(existing);
        return ResponseEntity.ok(existing);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        Tarefa existing = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Tarefa não encontrada com id " + id));
        repo.delete(existing);
        return ResponseEntity.noContent().build();
    }
}
