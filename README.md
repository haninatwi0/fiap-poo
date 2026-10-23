# Projeto FiapRide - Hanin Atwi

## Informações do Aluno

- **Nome:** Hanin Atwi
- **RM:** 567626
- **Turma:** 2CCPB
- **Curso:** Ciência da Computação
- **GitHub:** [@haninatwi0](https://github.com/haninatwi0)

---

## Descrição do Projeto

O FiapRide é um projeto desenvolvido em Java para aplicar os conceitos de Programação Orientada a Objetos (POO) estudados nas aulas 1 a 9 da FIAP.

O projeto representa um sistema de modelagem de veículos, no qual diferentes tipos de carros possuem características e comportamentos próprios. Também permite realizar diagnósticos e verificar a necessidade de manutenção de diferentes tipos de objetos.

A implementação utiliza classes, objetos, métodos, encapsulamento, construtores, associação, herança, polimorfismo, classes abstratas e interfaces.

A classe `MeuCarro` representa a estrutura geral de um carro, enquanto `MeuCarroEletrico` e `MeuCarroEsportivo` representam especializações com características específicas. A classe `Motor` demonstra a associação entre objetos.

Além dos veículos, a interface `Inspecionavel` estabelece um contrato de comportamento implementado por carros, elevadores e servidores em nuvem, demonstrando como diferentes classes podem compartilhar operações sem precisar pertencer à mesma hierarquia de herança.

O objetivo é desenvolver um código organizado, reutilizável e protegido contra entradas inválidas, aplicando boas práticas de programação.

---

## Checklist de Implementação

- [x] Aula 1 - Classes e Objetos
- [x] Aula 2 - Métodos
- [x] Aula 3 - Encapsulamento
- [x] Aula 4 - Construtores 
- [x] Aula 5 - Associação
- [x] Aula 6 - Herança
- [x] Aula 7 - Polimorfismo por sobrescrita
- [x] Aula 8 - Classes Abstratas
- [x] Aula 9 - Interfaces 
---

## Perguntas de Reflexão

### Aula 1 - Classes e Objetos

**Pergunta:** Por que precisamos criar uma classe `Passageiro` em vez de declarar variáveis separadas no `main`? Como uma classe ajuda a gerenciar um milhão de usuários?

**Resposta:**

Criar uma classe permite representar uma entidade do mundo real por meio de atributos e comportamentos organizados em uma única estrutura. Se utilizássemos variáveis soltas para cada passageiro, o código ficaria repetitivo, difícil de manter e sujeito a erros. Com uma classe `Passageiro`, seria possível criar milhares ou milhões de objetos a partir do mesmo modelo, cada um com seus próprios dados. No FiapRide, aplico esse princípio ao utilizar a classe `MeuCarro` como modelo para diferentes veículos. Cada objeto possui suas próprias informações, como marca, cor, ano, velocidade e motor. Dessa forma, a classe facilita a reutilização do código, a organização dos dados e a manutenção do sistema.

### Aula 2 - Métodos

**Pergunta:** Por que criar um método `adicionarSaldo(valor)` em vez de alterar diretamente o saldo de um passageiro? Quais seriam os riscos de permitir alterações diretas?

**Resposta:**

Um método permite controlar como uma operação é executada e quais regras precisam ser respeitadas. Se qualquer parte do programa pudesse alterar diretamente o saldo de um passageiro, seria possível adicionar valores negativos ou realizar operações incorretas, comprometendo a confiabilidade do sistema. Um método específico poderia validar o valor recebido, atualizar o saldo e informar se a operação foi realizada corretamente. No FiapRide, o método `acelerar(int valor)` segue uma lógica semelhante: verifica se o carro está ligado e se o valor da aceleração é válido antes de modificar sua velocidade. Assim, os métodos centralizam as regras de negócio e ajudam a manter o estado dos objetos consistente.

### Aula 3 - Encapsulamento

**Pergunta:** Por que é seguro deixar métodos `get` públicos, mas perigoso deixar os atributos públicos?

**Resposta:**

O encapsulamento permite proteger os dados internos de um objeto e controlar como eles podem ser acessados ou modificados. Um atributo público pode ser alterado diretamente por qualquer parte do código, sem passar por validações. Já um método `get` permite consultar um valor sem oferecer, por si só, uma forma de modificá-lo. É como permitir que alguém consulte uma informação sem entregar o documento original para alteração. No FiapRide, os atributos da classe `MeuCarro` são privados, e os métodos públicos permitem acessar informações como marca, cor e velocidade. Além disso, os métodos de comportamento controlam operações que alteram o estado do veículo, evitando mudanças arbitrárias.

### Aula 4 - Construtores

**Pergunta:** Por que é um erro gerar getters e setters para todos os atributos automaticamente? Como a ausência de um `setModelo()` e o uso de um `setPlaca()` privado com um método `atualizarPlaca()` protegem o sistema?

**Resposta:**

Criar getters e setters para todos os atributos sem analisar sua finalidade pode expor dados que deveriam ser protegidos e permitir alterações que não fazem sentido para o negócio. Nem todo atributo precisa ser modificável depois da criação do objeto. Por exemplo, um modelo de veículo pode ser definido na fabricação e não deveria ser alterado livremente por qualquer parte do sistema. Da mesma forma, a placa de um veículo não deveria ser modificada sem passar por um processo controlado, com validações e registro da operação. Um método público como `atualizarPlaca()` pode representar esse processo, enquanto um setter privado impede alterações diretas externas. No meu projeto, utilizo atributos privados e métodos de comportamento para controlar as mudanças no veículo. Essa abordagem contribui para a integridade dos dados e segue o princípio do encapsulamento.

### Aula 5 - Associação

**Pergunta:** Por que passar o objeto `Passageiro` inteiro para o construtor de `Viagem`, em vez de passar apenas o nome como `String`?

**Resposta:**

Passar o objeto completo permite que a viagem mantenha uma referência ao passageiro e acesse suas informações e comportamentos quando necessário. Se o construtor recebesse apenas uma `String` com o nome, a viagem conheceria somente aquele texto e não teria acesso direto às operações do passageiro, como atualizar seu saldo. Além disso, nomes não identificam necessariamente uma pessoa de forma única. No FiapRide, a classe `MeuCarro` recebe um objeto `Motor` no construtor e mantém uma associação com ele. Isso permite consultar informações do motor, como tipo e potência, sem duplicar esses dados dentro do carro. Essa decisão demonstra como a associação entre objetos facilita a colaboração entre classes e a reutilização de informações.

### Aula 6 - Herança

**Pergunta:** Por que a classe filha não pode acessar diretamente os atributos privados da classe mãe? Qual princípio isso protege?

**Resposta:**

O Java impede que uma classe filha acesse diretamente os atributos privados da classe mãe para preservar o encapsulamento. A herança permite reutilizar características e comportamentos da superclasse, mas não elimina as regras de acesso definidas nela. Se uma classe filha pudesse modificar qualquer atributo privado da mãe, seria possível contornar validações e deixar os objetos em estados inconsistentes. Por isso, a classe filha deve utilizar os construtores da superclasse, por meio de `super()`, ou métodos públicos e protegidos disponibilizados pela classe mãe. No FiapRide, `MeuCarroEletrico` e `MeuCarroEsportivo` herdam de `MeuCarro` e utilizam `super()` para inicializar os dados comuns. Assim, a lógica compartilhada permanece centralizada e os detalhes internos continuam protegidos.

### Aula 7 - Polimorfismo

**Pergunta:** Por que o método `calcularAutonomia()` precisa existir na classe base para ser chamado em um loop de objetos do tipo `Veiculo`?

**Resposta:**

Em Java, o tipo declarado de uma variável determina quais métodos podem ser chamados por meio dela durante a compilação. Se `calcularAutonomia()` existisse apenas nas classes `Carro` e `Moto`, o compilador não permitiria chamar esse método diretamente por uma variável declarada como `Veiculo`. Ao declarar o método na superclasse, estabelecemos um contrato comum para todos os veículos. Cada classe filha pode sobrescrever o método com uma implementação específica. Dessa forma, um loop pode percorrer uma coleção de veículos e chamar o mesmo método, permitindo que cada objeto execute seu comportamento correspondente. No meu projeto, a classe abstrata `MeuCarro` declara o método `tipoDeCarro()`, implementado por `MeuCarroEletrico` e `MeuCarroEsportivo`. Isso demonstra como o polimorfismo simplifica o código e facilita a inclusão de novas especializações.

### Aula 8 - Classes Abstratas

**Pergunta:** Por que precisamos declarar explicitamente `Veiculo` como `abstract`? Qual seria o risco de permitir a criação de um veículo genérico?

**Resposta:**

Uma classe abstrata representa um conceito geral que serve como base para classes mais específicas, mas que não deve ser instanciado diretamente. No mundo real, um veículo precisa pertencer a uma categoria concreta, como carro, moto ou caminhão. Ao declarar a classe como `abstract`, o Java impede a criação de objetos genéricos que não correspondam a uma especialização definida. O compilador não deduz automaticamente essa intenção porque a decisão depende das regras e do modelo de negócio estabelecidos pelo desenvolvedor. No FiapRide, `MeuCarro` é abstrata porque define características comuns, enquanto as subclasses representam tipos específicos de carros. O método abstrato `tipoDeCarro()` obriga cada classe filha concreta a fornecer sua própria implementação, tornando o modelo mais consistente.

### Aula 9 - Interfaces

**Pergunta:** Por que Java permite implementar várias interfaces, mas não herdar de várias classes? Como as interfaces evitam conflitos?

**Resposta:**

Java permite que uma classe implemente várias interfaces porque elas definem contratos de comportamento sem exigir que a classe herde a implementação e o estado de várias superclasses. A herança múltipla de classes poderia gerar ambiguidades quando diferentes classes mães definissem métodos com a mesma assinatura e implementações incompatíveis. As interfaces permitem que uma classe assuma diferentes responsabilidades sem criar essa complexidade de herança de estado. No meu projeto, a interface `Inspecionavel` define os métodos `executarDiagnostico()` e `precisaDeManutencao()`. As classes `MeuCarro`, `Elevador` e `ServidorCloud` implementam esses métodos de acordo com suas próprias características. Assim, objetos de categorias diferentes podem ser tratados por meio do mesmo contrato, mesmo sem compartilharem a mesma superclasse.

---

## Desafios Técnicos Implementados

### Qual foi o domínio que você escolheu para seu projeto pessoal?

Escolhi o domínio de veículos, com foco na modelagem de carros e na inspeção de diferentes tipos de objetos. O projeto permite representar características de veículos, controlar seus comportamentos e demonstrar conceitos de orientação a objetos.

### Quais classes você criou?

As principais classes e interfaces são:

- `MeuCarro`: classe abstrata que representa as características e os comportamentos comuns dos carros.
- `MeuCarroEletrico`: especialização que representa um carro elétrico e possui o atributo `autonomia`.
- `MeuCarroEsportivo`: especialização que representa um carro esportivo e possui o atributo `potenciaTurbo`.
- `Motor`: representa o motor associado ao veículo.
- `Inspecionavel`: interface que define o contrato de diagnóstico e verificação de manutenção.
- `Elevador`: representa um elevador que pode ser inspecionado.
- `ServidorCloud`: representa um servidor em nuvem que pode ser inspecionado.
- `SistemaPrincipalHanin`: executa os testes de criação de objetos, associação, herança, polimorfismo e interfaces.

### Qual foi o maior desafio técnico que você enfrentou?

O maior desafio foi compreender como combinar herança, polimorfismo, classes abstratas e interfaces sem duplicar código ou comprometer a organização do projeto.

Inicialmente, cada tipo de carro poderia ter seus próprios atributos e métodos, o que aumentaria a repetição. Para resolver isso, concentrei as características comuns na classe abstrata `MeuCarro` e mantive nas subclasses somente os elementos específicos de cada tipo.

Outro desafio foi compreender como a sobrescrita permite que o mesmo método tenha comportamentos diferentes. Em `MeuCarroEletrico` e `MeuCarroEsportivo`, o método `acelerar()` possui implementações específicas, mas utiliza o comportamento comum da superclasse por meio de `super.acelerar()`.

Também aprendi que o encapsulamento não significa apenas declarar atributos como privados. É necessário controlar as operações que modificam o estado do objeto e validar os dados recebidos. Por fim, a interface `Inspecionavel` ajudou a entender como classes sem uma relação direta de herança podem implementar um mesmo contrato. Esses desafios mostraram a importância de planejar a estrutura das classes e testar diferentes situações.

---

## Conclusão

### O que você aprendeu nestas 9 aulas?

Ao longo das nove aulas, aprendi a construir classes e objetos, definir métodos, proteger atributos com encapsulamento e utilizar construtores para inicializar objetos. Também compreendi como associar classes, reutilizar código por meio de herança e implementar comportamentos específicos com polimorfismo.

A criação da classe abstrata `MeuCarro` ajudou a entender a diferença entre um modelo geral e suas especializações. Já a interface `Inspecionavel` demonstrou que diferentes tipos de objetos podem compartilhar comportamentos sem pertencer à mesma hierarquia.

Além dos conceitos técnicos, aprendi que escrever código funcional não é suficiente. É importante organizar as responsabilidades das classes, validar entradas, escolher modificadores de acesso adequados e documentar as decisões tomadas. O projeto permitiu transformar conceitos teóricos em uma implementação prática e mostrou como a orientação a objetos ajuda a organizar sistemas que podem crescer com o tempo.

### Qual conceito foi mais difícil de entender?

O conceito mais difícil foi o polimorfismo, especialmente compreender a diferença entre o tipo declarado de uma variável e o comportamento executado pelo objeto real. No início, poderia parecer que uma variável do tipo da superclasse só conseguiria executar comportamentos genéricos. Com a prática de sobrescrita e chamadas de métodos, entendi que uma referência da classe mãe pode apontar para objetos de classes filhas, permitindo que cada objeto execute sua própria implementação. Os testes com `MeuCarroEletrico` e `MeuCarroEsportivo` ajudaram a consolidar esse entendimento.

### O que você melhoraria no seu projeto se pudesse refazer?

Se pudesse refazer o projeto, melhoraria a validação dos dados em todos os construtores e métodos que modificam atributos. Também organizaria os testes para cobrir sistematicamente tanto situações válidas quanto inválidas, evitando depender apenas de mensagens impressas no console.

Outra melhoria seria separar melhor a lógica de negócio da apresentação, facilitando a manutenção e os testes. Também ampliaria a documentação UML para representar com precisão todas as classes, interfaces, associações, heranças e métodos. Por fim, organizaria os commits desde o início, com uma mensagem clara para cada aula, facilitando o acompanhamento da evolução do código e das decisões de implementação.

---

## Diagramas UML


**Diagrama de classes do FiapRide:**

<img width="4274" height="1198" alt="Class Diagram1" src="https://github.com/user-attachments/assets/f5df7730-6c58-4f62-9974-4566d87a5fa1" />

---

## Como executar o projeto

1. Clone o repositório.
2. Abra o projeto no Eclipse ou em uma IDE compatível com Java.
3. Verifique se os arquivos estão organizados nos pacotes `br.com.fiap.model` e `br.com.fiap.main`.
4. Execute a classe `Main`.
5. Confira no console os testes de criação de objetos, aceleração, herança, polimorfismo e inspeção.

O projeto utiliza Java e não exige bibliotecas externas para as classes apresentadas.

---

## Tecnologias e conceitos utilizados

- Java
- Programação Orientada a Objetos
- Encapsulamento
- Construtores
- Associação entre objetos
- Herança
- Polimorfismo
- Classes abstratas
- Interfaces
- UML com Astah
- Git e GitHub

---

**Projeto acadêmico desenvolvido para as aulas de Programação Orientada a Objetos da FIAP.**
