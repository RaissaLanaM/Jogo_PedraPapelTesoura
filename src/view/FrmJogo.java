package view;

import model.Jogo;

import javax.swing.*;
import java.awt.event.*;

public class FrmJogo {
    private JPanel P1;
    private JPanel P2;
    private JPanel P3;
    private JPanel Ps;
    private JLabel JogComp;
    private JPanel panelGame;
    private JButton Num1;
    private JButton Num2;
    private JButton Num3;
    private JButton Sair;

    public Jogo jogo;

    public FrmJogo() {
        //novo jogo
        jogo = new Jogo();

        //aqui quando cada botao é apertado ele inicia um novo jogo, mostra a escolha do computador recebe a do jogador e calcula e mostra o resultado
        Num1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                jogo = new Jogo();
                JogComp.setText(jogo.getJogComp());
                jogo.getJogador(1);
                jogo.resultado();

            }
        });
        Num2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                jogo = new Jogo();
                JogComp.setText(jogo.getJogComp());
                jogo.getJogador(2);
                jogo.resultado();

            }
        });
        Num3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                jogo = new Jogo();
                JogComp.setText(jogo.getJogComp());
                jogo.getJogador(3);
                jogo.resultado();

            }
        });



            // botao sair
        Sair.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });



    }

    public JPanel getPanelGame() {
        return panelGame;
    }
}
