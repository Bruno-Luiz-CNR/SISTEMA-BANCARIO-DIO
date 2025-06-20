# BancoApp - Aplicação Bancária em Java

Este projeto é uma aplicação simples em Java que simula funcionalidades básicas de um sistema bancário, permitindo a criação de contas e operações financeiras como consulta de saldo, depósito, saque, pagamento de boletos e uso de cheque especial.

---

## Funcionalidades

- Criação de conta bancária com número aleatório e saldo inicial (mínimo R$50)
- Consulta de saldo disponível
- Consulta do limite do cheque especial
- Depósito de valores na conta
- Saque com possibilidade de utilização do cheque especial, incluindo cobrança de taxa
- Pagamento de boletos com saldo ou cheque especial
- Verificação do uso e limite restante do cheque especial

---

## Como usar

Estrutura do Projeto
BancoApp.java: Classe principal que gerencia a interação com o usuário, cria contas e exibe o menu de operações.

Conta.java: Classe que representa a conta bancária, contendo atributos e métodos para operações financeiras.

Detalhes técnicos
O número da conta é gerado aleatoriamente para cada nova conta criada.

O cheque especial é calculado com base no saldo inicial.

Operações que utilizam o cheque especial cobram uma taxa de 20% sobre o valor usado do limite.

O programa é construído utilizando conceitos básicos de orientação a objetos e manipulação de entrada via Scanner.

Melhorias futuras
Implementar persistência de dados para salvar as contas e transações.

Adicionar autenticação de usuário.

Criar interface gráfica para facilitar a interação.

Adicionar extrato detalhado de transações.