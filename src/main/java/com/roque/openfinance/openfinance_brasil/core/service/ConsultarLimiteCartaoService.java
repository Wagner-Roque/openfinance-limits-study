package com.roque.openfinance.openfinance_brasil.core.service;

import com.roque.openfinance.openfinance_brasil.core.domain.CartaoLimite;
import com.roque.openfinance.openfinance_brasil.core.port.output.OpenFinanceLimiteCartaoPort;
import com.roque.openfinance.openfinance_brasil.core.usecase.ConsultarLimiteCartaoUseCase;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ConsultarLimiteCartaoService implements ConsultarLimiteCartaoUseCase {
    private final OpenFinanceLimiteCartaoPort openFinanceLimiteCartaoPort;

    public ConsultarLimiteCartaoService(OpenFinanceLimiteCartaoPort openFinanceLimiteCartaoPort) {
        this.openFinanceLimiteCartaoPort = openFinanceLimiteCartaoPort;
    }

    @Override
    public Optional<CartaoLimite> executar(String usuarioId, String cartaoId) {
        // Aqui pode haver lógica de negócio adicional, validações, etc.
        // Por exemplo, verificar se o usuário tem permissão para ver esse cartão.
        return openFinanceLimiteCartaoPort.obterLimiteDeCredito(usuarioId, cartaoId);
    }
}
