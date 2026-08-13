package com.example.GerenciamentoTarefa.controller.Request;

import com.example.GerenciamentoTarefa.entity.StatusTarefa;

import java.time.LocalDate;

public record OrcamentoRequest(
        String titulo,
        String descricao,
        LocalDate dataVencimento,
        StatusTarefa status) {
}
