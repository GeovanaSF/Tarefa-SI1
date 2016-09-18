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
public class Nodulo {
    int x;
    int y;
    String dir;
    Nodulo filhoN;
    Nodulo filhoNE;
    Nodulo filhoL;
    Nodulo filhoSE;
    Nodulo filhoS;
    Nodulo filhoSO;
    Nodulo filhoO;
    Nodulo filhoNO;
    Nodulo pai;
    
    public Nodulo(){
        
    }
    
    public Nodulo(String dir,int x,int y,Nodulo p){
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.filhoN = null;
        this.filhoNE = null;
        this.filhoL = null;
        this.filhoSE = null;
        this.filhoS = null;
        this.filhoSO = null;
        this.filhoO = null;
        this.filhoNO = null;
        this.pai = p;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public Nodulo getFilhoN() {
        return filhoN;
    }

    public void setFilhoN(Nodulo filhoN) {
        this.filhoN = filhoN;
    }

    public Nodulo getFilhoNE() {
        return filhoNE;
    }

    public void setFilhoNE(Nodulo filhoNE) {
        this.filhoNE = filhoNE;
    }

    public Nodulo getFilhoL() {
        return filhoL;
    }

    public void setFilhoL(Nodulo filhoL) {
        this.filhoL = filhoL;
    }

    public Nodulo getFilhoSE() {
        return filhoSE;
    }

    public void setFilhoSE(Nodulo filhoSE) {
        this.filhoSE = filhoSE;
    }

    public Nodulo getFilhoS() {
        return filhoS;
    }

    public void setFilhoS(Nodulo filhoS) {
        this.filhoS = filhoS;
    }

    public Nodulo getFilhoSO() {
        return filhoSO;
    }

    public void setFilhoSO(Nodulo filhoSO) {
        this.filhoSO = filhoSO;
    }

    public Nodulo getFilhoO() {
        return filhoO;
    }

    public void setFilhoO(Nodulo filhoO) {
        this.filhoO = filhoO;
    }

    public Nodulo getFilhoNO() {
        return filhoNO;
    }

    public void setFilhoNO(Nodulo filhoNO) {
        this.filhoNO = filhoNO;
    }

    public Nodulo getPai() {
        return pai;
    }

    public void setPai(Nodulo pai) {
        this.pai = pai;
    }
    
    
}
