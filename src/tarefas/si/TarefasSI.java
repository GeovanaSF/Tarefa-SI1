/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefas.si;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author geova
 */
public class TarefasSI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dir,acoes[];
        int x, y, rs;
        Scanner dados = new Scanner(System.in);
        /*System.out.println("Entre com a altura da matriz");
        x = dados.nextInt();
        System.out.println("Entre com a largura da matriz");
        y = dados.nextInt();*/
        x = 10;
        y = 10;
        Grid g = new Grid(x, y);
        Agente ag = new Agente();
        ag.inicializa(0, 0, g);
        acoes = new String[100];
        int op = 0;
        while (op != 9) {
            System.out.println("Escolha uma opção:\n1-Adicionar paredes\n2-Deslocar objeto"
                    + "\n3-Ler posicao atual\n4-Exibir Grid\n5-Procurar ações"
                    + "\n6-Ir para objetivo"
                    + "\n7-Testar objetivo\n8-Função Sucessora"
                    + "\n9-Encerrar");
            op = dados.nextInt();
            switch (op) {
                case 1://Adicionar paredes
                    rs = 1;
                    while (rs != 0 & rs == 1) {
                        System.out.println("Entre com as coordenadas da parede ");
                        x = dados.nextInt();
                        y = dados.nextInt();
                        System.out.print("x" + x + "y" + y);
                        g.definirParede(x, y);

                        System.out.println("Deseja continuar? 1 - Sim 2 - Não");
                        rs = dados.nextInt();
                        if (rs != 1 & rs != 2) {
                            System.out.println("Comando invalido!");
                        }
                    }
                    break;
                case 2://Deslocar o agente em uma direção
                    System.out.println("Entre com a direcao de movimento (N, NE, L, SE, S, SO, O, NO)");
                    dir = dados.next();
                    //System.out.println(dir);
                    ag.ir(dir,g);
                    g.exibir();
                    break;
                case 3://Retorna a posiçao atual do agente
                    ag.lerPos();
                    break;
                case 4://Exibe o grid
                    g.exibir();
                    break;
                case 5://Procura vetor de direções para ir ao objetivo
                    acoes=ag.acoes(g);
                    System.out.println("Encontrou um caminho");
                    ag.exibirAcoes(acoes);
                    break;
                case 6://Desloca o agente de acordo com as direções encontradas em 5
                    ag.seguirAcoes(acoes,g);
                    g.exibir();
                    System.out.println("Custo total: "+ag.custo);
                    break;
                case 7://Testa se o o agente está no obejtivo final 
                    if(ag.testeObjetivo(7, 8)){
                        System.out.println("Está no objetivo");
                    }else{
                        System.out.println("Não está no objetivo");
                    }
                    break;
                case 8://Retorna o estado que iria de acordo com a direção
                    System.out.println("Digite as coordenadas e uma direção (N, NE, L, SE, S, SO, O, NO)");
                    x = dados.nextInt();
                    y = dados.nextInt();
                    dir = dados.next();
                    ag.acaoSuc(x, y, dir, g);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

    }

}
