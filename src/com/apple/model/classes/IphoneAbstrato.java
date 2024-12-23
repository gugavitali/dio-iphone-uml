package com.apple.model.classes;

import com.apple.model.interfaces.Aparelho;
import com.apple.model.interfaces.Navegador;
import com.apple.model.interfaces.Reprodutor;

public abstract class IphoneAbstrato implements Aparelho, Navegador, Reprodutor {
    String versaoSistema;
    String cor;

    //Construtor
    public IphoneAbstrato(String versaoSistema, String cor) {
        this.versaoSistema = versaoSistema;
        this.cor = cor;
    }

    public void heyBixbi(){
        System.out.println("Fala ae chefe!");
    }

    //Aparelho
    public void ligar() {
        System.out.println("Ligando o aparelho...");
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    //Navegador
    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    //Reprodutor
    public void tocarMusica() {
        System.out.println("Reproduzindo música...");
    }

    public void pausarMusica() {
        System.out.println("Pausando música...");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }
}

