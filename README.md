# 🚚 Sistema de Entrega e Notificação com Design Patterns

## 📌 Descrição

Este projeto simula um módulo de logística de uma plataforma de e-commerce, utilizando os padrões de projeto:

- **Strategy** para o cálculo de entrega com diferentes modalidades.
- **Adapter** para integração com uma transportadora externa.

A aplicação foi construída utilizando **Java com Spring Boot**.

---

## 🛠️ Padrões de Projeto Utilizados

### 1. Strategy Pattern — Cálculo de Entrega

O padrão **Strategy** permite selecionar dinamicamente uma entre várias estratégias de cálculo de entrega. Cada modalidade de entrega (Expressa, Econômica, Terceirizada) possui sua própria implementação da interface `EntregaStrategy`.

📁 Estrutura:
```
strategy/
├── EntregaStrategy.java
├── EntregaExpressa.java
├── EntregaEconomica.java
└── TransportadoraTerceirizada.java
```

🔁 O serviço `EntregaService` escolhe dinamicamente a estratégia de cálculo com base na entrada da requisição.

---

### 2. Adapter Pattern — Integração com Transportadora Externa

O padrão **Adapter** é usado para adaptar a API da transportadora externa ao formato esperado pelo nosso sistema.

📁 Estrutura:
```
adapter/
├── TransportadoraAdapter.java
└── TransportadoraExternaAPI.java 
```

---

## 🚀 Como Usar

1. Envie uma requisição HTTP com a modalidade de entrega, o peso do produto e a distancia:
   ```
   GET /entrega?modalidade=expressa&peso=10&distancia=150
   ```

2. A aplicação irá:
   - Escolher dinamicamente a estratégia correta (Strategy).
   - Calcular o valor do frete (local ou via adapter).

---

## 📈 Exemplo de Resultado

```json
  Valor do frete: R$ 76.0
```

---

## ✅ Conclusão

Este projeto demonstra como é possível aplicar dois padrões de projeto de forma clara e extensível, separando responsabilidades, facilitando a manutenção e permitindo o crescimento da aplicação com baixo acoplamento.