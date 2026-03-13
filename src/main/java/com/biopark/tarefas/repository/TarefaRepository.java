package com.biopark.tarefas.repository;

import com.biopark.tarefas.model.Tarefa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class TarefaRepository {

    private final Map<Long, Tarefa> tarefas = new LinkedHashMap<>();
    private Long nextId = 1L;

    public TarefaRepository() {
        // Pré-cadastrar 3 tarefas de exemplo
        Tarefa t1 = new Tarefa("Estudar Spring Boot", "Revisar os conceitos de Spring Boot e Thymeleaf");
        save(t1);

        Tarefa t2 = new Tarefa("Fazer compras", "Comprar frutas, legumes e pão no mercado");
        save(t2);

        Tarefa t3 = new Tarefa("Organizar escritório", "Limpar a mesa e organizar os documentos");
        save(t3);
    }

    public Tarefa save(Tarefa tarefa) {
        if (tarefa.getId() == null) {
            tarefa.setId(nextId++);
        }
        tarefas.put(tarefa.getId(), tarefa);
        return tarefa;
    }

    public List<Tarefa> findAll() {
        return new ArrayList<>(tarefas.values());
    }

    public Optional<Tarefa> findById(Long id) {
        return Optional.ofNullable(tarefas.get(id));
    }

    public void deleteById(Long id) {
        tarefas.remove(id);
    }

    public List<Tarefa> findPendentes() {
        List<Tarefa> resultado = new ArrayList<>();

        for (Tarefa tarefa : tarefas.values()) {
            if (!tarefa.getConcluida()) {
                resultado.add(tarefa);
            }
        }

        return resultado;
    }

    public List<Tarefa> findConcluidas() {
        List<Tarefa> resultado = new ArrayList<>();

        for (Tarefa tarefa : tarefas.values()) {
            if (tarefa.getConcluida()) {
                resultado.add(tarefa);
            }
        }

        return resultado;
    }
}
