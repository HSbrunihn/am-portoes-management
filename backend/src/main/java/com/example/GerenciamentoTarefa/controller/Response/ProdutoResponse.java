package com.example.GerenciamentoTarefa.controller.Response;

import java.time.LocalTime;

public record ProdutoResponse(
         Long id,
         Long codigo,
         String nome,
         String preco,
         LocalTime dataValidade
) {
}
