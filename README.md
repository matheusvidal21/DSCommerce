[![Finalizado](https://img.shields.io/badge/Status-Conclu%C3%ADdo-brightgreen)](https://github.com/imetropoledigital/trabalho-final-matheus-costa-vidal)

<h1 align="center">DSCommerce</h1>

<p align='center'> 
    <img src="https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot"/>
    <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>  
    <img src="https://img.shields.io/badge/JWT-F2F4F9?style=for-the-badge&logo=JSON%20web%20tokens&logoColor=black"/>
    <img src="https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white"/>
</p>    

<p align="center">
  <img src="docs/logo.png" alt="Logo DSCommerce" height="300">
</p>

# 🔍 Visão Geral
<b>O sistema deve manter um cadastro de usuário, produtos e suas categorias.</b> 
- Cada usuário possui nome, email, telefone, data de nascimento e uma senha de acesso.
- Os dados dos produtos são: nome, descrição, preço e imagem.
  
O sistema deve apresentar um catálogo de produtos, os quais podem ser filtrados pelo nome do produto. A partir desse catálogo, o usuário pode selecionar um produto para ver seus detalhes e para decidir se o adiciona a um carrinho
de compras. O usuário pode incluir e remover itens do carrinho de compra, bem como alterar as quantidades de cada item. Uma vez que o usuário decida encerrar o pedido, o pedido deve então ser salvo no sistema com o status de
"aguardando pagamento".

- Os dados de um pedido são: instante em que ele foi salvo, status, e uma lista de itens, onde cada item se refere a um produto e sua quantidade no pedido.
- O status de um pedido pode ser: aguardando pagamento, pago, enviado, entregue e cancelado.
  
Quando o usuário paga por um pedido, o instante do pagamento deve ser registrado. Os usuários do sistema podem ser clientes ou administradores, sendo que todo usuário cadastrado por padrão é cliente. Usuários não identificados podem
se cadastrar no sistema, navegar no catálogo de produtos e no carrinho de compras. Clientes podem atualizar seu cadastro no sistema, registrar pedidos e visualizar seus próprios pedidos. Usuários administradores tem acesso à área
administrativa onde pode acessar os cadastros de usuários, produtos e categorias.

<b>🖥️ Protótipos de tela:</b> [clique aqui](https://www.figma.com/file/ZrGNVNG0kZL6txDv4G8P6s/DSCommerce)

## Índice
- 🧠 [Modelo conceitual](#-modelo-conceitual)
- 📑 [Casos de Uso](#-casos-de-uso)
- 📁 [Estrutura de pacotes](#-estrutura-de-pacotes)
- 💻 [Tecnologias utilizadas](#-tecnologias-utilizadas)
- 🔧 [Como executar](#-como-executar)
- 🛠️ [Testando a API com o Postman](#%EF%B8%8F-testando-a-api-com-o-postman)
- 👥 [Autor](#-autor)

# 🧠 Modelo conceitual
- Este é o modelo conceitual do sistema DSCommerce. Considerações: Cada item de pedido (OrderItem) corresponde a um produto no pedido, com uma quantidade. Sendo que o preço também é armazenado no item de pedido por
questões de histórico (se o preço do produto mudar no futuro, o preço do item de pedido continua registrado com o preço real que foi vendido na época).

- Um usuário pode ter um ou mais "roles", que são os perfis de acesso deste usuário no sistema (client, admin).

<p align="center">
  <img src="docs/modelo_conceitual.png" alt="Modelo conceitual">
</p>

 
# 📑 Casos de Uso
O DSCommerce possui um conjunto de casos de uso que abrangem as principais funcionalidades do sistema. Eles incluem desde a navegação no catálogo de produtos até as operações administrativas.

## Visão geral
| Caso de uso | Visão geral | Acesso |
|----------|----------|----------|
| Manter produtos | CRUD de produtos, podendo filtrar itens pelo nome | Somente Admin |
| Manter categorias | CRUD de categorias, podendo filtrar itens pelo nome | Somente Admin |
| Manter usuários | CRUD de usuários, podendo filtrar itens pelo nome | Somente Admin |
| Gerenciar carrinho | Incluir e remover itens do carrinho de compras, bem como alterar as quantidades do produto em cada item | Público |
| Consultar catálogo | Listar produtos disponíveis, podendo filtrar produtos pelo nome | Público |
| Sign up | Cadastrar-se no sistema | Público |
| Login | Efetuar login no sistema | Público |
| Registrar pedido | Salvar no sistema um pedido a partir dos dados do carrinho de compras informado | Usuário logado |
| Atualizar perfil | Atualizar o próprio cadastro | Usuário logado |
| Visualizar pedidos | Visualizar os pedidos que o próprio usuário já fez | Usuário logado |
| Registrar pagamento | Salvar no sistema os dados do pagamento de um pedido | Somente Admin |
| Reportar pedidos | Relatório de pedidos, podendo ser filtrados por data | Somente Admin |

<p align="center">
  <img src="docs/caso_de_uso.png" alt="Caso de uso">
</p>

## Atores

| Ator | Responsabilidade | 
|----------|----------|
| Usuário anônimo | Pode realizar casos de uso das áreas públicas do sistema, como catálogo, carrinho de compras, login e sign up |
| Cliente | Responsável por manter seu próprios dados pessoais no sistema, e pode visualizar histórico dos seus pedidos. Todo usuário cadastrado por padrão é um Cliente | 
| Admin | Responsável por acessar a área administrativa do sistema com cadastros e relatórios. Admin também pode fazer tudo que Cliente faz | 

## Detalhamento
1. Consultar catálogo
- Atores: Usuário anônimo, Cliente, Admin
- Precondições: -
- Pós-condições: -
- Visão geral: Listar produtos disponíveis, podendo filtrar produtos pelo nome

2. Manter produtos
- Atores: Admin
- Precondições: Usuário logado
- Pós-condições: -
- Visão geral: CRUD de produtos, podendo filtrar itens pelo nome

4. Login
- Atores: Usuário anônimo
- Precondições: -
- Pós-condições: Usuário logado
- Visão geral: Efetuar login no sistema

6. Gerenciar carrinho
- Atores: Usuário anônimo
- Precondições: -
- Pós-condições: -
- Visão geral: Incluir e remover itens do carrinho de compras, bem como alterar as quantidades do produto em cada item

6. Registrar pedido
- Atores: Cliente
- Precondições: Usuário logado, Carrinho de compras não vazio
- Pós-condições: Carrinho de compras vazio
- Visão geral: Salvar no sistema um pedido a partir dos dados do carrinho de compras informado.

Para mais detalhamento dos casos de uso, consulte o documento de requisitos do sistema [clicando aqui](/docs/documento_de_requisitos.pdf).

# 📁 Estrutura de pacotes
- **/docs:** Contém a documentação do projeto;
- **/src:** Contém o código fonte do projeto;
  - **/config:** Pacote com classes de configurações;
      - **/customgrant:** Implementação de custom grant para autenticação;
  - **/controllers:** Controladores da aplicação;
      - **/handlers:** Manipuladores de requisição;
  - **/dto:** Objetos de transferência de dados (DTO);
  - **/entities:** Contém as entidades do projeto;
  - **/entities:** Contém as projeções de entidades;
  - **/repositories:** Repositórios para operações de banco de dados;
  - **/services:** Serviços da aplicação;
      - **/exceptions:** Exceções personalizadas;
- **.gitignore:** Arquivo do Git para ignorar arquivos no controle de versão;
- **README.md:** Documentação essencial do projeto em texto.

# 💻 Tecnologias utilizadas
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=Spring-Security&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=JSON%20web%20tokens)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)

# 🔧 Como executar?
Segue abaixo as instruções para executar o projeto:

## Pré-requisitos
- Certifique-se de ter o Java JDK instalado na sua máquina
- Instale o IntelliJ IDEA ou outra IDE de sua preferência para desenvolvimento Java
- É necessário ter o Maven instalado em sua máquina

### Passo 1: Clonar o Repositório
```
git clone git@github.com:matheusvidal21/DSCommerce.git
```

### Passo 2: Importar o Projeto
- Abra o Intellij IDEA ou sua IDE de preferência
- Selecione "Open" no menu e escolha o diretório do projeto clonado
- Aguarde até que o IntelliJ configure o projeto

### Passo 3: Configuração
- Verifique se todas as dependências foram carregadas corretamente pelo Maven 

### Passo 4: Execução
- Localize a classe principal da aplicação `DscommerceApplication`(localizado em src/main/java/com/devsuperior/dscommerce) e execute-a
- Ou, se preferir utilizar o Maven, você pode executar o projeto a partir da linha de comando:
```
mvn spring-boot:run
```

### Passo 5: Acesso à Aplicação
- Uma vez que a aplicação esteja em execução, você pode interagir com ela consumindo os endpoints da API. Para isso, recomenda-se o uso de ferramentas como o Postman, que permite fazer requisições HTTP de forma fácil e eficiente
- Se preferir, também é possível acessá-la através do navegador web, digitando o endereço <b> `http://localhost:8080` na barra de endereços

# 🛠️ Testando a API com o Postman
Para facilitar o teste dos endpoints da API, disponibilizei uma coleção e um ambiente (environment) no Postman contendo todas as requisições disponíveis. Siga os passos abaixo para importar a coleção e começar a testar:
1. Baixe e Instale o Postman
- Se você ainda não tem o Postman instalado, você pode baixá-lo e instalá-lo gratuitamente a partir do [site oficial](https://www.postman.com/downloads/)
2. Importe a collection e o environment
- Após instalar o Postman, faça o download da coleção que disponibilizei. Você pode encontrá-la [aqui](docs/postman/DSCommerce.postman_collection.json)
- Também faça o download do ambiente (environment) localizado [aqui](docs/postman/DSCommerce%20auth.postman_environment.json)
3. Importe no Postman
- Abra o Postman e clique no botão "File" localizado no canto superior esquerdo da interface. Em seguida, selecione a opção "Import" e depois localize os dois arquivos e selecione-os
4. Teste os Endpoints
- Agora que a coleção foi importada com sucesso, você verá todas as requisições listadas no painel esquerdo do Postman. Basta selecionar a requisição desejada e clicar em "Send" para testá-la
- Na parte superior direita do Postman, você verá um dropdown com a lista de environments. Selecione o environment recém-importado
  
Com a coleção disponível no Postman, você poderá testar facilmente todos os endpoints da sua API e garantir que ela esteja funcionando corretamente.

# 👥 Autor

| [<img src="https://avatars.githubusercontent.com/u/102569695?s=400&u=f20bbb53cc46ec2bae01f8d60a28492bfdccbdd5&v=4" width=115><br><sub>Matheus Vidal</sub>](https://github.com/matheusvidal21) |
| :---: |
