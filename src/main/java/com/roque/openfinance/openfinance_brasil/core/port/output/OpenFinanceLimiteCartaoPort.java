package com.roque.openfinance.openfinance_brasil.core.port.output;

import com.roque.openfinance.openfinance_brasil.core.domain.CartaoLimite;

import java.util.Optional;

public interface OpenFinanceLimiteCartaoPort {
    Optional<CartaoLimite> obterLimiteDeCredito(String usuarioId, String cartaoIdConsolidado);
}
