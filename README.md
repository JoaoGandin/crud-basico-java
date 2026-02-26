# 📦 CRUD Básico em Java (In-Memory)

Um sistema simples de gerenciamento de produtos desenvolvido em Java, focado na aplicação de boas práticas de Programação Orientada a Objetos (POO) e arquitetura em camadas.

## 🎯 Objetivo do Projeto
Este projeto foi construído para solidificar os conceitos fundamentais de Java e POO antes da implementação de bancos de dados relacionais (JDBC/MySQL). Os dados são gerenciados de forma volátil (na memória da aplicação) utilizando coleções do Java.

## 🛠️ Tecnologias Utilizadas
* **Java:** Linguagem principal do projeto.
* **Coleções (ArrayList):** Para o armazenamento em memória.
* **BigDecimal:** Utilizado para representar os preços dos produtos, garantindo precisão em operações financeiras e evitando problemas de arredondamento.

## ⚙️ Arquitetura e Boas Práticas
O projeto foi estruturado separando as responsabilidades para facilitar a manutenção e escalabilidade:

* **`model`:** Contém a classe `Produto`, representando o domínio do negócio.
* **`service`:** Contém a classe `ProdutoService`, responsável pela regra de negócio e manipulação da lista de dados.
* **Encapsulamento Defensivo:** O método de listagem retorna uma cópia da lista original (`new ArrayList<>(produtos)`), protegendo a integridade dos dados internos do serviço contra modificações externas acidentais.
* **Lógica Funcional:** Utilização de métodos modernos do Java, como `removeIf` (se você usou), para operações seguras nas coleções.

## 🚀 Funcionalidades (CRUD)
- [x] **Create:** Adição de novos produtos garantindo que não haja IDs duplicados.
- [x] **Read:** Listagem de todos os produtos cadastrados de forma segura.
- [x] **Update:** Atualização do preço de um produto existente buscando pelo seu ID.
- [x] **Delete:** Remoção de um produto da lista através do seu ID.
