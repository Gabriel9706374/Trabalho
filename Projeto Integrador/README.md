# Projeto Integrador - Sistema de Pagamentos de uma Loja

## Sobre o projeto

Esse projeto foi desenvolvido para a disciplina de Programação Orientada a Objetos (POO), utilizando Java.

O sistema simula um PDV (Ponto de Venda) de uma loja, onde é possível cadastrar funcionários, fazer login, abrir e fechar o caixa e realizar pagamentos.

## Funcionalidades

### Login

Para entrar no sistema, o funcionário precisa informar:

* ID
* Senha

O sistema possui dois tipos de usuários:

* Gerente
* Operador de Caixa

### Gerente

O gerente pode:

* Cadastrar funcionários
* Cadastrar outros gerentes
* Listar funcionários
* Gerar relatório de vendas
* Ver as vendas realizadas e o total vendido

### Operador de Caixa

O operador pode:

* Abrir o caixa
* Realizar pagamentos
* Fechar o caixa
* Listar pagamentos realizados

O sistema também verifica se o caixa está aberto antes de permitir um pagamento.

Se o caixa estiver fechado, o pagamento não é realizado.

## Formas de pagamento

É possível realizar pagamentos utilizando:

* PIX
* Boleto
* Cartão de Débito
* Cartão de Crédito

No cartão de crédito também existe a opção de pagamento à vista ou parcelado.

## Relatório de vendas

O gerente pode gerar um relatório mostrando os pagamentos que foram realizados e o valor total das vendas.

## Conceitos de POO utilizados

Durante o projeto foram utilizados alguns conceitos estudados na disciplina, como:

* Classes e objetos
* Encapsulamento
* Herança
* Polimorfismo
* Classe abstrata
* Getters e setters
* Sobrescrita de métodos

## Classes do projeto

As principais classes utilizadas são:

```text
Funcionario
├── Gerente
└── OperadorCaixa

Pagamento
├── Pix
├── Boleto
└── Cartao
    ├── Debito
    └── Credito

Loja
ProjetoIntegrador
```

## Como executar

Para executar o projeto é necessário ter o Java instalado.

Depois:

1. Abra o projeto em uma IDE Java.
2. Execute a classe `ProjetoIntegrador`.
3. O sistema será iniciado pelo terminal.
4. Escolha as opções apresentadas no menu.

## Primeiro acesso

O sistema possui um gerente inicial para poder acessar o sistema pela primeira vez.

```text
ID: 1
Senha: 1234
```

Depois de entrar como gerente, é possível cadastrar novos funcionários e gerentes.

## Tecnologias utilizadas

* Java
* Programação Orientada a Objetos
* Git
* GitHub

## Autor

Projeto desenvolvido como atividade da disciplina de Programação Orientada a Objetos.
