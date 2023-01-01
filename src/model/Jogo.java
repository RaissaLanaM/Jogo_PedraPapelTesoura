package model;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Jogo {

    //variaveis
    private int pedra;
    private int papel;
    private int tesoura;
    int computador;
    private int jogador;
    String mensagem;
    private String JogComp;


    //get set
    public void getJogador(int jogador) {
        this.jogador = jogador;
    }
    public String getMensagem() {
        mensagem = "";
        return mensagem;
    }
    public int setComputador() {
        Random jogada = new Random();
        computador = jogada.nextInt(4);
        return computador;
    }

    public String getJogComp() {
        return JogComp;
    }

    public void setJogComp(String jogComp) {
        JogComp = jogComp;
    }

    //chama o jogo e roda um numero aleatorio para ser a jogada do computador
    public Jogo() {
        setComputador();
        resultado();
    }

    //lógica do jogo, possibilidades
    public void resultado() {
        boolean vencedor = false;

        //possibilidades
        if (computador == 1 && jogador == 1) {
            mensagem = "EMPATE";
            vencedor = true;
        } else if (computador == 2 && jogador == 2) {
            mensagem = "EMPATE";
            vencedor = true;
        }else if (computador == 3 && jogador == 3) {
            mensagem = "EMPATE";
            vencedor = true;
        }else if (computador == 1 && jogador == 2) {
            mensagem = "PAPEL GANHOU!! PARABENS JOGADOR!!!";
            vencedor = true;
        } else if (computador == 1 && jogador == 3) {
            mensagem = "PEDRA GANHOU!! QUE PENA VOCE PERDEU :(";
            vencedor = true;
        }  else if (computador == 2 && jogador == 1) {
            mensagem = "PAPEL GANHOU!! QUE PENA VOCE PERDEU :( ";
            vencedor = true;
        } else if (computador == 2 && jogador == 3) {
            mensagem = "TESOURA GANHOU!! PARABENS JOGADOR!!! ";
            vencedor = true;
        }  else if (computador == 3 && jogador == 1) {
            mensagem = "PEDRA GANHOU!! PARABENS JOGADOR!!!";
            vencedor = true;
        } else if (computador == 3 && jogador == 2) {
            mensagem = "TESOURA GANHOU!! QUE PENA VOCE PERDEU :(";
            vencedor = true;
        }

        //nome da jogada do computador
        if (computador == 1){
           setJogComp("Pedra");
        } else if (computador == 2) {
            setJogComp("Papel");
        } else if (computador == 3){
            setJogComp("Tesoura");
        }

        //mensagem do resultado
        if (vencedor){
            JOptionPane.showMessageDialog(null,
                    mensagem,
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);

        }


    }

}
