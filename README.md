# FIAP Ride - Sistema de Carros

## Sobre o projeto

Este projeto foi desenvolvido em Java utilizando conceitos de **Programação Orientada a Objetos (POO)**.

O sistema representa diferentes tipos de carros e demonstra conceitos como:

* Encapsulamento
* Herança
* Associação
* Construtores
* Polimorfismo por sobrescrita
* `@Override`
* Coleções com `ArrayList`

A classe `MeuCarro` representa a superclasse da hierarquia. A partir dela, foram criadas as subclasses `CarroEsportivo` e `CarroEletrico`, cada uma com um comportamento específico para o método `acelerar()`.

---

## Estrutura do projeto

O projeto possui as seguintes classes principais:

```text
br.com.fiap
├── main
│   └── SistemaPrincipalHanin.java
│
└── model
    ├── Motor.java
    ├── MeuCarro.java
    ├── CarroEsportivo.java
    └── CarroEletrico.java
```

---

## Classe `Motor`

A classe `Motor` representa o motor utilizado pelo carro.

### Atributos

* `tipo`: representa o tipo do motor.
* `potencia`: representa a potência do motor.

### Métodos

* `getTipo()`: retorna o tipo do motor.
* `getPotencia()`: retorna a potência do motor.

Um objeto `Motor` é associado a um objeto `MeuCarro`.

---

## Classe `MeuCarro`

`MeuCarro` é a **superclasse** da hierarquia de carros.

### Atributos

* `cor`: representa a cor do carro.
* `marca`: representa a marca do carro.
* `ano`: representa o ano do carro.
* `ligado`: indica se o carro está ligado.
* `velocidade`: representa a velocidade atual.
* `motor`: representa o motor associado ao carro.

Os atributos são privados, seguindo o princípio de **encapsulamento**.

### Métodos principais

#### `ligar()`

O método `ligar()` altera o estado do carro para ligado.

Antes de realizar a alteração, o método verifica se o carro já está ligado.

Exemplo:

```java
carro1.ligar();
```

#### `acelerar(int valor)`

O método `acelerar()` representa o comportamento genérico de aceleração de um carro.

O método verifica:

* Se o carro está ligado.
* Se o valor da aceleração é maior que zero.

Exemplo:

```java
carro1.acelerar(20);
```

Esse método também é utilizado como base para o **polimorfismo** das subclasses.

---

## Classe `CarroEsportivo`

`CarroEsportivo` é uma subclasse de `MeuCarro`.

A classe possui o atributo adicional:

* `potenciaTurbo`: representa a potência do sistema turbo.

### Herança

```text
CarroEsportivo
       ↓
   MeuCarro
```

A classe utiliza `extends MeuCarro` e herda seus atributos e comportamentos acessíveis.

### Polimorfismo

O método `acelerar()` é sobrescrito utilizando `@Override`.

```java
@Override
public void acelerar(int valor)
```

O carro esportivo possui um comportamento diferente do carro comum. Antes de realizar a aceleração, é calculada uma aceleração adicional baseada na potência do turbo.

Exemplo:

```text
Aceleração solicitada: 50 km/h
Aceleração extra do turbo: 12 km/h
Aceleração total: 62 km/h
```

---

## Classe `CarroEletrico`

`CarroEletrico` também é uma subclasse de `MeuCarro`.

A classe possui o atributo adicional:

* `autonomia`: representa a autonomia do carro em quilômetros.

### Herança

```text
CarroEletrico
       ↓
   MeuCarro
```

### Polimorfismo

O método `acelerar()` também é sobrescrito utilizando `@Override`.

```java
@Override
public void acelerar(int valor)
```

O carro elétrico possui uma regra diferente para a aceleração. O valor informado recebe um acréscimo de eficiência de 20%.

Exemplo:

```text
Aceleração solicitada: 50 km/h
Aceleração eficiente: 60 km/h
```

---

## Polimorfismo

O projeto demonstra **polimorfismo por sobrescrita**.

Na classe principal, é criada uma lista utilizando o tipo da superclasse:

```java
List<MeuCarro> carros = new ArrayList<>();
```

