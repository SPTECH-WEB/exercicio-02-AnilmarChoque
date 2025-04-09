package com.example.entrega.controller;

import com.example.entrega.service.EntregaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/entrega")
public class EntregaController {
    private final EntregaService entregaService;

    public EntregaController(EntregaService entregaService) {
        this.entregaService = entregaService;
    }

    @GetMapping
    public ResponseEntity<String> calcular(@RequestParam String modalidade, @RequestParam double peso, @RequestParam double distancia) {
        double valor = entregaService.calcular(modalidade, peso, distancia);
        return ResponseEntity.ok("Valor do frete: R$ " + valor);
    }
}
