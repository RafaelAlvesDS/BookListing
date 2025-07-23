# Book Listing App 📚

Uma aplicação Android desenvolvida durante o curso de **Android Basics Nanodegree** da **Udacity**. Este app permite aos usuários pesquisar livros utilizando a API do Google Books e visualizar os resultados em uma lista organizada.

## 📱 Funcionalidades

- **Pesquisa de Livros**: Digite o nome de um livro ou autor para encontrar resultados relevantes
- **Lista de Resultados**: Visualize os livros encontrados com título e autores
- **Integração com Google Books API**: Busca em tempo real no vasto catálogo do Google Books
- **Acesso Direto**: Toque em qualquer livro para abrir mais detalhes no navegador
- **Feedback Visual**: Indicadores de carregamento e mensagens de estado
- **Verificação de Conectividade**: Alerta quando não há conexão com a internet

## 🛠️ Tecnologias Utilizadas

- **Linguagem**: Java
- **IDE**: Android Studio
- **SDK Target**: API 26 (Android 8.0)
- **SDK Mínimo**: API 16 (Android 4.1)
- **Networking**: HttpURLConnection
- **JSON Parsing**: JSONObject e JSONArray nativos
- **Background Tasks**: AsyncTaskLoader
- **UI Components**: ListView, Custom Adapter

## 📋 Componentes Principais

### Classes Java

- **`BookActivity.java`**: Activity principal que gerencia a interface do usuário e as operações de pesquisa
- **`Book.java`**: Classe modelo que representa um livro com título, autores e URL
- **`BookAdapter.java`**: Adapter customizado para exibir a lista de livros
- **`BookLoader.java`**: AsyncTaskLoader para realizar requisições de rede em background
- **`QueryUtils.java`**: Classe utilitária para operações de rede e parsing de JSON

### Recursos

- **Layout responsivo** com barra de pesquisa e lista de resultados
- **Ícones personalizados** para botão de pesquisa
- **Strings localizáveis** para mensagens de feedback
- **Temas consistentes** com Material Design

## 🚀 Como Executar

### Pré-requisitos

- Android Studio (versão 3.0 ou superior)
- SDK Android (API 26)
- Dispositivo Android ou Emulador (API 16+)
- Conexão com a internet

### Passos para Execução

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/RafaelAlvesDS/BookListing.git
   ```

2. **Abra o projeto no Android Studio**:
   - File → Open
   - Selecione a pasta do projeto

3. **Sincronize as dependências**:
   - O Android Studio irá sincronizar automaticamente
   - Aguarde o processo de build finalizar

4. **Execute o aplicativo**:
   - Conecte um dispositivo Android ou inicie um emulador
   - Clique em "Run" (▶️) ou pressione `Shift + F10`

## 📖 Como Usar

1. **Abra o aplicativo** no seu dispositivo
2. **Digite sua pesquisa** na barra superior (ex: "Harry Potter", "Stephen King")
3. **Toque no ícone de pesquisa** (🔍) para iniciar a busca
4. **Navegue pelos resultados** na lista abaixo
5. **Toque em qualquer livro** para abrir mais detalhes no navegador

## 🌐 API Utilizada

Este projeto consome a **Google Books API v1**:
- **Endpoint**: `https://www.googleapis.com/books/v1/volumes`
- **Parâmetros**: 
  - `q`: termo de pesquisa
  - `maxResults`: limitado a 10 resultados por busca
- **Documentação**: [Google Books API](https://developers.google.com/books/docs/v1/using)

## 📚 Conceitos Aprendidos

Durante o desenvolvimento deste projeto, foram aplicados os seguintes conceitos do curso da Udacity:

- ✅ **Networking**: HTTP requests com HttpURLConnection
- ✅ **JSON Parsing**: Manipulação de dados JSON
- ✅ **AsyncTask/Loaders**: Operações assíncronas para não bloquear a UI
- ✅ **ListView & Adapters**: Exibição de listas dinâmicas
- ✅ **Intent System**: Navegação entre apps
- ✅ **Permissions**: Gerenciamento de permissões de internet
- ✅ **Error Handling**: Tratamento de erros de rede e conectividade
- ✅ **User Experience**: Feedback visual e estados da aplicação

## 🔧 Estrutura do Projeto

```
app/src/main/
├── java/com/android/rafael/booklisting1/
│   ├── BookActivity.java          # Activity principal
│   ├── Book.java                  # Modelo de dados
│   ├── BookAdapter.java           # Adapter da ListView
│   ├── BookLoader.java           # AsyncTaskLoader
│   └── QueryUtils.java           # Utilitários de rede
├── res/
│   ├── layout/
│   │   ├── activity_book.xml     # Layout principal
│   │   └── book_list_item.xml    # Layout do item da lista
│   ├── values/
│   │   ├── strings.xml           # Strings da aplicação
│   │   ├── colors.xml            # Cores do tema
│   │   └── styles.xml            # Estilos
│   └── drawable/
│       └── ic_search_black_24dp.xml  # Ícone de pesquisa
└── AndroidManifest.xml           # Configurações da app
```

## 🎯 Próximas Melhorias

- [ ] Implementar paginação para mais resultados
- [ ] Adicionar filtros de pesquisa (categoria, data, etc.)
- [ ] Melhorar o design com Material Design Components
- [ ] Adicionar funcionalidade de favoritos
- [ ] Implementar pesquisa offline com banco de dados
- [ ] Adicionar testes unitários e de integração

## 👨‍💻 Autor

Desenvolvido por **Rafael Alves** durante o curso Android Basics Nanodegree da Udacity.

## 📄 Licença

Este projeto foi desenvolvido para fins educacionais como parte do curso da Udacity.

---

*Este projeto faz parte da jornada de aprendizado em desenvolvimento Android. Contribuições e sugestões são bem-vindas!* 🚀
