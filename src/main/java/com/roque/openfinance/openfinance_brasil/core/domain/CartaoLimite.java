package com.roque.openfinance.openfinance_brasil.core.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CartaoLimite {
    private String idUsuario;
    private String idCartao;
    private BigDecimal limiteDisponivel;
    private BigDecimal limiteTotal;
    private String moeda;
    private LocalDate dataValidadeLimete;

}
