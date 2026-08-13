package com.example.GerenciamentoTarefa.controller.Request;

import java.time.LocalTime;

public record ProdutoRequest(
        String nome,
        Long codigo,
        String preco,
        LocalTime dataValidade) {
}
