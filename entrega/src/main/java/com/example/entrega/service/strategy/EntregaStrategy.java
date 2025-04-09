package com.example.entrega.service.strategy;

public interface EntregaStrategy {
    double calcularEntrega(double peso, double distancia);
    String modalidade();
}
