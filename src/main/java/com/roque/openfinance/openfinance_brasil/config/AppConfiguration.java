package com.roque.openfinance.openfinance_brasil.config;

import com.roque.openfinance.openfinance_brasil.core.adapter.input.web.OpenFinanceLimiteCartaoAdapter;
import com.roque.openfinance.openfinance_brasil.core.port.output.OpenFinanceLimiteCartaoPort;
import com.roque.openfinance.openfinance_brasil.core.service.ConsultarLimiteCartaoService;
import com.roque.openfinance.openfinance_brasil.core.usecase.ConsultarLimiteCartaoUseCase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfiguration {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public OpenFinanceLimiteCartaoPort openFinanceLimiteCartaoPort(RestTemplate restTemplate,
                                                                   @Value("${openfinance.api.baseurl}") String apiUri) {
        return new OpenFinanceLimiteCartaoAdapter(restTemplate, apiUri);
    }

    @Bean
    public ConsultarLimiteCartaoUseCase consultarLimiteCartaoUseCase(OpenFinanceLimiteCartaoPort openFinancePort) {
        return new ConsultarLimiteCartaoService(openFinancePort);
    }
}
