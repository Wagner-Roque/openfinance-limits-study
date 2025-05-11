package com.roque.openfinance.openfinance_brasil.core.usecase;

import com.roque.openfinance.openfinance_brasil.core.domain.CartaoLimite;

import java.util.Optional;

public interface ConsultarLimiteCartaoUseCase {
    Optional<CartaoLimite> executar(String usuarioId, String CartaoId);
}
