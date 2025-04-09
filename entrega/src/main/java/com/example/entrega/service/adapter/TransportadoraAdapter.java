package com.example.entrega.service.adapter;

import com.example.entrega.service.strategy.EntregaStrategy;
import org.springframework.stereotype.Service;

@Service("externa")
public class TransportadoraAdapter implements EntregaStrategy {

    private final TransportadoraExternaAPI externaAPI;

    public TransportadoraAdapter() {
        this.externaAPI = new TransportadoraExternaAPI();
    }

    public double calcularEntrega(double peso, double distancia) {
        return externaAPI.calcular(peso, distancia);
    }

    public String modalidade(){
        return externaAPI.modalidade();
    }
}