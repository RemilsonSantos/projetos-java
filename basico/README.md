# Sistema de Controle de Estoque

## Sobre o projeto

O Sistema de Controle de Estoque é uma aplicação desenvolvida em Java com o objetivo de praticar conceitos de Programação Orientada a Objetos (POO) e lógica de programação.

O sistema permite realizar operações de gerenciamento de produtos, possibilitando cadastrar, consultar, atualizar e remover itens do estoque.

O projeto foi desenvolvido com foco no aprendizado de Java, organização de código e separação de responsabilidades entre classes.

## Funcionalidades

- [x] Cadastrar produtos.
- [x] Listar produtos cadastrados.
- [x] Buscar produtos pelo ID.
- [x] Atualizar informações dos produtos.
- [x] Remover produtos.
- [x] Adicionar quantidades ao estoque.
- [x] Retirar quantidades do estoque.
- [x] Validar disponibilidade de produtos.
- [x] Exibir informações dos produtos.

## Tecnologias utilizadas

- **Java:** linguagem utilizada no desenvolvimento.
- **ArrayList:** armazenamento e manipulação dos produtos em memória.
- **Scanner:** leitura de dados informados pelo usuário.
- **Programação Orientada a Objetos (POO):** organização e estruturação do projeto.

## Conceitos praticados

Durante o desenvolvimento, foram aplicados os seguintes conceitos:

- Classes e objetos.
- Atributos e métodos.
- Encapsulamento.
- Construtores.
- Getters e Setters.
- Estruturas condicionais.
- Estruturas de repetição.
- ArrayList.
- Métodos e separação de responsabilidades.
- Tratamento de situações inválidas por meio de validações.

## Estrutura do projeto

```text
SistemaEstoque/
│
└── src/
    ├── Produto.java
    ├── Estoque.java
    └── Main.java
```

### Responsabilidade das classes

**Produto.java**

Representa os produtos cadastrados, contendo atributos como ID, nome, preço e quantidade.

**Estoque.java**

Responsável pelo gerenciamento dos produtos, incluindo cadastro, consulta, atualização, remoção e movimentação de estoque.

**Main.java**

Classe principal responsável pela execução do programa e interação com o usuário por meio de um menu no terminal.

## Como executar o projeto

1. Clone este repositório:

```bash
git clone URL_DO_SEU_REPOSITORIO
```

2. Abra o projeto em uma IDE, como IntelliJ IDEA.

3. Execute a classe `Main.java`.

4. Utilize o menu apresentado no terminal para interagir com o sistema.

## Melhorias futuras

- [ ] Integrar o sistema com MySQL.
- [ ] Utilizar JDBC para conexão com o banco de dados.
- [ ] Implementar persistência dos produtos.
- [ ] Melhorar as validações de entrada.
- [ ] Implementar testes automatizados.
- [ ] Organizar o projeto em camadas.

## Autor

Desenvolvido por **Remilson Santos**.

[GitHub](https://github.com/RemilsonSantos) | [LinkedIn](https://www.linkedin.com/in/remilson-santos)

---

Projeto desenvolvido para fins de estudo e prática de Java e Programação Orientada a Objetos (POO).

