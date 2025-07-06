package br.com.renan;

public class IPhone implements AparelhoEletronico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar() {
        System.out.println("Ligando IPhone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação de IPhone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz de IPhone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página no IPhone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no IPhone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no IPhone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música no IPhone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no IPhone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música no IPhone");
    }
}
