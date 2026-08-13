package com.example.GerenciamentoTarefa.service;

import com.example.GerenciamentoTarefa.controller.Request.TarefaRequest;
import com.example.GerenciamentoTarefa.controller.Response.TarefaResponse;
import com.example.GerenciamentoTarefa.entity.StatusTarefa;
import com.example.GerenciamentoTarefa.entity.Tarefa;
import com.example.GerenciamentoTarefa.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public TarefaResponse criar(TarefaRequest request) {
        Tarefa tarefa = new Tarefa();
        tarefa.setTitulo(request.titulo());
        tarefa.setDescricao(request.descricao());
        tarefa.setDataVencimento(request.dataVencimento());
        tarefa.setStatus(StatusTarefa.PENDENTE);

        Tarefa salva = tarefaRepository.save(tarefa);
        return toResponse(salva);
    }

    public List<TarefaResponse> listar() {
        return tarefaRepository.findAll()
                .stream()
                .map(this::toResponse)
                .toList();
    }

    public TarefaResponse buscarPorId(Long id) {
        Tarefa tarefa = tarefaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));
        return toResponse(tarefa);
    }

    public TarefaResponse atualizar(Long id, TarefaRequest request) {
        Tarefa tarefa = tarefaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));

        tarefa.setTitulo(request.titulo());
        tarefa.setDescricao(request.descricao());
        tarefa.setDataVencimento(request.dataVencimento());

        Tarefa atualizada = tarefaRepository.save(tarefa);
        return toResponse(atualizada);
    }

    public void deletar(Long id) {
        if (!tarefaRepository.existsById(id)) {
            throw new RuntimeException("Tarefa não encontrada");
        }
        tarefaRepository.deleteById(id);
    }

    private TarefaResponse toResponse(Tarefa tarefa) {
        return new TarefaResponse(
                tarefa.getId(),
                tarefa.getTitulo(),
                tarefa.getDescricao(),
                tarefa.getDataVencimento(),
                tarefa.getStatus()
        );
    }
}