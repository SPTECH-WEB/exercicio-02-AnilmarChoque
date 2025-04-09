package com.example.entrega.service.strategy;

import org.springframework.stereotype.Service;

@Service("expressa")
public class EntregaExpressa implements EntregaStrategy {
    @Override
    public double calcularEntrega(double peso, double distancia) {
        return (peso * 0.3 + distancia * 0.8) + 20;
    }
    @Override
    public String modalidade() {
        return "expressa";
    }
}