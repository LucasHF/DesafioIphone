# Desafio Iphone
Projeto para implementar uma estrutura de classes e interfaces que mostrem a novidade do Iphone quando lançado. Toda a implementação é feita de acordo com o  seguinte diagrama de classes:

```mermaid
classDiagram
    

    class ReprodutorMusical{
        <<interface>>
        +selecionarMusica(String musica)
        +tocar()
        +pausar()
    }

    class AparelhoTelefonico{
        <<interface>>
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet{
        <<interface>>
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    Ipod --> ReprodutorMusical
    Telefone --> AparelhoTelefonico
    Safari --> NavegadorInternet
    
    Iphone --> ReprodutorMusical
    Iphone --> AparelhoTelefonico
    Iphone --> NavegadorInternet
```
