# FIAP Ride - Sistema de Carros

## Sobre o projeto

Este projeto foi desenvolvido em Java utilizando conceitos de Programação Orientada a Objetos.

A classe `Carro` representa um carro no mundo real. O objeto possui informações como cor, marca e ano, além de comportamentos que permitem ligar o carro e acelerar.

## Classe Carro

A classe `Carro` possui os seguintes atributos:

* `cor`: representa a cor do carro.
* `marca`: representa a marca do carro.
* `ano`: representa o ano do carro.
* `ligado`: indica se o carro está ligado.
* `velocidade`: representa a velocidade atual do carro.

## Métodos

### `ligar()`

O método `ligar()` altera o estado do atributo `ligado` para `true`.

Existe uma regra de validação para verificar se o carro já está ligado. Se o carro já estiver ligado, ele não será ligado novamente.

Exemplo:

```java
carro1.ligar();
```

### `acelerar(int valor)`

O método `acelerar()` aumenta o valor do atributo `velocidade`.

Para manter o estado do objeto consistente, o método verifica se o carro está ligado e se o valor informado é maior que zero.

Exemplo:

```java
carro1.acelerar(20);
```

## Testes

Os métodos foram testados com valores válidos e inválidos.

### Teste de `ligar()`

* Valor válido: ligar um carro que está desligado.
* Valor inválido: tentar ligar um carro que já está ligado.

### Teste de `acelerar()`

* Valor válido: acelerar o carro com o valor `20`.
* Valor inválido: tentar acelerar com o valor `-10`.

As validações impedem que o objeto fique em um estado inconsistente.
