[![Finalizado](https://img.shields.io/badge/Status-Conclu%C3%ADdo-brightgreen)](https://github.com/imetropoledigital/trabalho-final-matheus-costa-vidal)


<h1 align="center">DSCommerce</h1>

<p align='center'> 
    <img src="https://img.shields.io/badge/Spring_Boot  V2.7.3-F2F4F9?style=for-the-badge&logo=spring-boot"/>
    <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>  
    <img src="https://img.shields.io/badge/JWT-F2F4F9?style=for-the-badge&logo=JSON%20web%20tokens&logoColor=black"/>
    <img src="https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white"/>
</p>    



<p align="center">
  <img src="logo.png" alt="Logo DSCommerce" height="300">
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
- 🔨 [Funcionalidades](#-funcionalidades)
- 📁 [Estrutura de diretórios](#-estrutura-de-diretórios)
- 📊 [Diagrama de classes](#-diagrama-de-classes)
  - 📦 [Estrutura de pacotes](#-estrutura-de-pacotes)
- 💻 [Técnicas e tecnologias utilizadas](#-técnicas-e-tecnologias-utilizadas)
  - 🗃️ [Classes e Componentes JavaFX Utilizados](#%EF%B8%8F-classes-e-componentes-javafx-utilizados)
- 🔧 [Como executar](#-como-executar)
- 📄 [Documentação](#-documentação)
- 👥 [Autores](#-autores)

# 🧠 Modelo conceitual
- Este é o modelo conceitual do sistema DSCommerce. Considerações: Cada item de pedido (OrderItem) corresponde a um produto no pedido, com uma quantidade. Sendo que o preço também é armazenado no item de pedido por
questões de histórico (se o preço do produto mudar no futuro, o preço do item de pedido continua registrado com o preço real que foi vendido na época).

- Um usuário pode ter um ou mais "roles", que são os perfis de acesso deste usuário no sistema (client, admin).

<p align="center">
  <img src="modelo_conceitual.png" alt="Modelo conceitual">
</p>

 
# 🔨 Funcionalidades
<p align="center">
  <img src="docs/imgs/telas.png" alt="Telas do programa">
</p>

O projeto Home Manager, um aplicativo dedicado ao gerenciamento eficiente de tarefas domésticas, oferece uma série de funcionalidades para promover a organização e colaboração dentro de uma residência:

- **Cadastro de casa: 🏠** É possível criar um usuário de toda a casa, cadastrando os membros que residem;

- **Cadastro de membros: 👥** Os usuários podem criar perfis individuais, inserindo os nomes;

- **Gestão de tarefas diárias e semanais: 📅** Os membros podem cadastrar tarefas diárias e semanais, atribuindo responsabilidades específicas a cada membro da casa;

- **Distribuição justa de tarefas: ⚖️** Funcionalidade de distribuição equitativa de tarefas, garantindo que cada membro contribua de maneira justa para o funcionamento da casa. Tarefas são distribuídas aleatoriamente, levando em consideração o número de membros e a quantidade de tarefas disponíveis;

- **Acompanhamento do progresso: 📈** Os membros podem marcar as tarefas como concluídas, proporcionando uma visão clara do progresso das atividades domésticas.

- **Estatísticas visuais 📊** Gráficos e estatísticas visuais auxiliam no monitoramento do desempenho individual e coletivo;

- **Edição de lista de tarefas semanais e diárias: 📝** 
  - **Adicionar tarefas personalizadas:** Os usuários podem adicionar tarefas personalizadas à lista da casa;
  - **Remover tarefas:** Permite aos usuários remover tarefas específicas que não são mais relevantes ou necessárias;

- **Edição da lista de membros da casa: 👥** 
  - **Adicionar novos membros:** Os usuários podem adicionar novos membros à lista, inserindo seus nomes para criar perfis individuais;
  - **Remover membros** Permite remover membros que não residem mais na casa ou que não desejam mais fazer parte do grupo;

- **Reiniciar a Semana: 🔄**
  - **Resetar o progresso:** Opção para reiniciar o progresso de todas as tarefas da casa, marcando todas como "não realizadas";
  - **Limpar tarefas dos membros:** Remove todas as tarefas atribuídas aos membros, começando uma nova semana do zero;

- **Visualização de perfil individual: 👤** Oferece uma visualização personalizada para cada membro, permitindo que eles visualizem as tarefas atribuídas a si mesmos, marquem-nas como concluídas e acompanhem seu progresso por meio de uma barra de progresso.

- **Visualização geral: 👀** O aplicativo oferece uma visualização geral das tarefas, permitindo que os usuários vejam rapidamente todas as tarefas da casa;

- **Armazenamento em arquivo binário: 📁** Os dados da casa são armazenados em um arquivo binário, permitindo a recuperação dos dados para uso posterior;

- **Carregamento de arquivo binário: ⬆️** Todos os usuários são carregados partir de um arquivo binário, recuperando o estado anterior da casa;

- **Privacidade e Segurança: 🔐** Prioriza a segurança dos dados, garantindo que informações pessoais e atividades domésticas estejam protegidas.

O Home Manager é uma solução abrangente para famílias e casas compartilhadas, oferecendo uma abordagem colaborativa para o gerenciamento de responsabilidades diárias. Transforme a gestão doméstica em uma experiência organizada e eficiente com o Home Manager.

# 📁 Estrutura de diretórios
- **/docs:** Contém a documentação do projeto;
- **/imgs:** Imagens utilizada para a documentação;
- **/src:** Contém o código fonte do projeto;
  - **/application:** Contém a classe principal da aplicação;
  - **/controller:** Responsável por controladores da aplicação;
  - **/event:** Gerencia eventos para comunicação entre controladores;
  - **/model:** Contém os modelos (models) do projeto;
  - **/repository:** Repositório envolvendo operações de armazenamento e recuperação de dados;
- **/storage** Arquivo de dados salvo em binário (.dat) para recuperação;
- **.gitignore:** Arquivo do Git para ignorar arquivos no controle de versão;
- **README.md:** Documentação essencial do projeto em texto.

# 📊 Diagrama de classes
O diagrama de classes UML é uma representação visual da estrutura e das relações entre as classes em um projeto. Ele fornece uma visão geral da organização das classes, seus atributos e métodos, bem como as associações, heranças e dependências entre elas. Este diagrama é uma ferramenta poderosa para entender a arquitetura do sistema, identificar as principais entidades e suas interações, e facilitar o desenvolvimento, a manutenção e a comunicação entre os membros da equipe. Se você deseja explorar mais detalhes do diagrama de classes [clique aqui](docs/diagrama/diagrama.pdf) para ser redirecionado ao arquivo PDF correspondente.

<p align="center">
  <img src="docs/diagrama/diagrama.png" alt="Diagrama de Classes">
</p>

## 📦 Estrutura de pacotes

1. [**`Pacote "application"`**](/HomeManager/src/main/java/br/com/homemanager/application)
- `Program`: Esta classe representa o ponto de entrada do aplicativo, gerenciando a troca de telas e o início do aplicativo.

2. [**`Pacote "controller"`**](/HomeManager/src/main/java/br/com/homemanager/controller)
- `EditMemberListController`: Controlador responsável pela lógica para editar a lista de membros.
- `EditTaskListController`: Controlador para editar a lista de tarefas.
- `HomePageController`: Controlador principal que gerencia a página inicial do aplicativo.
- `LoginController`: Controlador responsável pela lógica de autenticação de usuários.
- `MemberPageController`: Controlador para a página individual de cada membro.
- `SingupController`: Controlador responsável pela lógica de cadastro de novos usuários.

3. [**`Pacote "event"`**](/HomeManager/src/main/java/br/com/homemanager/event)
- `EventManager`: Gerenciador de eventos para controlar e distribuir eventos na aplicação.
- `EditMemberListEvent`: Evento relacionado à página de edição da lista de membros.
- `EditTaskListEvent`: Evento para página de edição da lista de tarefas.
- `ShowAllTaskEvent`: Evento para exibir todas as tarefas.
- `ShowMemberButtonsEvent`: Evento para mostrar os botões dos membros.
- `UpdateHomeProgressEvent`: Evento para atualizar o progresso da página inicial.
- `UpdateProgressEvent`: Evento para atualizar o progresso do membro.

4. [**`Pacote "model"`**](/HomeManager/src/main/java/br/com/homemanager/model)
- `Home`: Classe que modela a entidade casa, gerenciando tarefas e membros.
- `Member`: Representação de um membro da casa.
- `Session`: Representa a sessão do usuário atual.
- `Task`: Classe abstrata que representa uma tarefa genérica.
- `WeeklyTask`: Representação de uma tarefa semanal.
- `DailyTask`: Representação de uma tarefa diária.

5. [**`Pacote "enums"`**](/HomeManager/src/main/java/br/com/homemanager/model/enums)
- `TaskStatus`: Enumeração que define o status das tarefas (concluído ou não concluído).

6. [**`Pacote "repository"`**](/HomeManager/src/main/java/br/com/homemanager/repository)
- `HomeRepository`: Repositório responsável pelo armazenamento e recuperação de dados da casa, incluindo membros e tarefas.

# 💻 Técnicas e tecnologias utilizadas

<div style="display: flex; flex-wrap: wrap; justify-content: center; align-items: center;">
  <img src="docs/imgs/java.png" alt="Logo Java" height="70" style="margin-right: 20px;">
  <img src="docs/imgs/javafx.png" alt="Logo javafx" height="70" style="margin-right: 20px;">
  <img src="docs/imgs/javadoc.png" alt="Logo Javadoc" height="50" style="margin-right: 20px;">
  <img src="docs/imgs/maven.png" alt="Logo Maven" height="50" style="margin-right: 20px;">
  <img src="docs/imgs/scenebuilder.png" alt="Logo SceneBuilder" height="70" style="margin-right: 20px;">
  <img src="docs/imgs/github.png" alt="Logo GitHub" height="70" style="margin-right: 20px;">
  <img src="docs/imgs/git.png" alt="Logo Git" height="70" style="margin-right: 20px;">
  <img src="docs/imgs/intellij.png" alt="Logo Inlellij" height="70" style="margin-right: 20px;">
  <img src="docs/imgs/uml.png" alt="Logo UML" height="70" style="margin-right: 20px;">
  <img src="docs/imgs/estrutura-de-dados.png" alt="Logo Estrutura de Dados" height="70" style="margin-right: 20px;">
  <img src="docs/imgs/design-patterns.png" alt="Logo Design Patterns" height="70" style="margin-right: 20px;">
  <img src="docs/imgs/persistencia-dados.png" alt="Logo Persistência de Dados" height="70" style="margin-right: 20px;">
  <img src="docs/imgs/mvc.png" alt="Logo MVC" height="70" style="margin-right: 20px;">
</div>


# 🔧 Como executar?
O aplicativo utiliza o Maven para facilitar o processo de compilação e execução. Siga as etapas abaixo para compilar e executar o projeto:

## Pré-requisitos
Certifique-se de ter o Maven instalado em seu sistema antes de prosseguir.

### Passo 1: Obtenha o código-fonte
Clone o repositório do projeto em seu ambiente local ou faça o download dos arquivos fonte em um diretório de sua escolha.

### Passo 2: Navegue para o diretório do aplicativo
Abra um terminal e navegue até o diretório raiz do projeto usando o comando cd:<br>
```
cd caminho/para/o/diretorio/do/projeto/HomeManager
```

### Passo 3: Compile e Execute o aplicativo
Execute o seguinte comando para compilar o aplicativo: <br>
```
mvn clean javafx:run
```
<br>
Isso iniciará o processo de compilação, baixando as dependências do Maven e executando o aplicativo JavaFX.

## Observações
- Certifique-se de que o arquivo pom.xml está presente no diretório raiz do projeto antes de executar o comando Maven.
- Ao finalizar a compilação, o aplicativo JavaFX será iniciado automaticamente.

## 👤 Usuário de exemplo para teste
Para facilitar os testes e a exploração do sistema, um usuário de exemplo foi criado com membros e tarefas pré-cadastrados. Use as seguintes credenciais para acessar:

- Username: familiagomes
- Password: admin

Este usuário já possui membros na lista e tarefas atribuídas. Sinta-se à vontade para explorar as funcionalidades do sistema utilizando estas credenciais de exemplo.

## Em caso de dúvidas
Se você encontrar qualquer problema ou precisar de mais informações sobre como compilar o projeto, consulte a documentação do Maven ou entre em contato com a equipe de desenvolvimento.

- O uso do Maven simplifica o processo de compilação e gestão de dependências, proporcionando uma experiência mais eficiente no desenvolvimento do projeto Home Manager.

# 📄 Documentação
Toda a documentação referente ao projeto pode ser encontrada na pasta [docs/documentação](docs/documentação). Se você deseja visualizar a documentação do código-fonte, você pode acessar essa pasta para encontrar informações detalhadas sobre classes, métodos e funcionalidades implementadas.
- Para navegar pela documentação, basta abrir o arquivo `index.html` ou outros arquivos fornecidos na pasta da documentação usando um navegador da web.

# 👥 Autores

| [<img src="https://avatars.githubusercontent.com/u/102569695?s=400&u=f20bbb53cc46ec2bae01f8d60a28492bfdccbdd5&v=4" width=115><br><sub>Matheus Vidal</sub>](https://github.com/matheusvidal21) |
| :---: |
