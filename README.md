# Book Listing

App Android de busca de livros, feito no Android Basics Nanodegree da Udacity. Você digita um título ou autor, ele consulta a API do Google Books e mostra a lista com título e autores. Tocar em um livro abre a página dele no navegador.

A busca só roda com conexão, e o app avisa quando não há rede.

## Como é feito

- `BookActivity`: tela única, com o campo de busca e a lista.
- `QueryUtils`: monta a requisição para `googleapis.com/books/v1/volumes`, faz a chamada HTTP e lê o JSON.
- `BookLoader`: um `AsyncTaskLoader`, para a consulta rodar fora da thread principal.
- `Book` e `BookAdapter`: o modelo e o adaptador da lista.

## Rodar

Abra no Android Studio e rode em um emulador ou aparelho. O `minSdk` é 16 e o `targetSdk`, 26.
