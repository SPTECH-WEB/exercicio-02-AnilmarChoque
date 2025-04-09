package com.example.entrega.service.strategy;

import org.springframework.stereotype.Service;

@Service("terceirizada")
public class TransportadoraTerceirizada implements EntregaStrategy {

    @Override
    public double calcularEntrega(double peso, double distancia) {
        return (peso * 0.2 + distancia);
    }

    @Override
    public String modalidade() {
        return "terceirizada";
    }
}