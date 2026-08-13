package com.example.GerenciamentoTarefa.controller.Response;

import com.example.GerenciamentoTarefa.entity.StatusTarefa;

import java.time.LocalDate;

public record OrcamentoResponse(
        Long id,
        String titulo,
        String descricao,
        LocalDate dataVencimento,
        StatusTarefa status
) {
}
