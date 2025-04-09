package com.example.entrega.service.adapter;

public class TransportadoraExternaAPI {
    public double calcular(double peso, double distancia) {
        return (peso * 0.2 + distancia * 0.5);
    }

    public String modalidade(){
        return "externa";
    }
}