Nessa lista são adicionados diferentes tipos de carros:

```java
carros.add(carro1);
carros.add(carro2);
carros.add(esportivo);
carros.add(eletrico);
```

Em seguida, um `for` percorre a lista:

```java
for (MeuCarro carro : carros) {
    carro.acelerar(50);
}
```

Mesmo que a variável `carro` seja do tipo `MeuCarro`, o Java executa o comportamento correspondente ao objeto real.

Dessa forma:

* `MeuCarro` utiliza a aceleração padrão.
* `CarroEsportivo` utiliza a aceleração com turbo.
* `CarroEletrico` utiliza a aceleração eficiente.

Não é necessário utilizar `if` ou `else` para verificar o tipo do objeto.

---

## Encapsulamento

Os atributos das classes são declarados como `private`.

O acesso aos dados é realizado por meio de métodos públicos, como:

```java
getCor()
getMarca()
getAno()
getMotor()
getVelocidade()
```

As alterações que precisam seguir regras de negócio são controladas internamente pela própria classe.

Por exemplo, `setVelocidade()` é um método privado, evitando que outras classes alterem diretamente a velocidade do carro sem passar pelas regras de validação.

---

## Associação

A classe `MeuCarro` possui uma associação com a classe `Motor`.

Isso ocorre porque um carro possui um motor:

```java
private Motor motor;
```

O motor é recebido pelo construtor:

```java
public MeuCarro(
    String cor,
    String marca,
    int ano,
    Motor motor
)
```

Essa relação representa o conceito de **"tem um"**, e não de herança.

---

## Herança

A hierarquia do projeto é:

```text
                 MeuCarro
                /        \
               /          \
              ↓            ↓
    CarroEsportivo    CarroEletrico
```

`CarroEsportivo` e `CarroEletrico` reutilizam os comportamentos definidos em `MeuCarro` e podem especializar esses comportamentos quando necessário.

---

## Construtores

Todas as classes possuem construtores para inicializar seus objetos.

Exemplo:

```java
Motor motor = new Motor("Turbo", 300);

CarroEsportivo esportivo =
    new CarroEsportivo(
        "Vermelho",
        "Ferrari",
        2025,
        motor,
        120
    );
```

As subclasses utilizam `super(...)` para chamar o construtor da superclasse:

```java
super(cor, marca, ano, motor);
```

---

## Testes

Os comportamentos do sistema são testados na classe:

```text
SistemaPrincipalHanin
```

São testados diferentes comportamentos, incluindo:

### Teste de `ligar()`

* Ligar um carro que está desligado.
* Tentar ligar novamente um carro que já está ligado.

### Teste de `acelerar()`

* Acelerar um carro ligado.
* Impedir aceleração quando o carro está desligado.
* Impedir valores de aceleração menores ou iguais a zero.

### Teste de polimorfismo

Uma `List<MeuCarro>` recebe objetos de diferentes classes:

```java
List<MeuCarro> carros = new ArrayList<>();
```

O mesmo comando:

```java
carro.acelerar(50);
```

produz comportamentos diferentes dependendo do objeto:

```text
MeuCarro       → aceleração normal
CarroEsportivo → aceleração com turbo
CarroEletrico  → aceleração eficiente
```

---

## Tecnologias utilizadas

* Java
* Programação Orientada a Objetos
* Eclipse
* Git
* GitHub
* Astah UML

---

## Conceitos de POO aplicados

| Conceito       | Aplicação                                               |
| -------------- | ------------------------------------------------------- |
| Encapsulamento | Atributos privados e métodos de acesso                  |
| Herança        | `CarroEsportivo` e `CarroEletrico` herdam de `MeuCarro` |
| Associação     | `MeuCarro` possui um `Motor`                            |
| Polimorfismo   | `acelerar()` é sobrescrito nas subclasses               |
| `@Override`    | Identifica a sobrescrita de `acelerar()`                |
| Construtores   | Inicialização dos objetos                               |
| ArrayList      | Armazenamento de diferentes tipos de `MeuCarro`         |

---

## Autor
**Hanin Atwi**
