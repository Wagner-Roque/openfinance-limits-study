package com.roque.openfinance.openfinance_brasil.core.adapter.input.web;

import com.roque.openfinance.openfinance_brasil.core.domain.CartaoLimite;
import com.roque.openfinance.openfinance_brasil.core.usecase.ConsultarLimiteCartaoUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/usuarios/{usuarioId}/cartoes/{cartaoId}/limites")
public class LimiteCartaoController {
    private final ConsultarLimiteCartaoUseCase consultarLimiteCartaoUseCase;

    public LimiteCartaoController(ConsultarLimiteCartaoUseCase consultarLimiteCartaoUseCase) {
        this.consultarLimiteCartaoUseCase = consultarLimiteCartaoUseCase;
    }
    @GetMapping
    public ResponseEntity<CartaoLimite> getLimiteCartao(@PathVariable String usuarioId,
                                                        @PathVariable String cartaoId
                                                        //poderia ter @RequestHeader("Consent-Id") se necessário
    ){
        Optional<CartaoLimite> limite = consultarLimiteCartaoUseCase.executar(usuarioId, cartaoId);
        return limite.map(ResponseEntity::ok)
                .orElseGet(()->ResponseEntity.notFound().build());
    }
}
