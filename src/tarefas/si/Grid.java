/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefas.si;

/**
 *
 * @author geova
 */
public class Grid {

    int larg;
    int alt;
    int mat[][];

    public Grid(int x, int y) {
        this.larg = x;
        this.alt = y;
        this.mat = new int[larg][alt];
    }

    public void exibir() {
        int i, j;
        for (i = 0; i < alt; i++) {
            for (j = 0; j < larg; j++) {
                System.out.print(" " + mat[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public int getLarg() {
        return larg;
    }

    public void setLarg(int larg) {
        this.larg = larg;
    }

    public int getAlt() {
        return alt;
    }

    public void setAlt(int alt) {
        this.alt = alt;
    }

    public int[][] getMat() {
        return mat;
    }

    public void setMat(int[][] mat) {
        this.mat = mat;
    }

    void definirParede(int x, int y) {
        if (x > this.alt || y > this.larg || x < 0 || y < 0) {
            System.out.println("Local invalido \n");
        } else {
            this.mat[this.alt - x - 1][y] = 8;
        }
    }
    boolean verificaParedes(int x, int y){
        if(this.mat[this.alt - x - 1][y] == 8)
            return true;
        else
            return false;
    }
    void atulizaMat(int x,int y,int valor){
        System.out.println("x"+(this.alt - x - 1)+" "+y);
        this.mat[this.alt - x - 1][y] = valor;
    }
}
