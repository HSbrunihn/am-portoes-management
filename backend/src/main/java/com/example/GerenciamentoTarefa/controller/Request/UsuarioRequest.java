package com.example.GerenciamentoTarefa.controller.Request;

import com.example.GerenciamentoTarefa.entity.Tarefa;

import java.util.List;

public record UsuarioRequest(
        String nome,
        String email,
        String senha
) {
}
