/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefas.si;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 *
 * @author geova
 */
public class Agente {

    int x;
    int y;
    int custo = 0;

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

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public Agente() {
    }

    public Agente(int x, int y, Grid g) {
        inicializa(x, y, g);
    }

    void inicializa(int x, int y, Grid g) {
        if (!podeIr(x, y, g)) {
            System.out.println("Posicao invalida!");
        } else {
            this.x = x;
            this.y = y;
            g.mat[g.alt - x - 1][y] = 1;
        }
    }

    void ir(int a, int b, Grid g) {
        if (!podeIr(a, b, g)) {
            System.out.println("Movimento invalido!");
        } else {
            this.x = a;
            this.y = b;
            g.atulizaMat(a, b, 1);
            //g.mat[g.alt - a - 1][b] = 1;
        }
    }

    void ir(String D, Grid g) {
        int x, y;
        if (D.compareTo("N") == 0) {
            x = this.x + 1;
            this.x = x;
            y = this.y;
            if (!podeIr(x, y, g)) {
                System.out.println("Movimento invalido!");
            } else {
                System.out.println("N");
                g.atulizaMat(this.x, this.y, 1);
                g.atulizaMat(this.x - 1, this.y, 0);
            }
        } else if (D.compareTo("NE") == 0) {
            x = this.x + 1;
            this.x = x;
            y = this.y + 1;
            this.y = y;
            if (!podeIr(x, y, g)) {
                System.out.println("Movimento invalido!\n");
            } else {
                g.atulizaMat(this.x, this.y, 1);
                g.atulizaMat(this.x - 1, this.y - 1, 0);
            }
        } else if (D.compareTo("L") == 0) {
            y = this.y + 1;
            this.y = y;
            x = this.x;
            if (!podeIr(x, y, g)) {
                System.out.println("Movimento invalido!\n");
            } else {
                g.atulizaMat(this.x, this.y, 1);
                g.atulizaMat(this.x, this.y - 1, 0);
            }
        } else if (D.compareTo("SE") == 0) {
            x = this.x - 1;
            this.x = x;
            y = this.y + 1;
            this.y = y;
            System.out.println("x" + x + "y" + y);
            if (!podeIr(x, y, g)) {
                System.out.println("Movimento invalido!\n");
            } else {
                g.atulizaMat(x, y, 1);
                g.atulizaMat(x + 1, y - 1, 0);
            }
        } else if (D.compareTo("S") == 0) {
            x = this.x - 1;
            this.x = x;
            y = this.y;
            if (!podeIr(x, y, g)) {
                System.out.println("Movimento invalido!\n");
            } else {
                g.atulizaMat(x, y, 1);
                g.atulizaMat(x + 1, y, 0);
            }
        } else if (D.compareTo("SO") == 0) {
            x = this.x - 1;
            this.x = x;
            y = this.y - 1;
            this.y = y;
            if (!podeIr(x, y, g)) {
                System.out.println("Movimento invalido!\n");
            } else {
                g.atulizaMat(x, y, 1);
                g.atulizaMat(x + 1, y + 1, 0);
            }
        } else if (D.compareTo("O") == 0) {
            y = this.y - 1;
            this.y = y;
            x = this.x;
            if (!podeIr(x, y, g)) {
                System.out.println("Movimento invalido!\n");
            } else {
                g.atulizaMat(x, y, 1);
                g.atulizaMat(x, y + 1, 0);
            }
        } else if (D.compareTo("NO") == 0) {
            x = this.x + 1;
            this.x = x;
            y = this.y - 1;
            this.y = y;
            if (!podeIr(x, y, g)) {
                System.out.println("Movimento invalido!\n");
            } else {
                g.atulizaMat(x, y, 1);
                g.atulizaMat(x - 1, y + 1, 0);
            }
        }
    }

    boolean irN(int x, int y, Grid g) {
        if (!podeIr(x + 1, y, g)) {
            //cout<<"Movimento invalido!\n";
            return false;
        } else {
            //cout<<"Pode ir\n";
            return true;
        }
    }

    boolean irNE(int x, int y, Grid g) {
        if (!podeIr(x + 1, y + 1, g)) {
            //cout<<"Movimento invalido!\n";
            return false;
        } else {
            //cout<<"Pode ir\n";
            return true;
        }
    }

    boolean irL(int x, int y, Grid g) {
        if (!podeIr(x, y + 1, g)) {
            //cout<<"Movimento invalido!\n";
            return false;
        } else {
            //cout<<"Pode ir\n";
            return true;
        }
    }

    boolean irSE(int x, int y, Grid g) {
        if (!podeIr(x - 1, y + 1, g)) {
            //cout<<"Movimento invalido!\n";
            return false;
        } else {
            //cout<<"Pode ir\n";
            return true;
        }
    }

    boolean irS(int x, int y, Grid g) {
        if (!podeIr(x - 1, y, g)) {
            //cout<<"Movimento invalido!\n";
            return false;
        } else {
            //cout<<"Pode ir\n";
            return true;
        }
    }

    boolean irSO(int x, int y, Grid g) {
        if (!podeIr(x - 1, y - 1, g)) {
            //cout<<"Movimento invalido!\n";
            return false;
        } else {
            //cout<<"Pode ir\n";
            return true;
        }
    }

    boolean irO(int x, int y, Grid g) {
        if (!podeIr(x, y - 1, g)) {
            //cout<<"Movimento invalido!\n";
            return false;
        } else {
            //cout<<"Pode ir\n";
            return true;
        }
    }

    boolean irNO(int x, int y, Grid g) {
        if (!podeIr(x + 1, y - 1, g)) {
            //cout<<"Movimento invalido!\n";
            return false;
        } else {
            //cout<<"Pode ir\n";
            return true;
        }
    }

    void lerPos() {
        System.out.println("O objeto esta em x=" + this.x + " e y=" + this.y);
    }

    boolean podeIr(int a, int b, Grid g) {
        if (a > g.alt - 1 || b > g.larg - 1 || a < 0 || b < 0) {
            return false;
        } else if (g.verificaParedes(a, b)) {
            return false;
        } else {
            return true;
        }
    }

    String[] acoes(Grid g) {//Procura vetor de direções para ir ao objetivo
        String[] acoes = new String[100];
        int[][] jaVis = new int[2][100];
        int i = 0;
        int k = 0;
        int a = this.x;
        int b = this.y;
        Grid g1 = g;
        Agente ag1 = new Agente(this.x, this.y, g1);
        if (ag1.testeObjetivo(7, 8)) {
            System.out.println("Está no objetivo");
        } else {
            while (!ag1.testeObjetivo(7, 8)) {
                if (ag1.irN(a, b, g) && ag1.buscaNo(jaVis, a + 1, b)) {
                    a = ag1.x + 1;
                    ag1.x = a;
                    b = ag1.y;
                    jaVis[0][k] = a;
                    jaVis[1][k] = b;
                    acoes[i] = "N";
                    k++;
                    i++;
                } else if (ag1.irNE(a, b, g) && ag1.buscaNo(jaVis, a + 1, b + 1)) {
                    a = ag1.x + 1;
                    ag1.x = a;
                    b = ag1.y + 1;
                    this.y = y;
                    jaVis[0][k] = a;
                    jaVis[1][k] = b;
                    acoes[i] = "NE";
                    k++;
                    i++;
                } else if (ag1.irL(a, b, g) && ag1.buscaNo(jaVis, a, b + 1)) {
                    b = ag1.y + 1;
                    ag1.y = b;
                    a = ag1.x;
                    jaVis[0][k] = a;
                    jaVis[1][k] = b;
                    acoes[i] = "L";
                    k++;
                    i++;
                } else if (ag1.irSE(a, b, g) && ag1.buscaNo(jaVis, a - 1, b + 1)) {
                    a = ag1.x - 1;
                    ag1.x = a;
                    b = ag1.y + 1;
                    ag1.y = b;
                    jaVis[0][k] = a;
                    jaVis[1][k] = b;
                    acoes[i] = "SE";
                    k++;
                    i++;
                } else if (ag1.irS(a, b, g) && ag1.buscaNo(jaVis, a - 1, b)) {
                    a = ag1.x - 1;
                    ag1.x = a;
                    b = ag1.y;
                    jaVis[0][k] = a;
                    jaVis[1][k] = b;
                    acoes[i] = "S";
                    k++;
                    i++;
                } else if (ag1.irSO(a, b, g) && ag1.buscaNo(jaVis, a - 1, b - 1)) {
                    a = ag1.x - 1;
                    ag1.x = a;
                    b = ag1.y - 1;
                    ag1.y = b;
                    jaVis[0][k] = a;
                    jaVis[1][k] = b;
                    acoes[i] = "SO";
                    k++;
                    i++;
                } else if (ag1.irO(a, b, g) && ag1.buscaNo(jaVis, a, b - 1)) {
                    b = ag1.y - 1;
                    ag1.y = b;
                    a = ag1.x;
                    jaVis[0][k] = a;
                    jaVis[1][k] = b;
                    acoes[i] = "O";
                    k++;
                    i++;
                } else if (ag1.irNO(a, b, g) && ag1.buscaNo(jaVis, a + 1, b - 1)) {
                    a = ag1.x + 1;
                    ag1.x = a;
                    b = ag1.y - 1;
                    ag1.y = b;
                    jaVis[0][k] = a;
                    jaVis[1][k] = b;
                    acoes[i] = "NO";
                    i++;
                    k++;
                }

            }
        }
        //ag1.lerPos();

        return acoes;
    }

    void acaoSuc(int a, int b, String D, Grid g) {
        int x, y;
        //Grid g1 = new Grid(10,10);
        if (D.compareTo("N") == 0) {
            x = a + 1;
            y = b;
            if (!podeIr(x, y, g)) {
                System.out.println("Movimento invalido!");
            } else {
                System.out.println("x=" + x + "y=" + y);
                //g1.atulizaMat(x, y, 5);//pra onde vai
                //g1.atulizaMat(a, b, 4);//oonde esta
            }
        } else if (D.compareTo("NE") == 0) {
            x = a + 1;
            y = b + 1;
            if (!podeIr(x, y, g)) {
                System.out.println("Movimento invalido!\n");
            } else {
                System.out.println("x=" + x + "y=" + y);
            }
        } else if (D.compareTo("L") == 0) {
            y = b + 1;
            x = a;
            if (!podeIr(x, y, g)) {
                System.out.println("Movimento invalido!\n");
            } else {
                System.out.println("x=" + x + "y=" + y);
            }
        } else if (D.compareTo("SE") == 0) {
            x = a - 1;
            y = b + 1;
            System.out.println("x" + x + "y" + y);
            if (!podeIr(x, y, g)) {
                System.out.println("Movimento invalido!\n");
            } else {
                System.out.println("x=" + x + "y=" + y);
            }
        } else if (D.compareTo("S") == 0) {
            x = a - 1;
            y = b;
            if (!podeIr(x, y, g)) {
                System.out.println("Movimento invalido!\n");
            } else {
                System.out.println("x=" + x + "y=" + y);
            }
        } else if (D.compareTo("SO") == 0) {
            x = a - 1;
            y = b - 1;
            this.y = y;
            if (!podeIr(x, y, g)) {
                System.out.println("Movimento invalido!\n");
            } else {
                System.out.println("x=" + x + "y=" + y);
            }
        } else if (D.compareTo("O") == 0) {
            y = b - 1;
            x = a;
            if (!podeIr(x, y, g)) {
                System.out.println("Movimento invalido!\n");
            } else {
                System.out.println("x=" + x + "y=" + y);
            }
        } else if (D.compareTo("NO") == 0) {
            x = a + 1;
            y = b - 1;
            if (!podeIr(x, y, g)) {
                System.out.println("Movimento invalido!\n");
            } else {
                System.out.println("x=" + x + "y=" + y);
            }
        }
        //g1.exibir();
    }

    boolean buscaNo(int mat[][], int x, int y) {
        for (int i = 0; i < 100; i++) {
            if (mat[0][i] == x && mat[1][i] == y) {
                return false;
            }
        }
        return true;
    }
    
    void seguirAcoes(String[] acoes,Grid g){
        int i=0;
        while(acoes[i]!=null){
            ir(acoes[i],g);
            custo++;
            i++;
        }
    }
    
    void exibirAcoes(String[] acoes){
        int i=0;
        while(acoes[i]!=null){
            System.out.print(acoes[i]+" ");
            i++;
        }
        System.out.println("\n");
    }

    void acoesT(Nodulo raiz, int xg, int yg, Grid g1) {
        Nodulo prox, aux, inicio;
        Arvore ar = new Arvore();
        int[][] jaVis = new int[2][100];
        int i, j, k = 0;
        int a = this.x;
        int b = this.y;
        prox = new Nodulo();
        boolean cont = true;
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 100; j++) {
                jaVis[i][j] = -1;
            }
        }
        while (custo != 3)//forçando parada pq ta infinito
        {
            //prox = new Nodulo();
            if (irN(a, b, g1) && buscaNo(jaVis, a + 1, b)) {
                prox = new Nodulo("N", a + 1, b, ar.raiz);
                a = prox.x;
                b = prox.y;
                jaVis[0][k] = a + 1;
                jaVis[1][k] = b;
                k++;
            } else if (irNE(a, b, g1) && buscaNo(jaVis, a + 1, b + 1)) {
                prox = new Nodulo("NE", a + 1, b + 1, ar.raiz);
                a = prox.x;
                b = prox.y;
                jaVis[0][k] = a + 1;
                jaVis[1][k] = b + 1;
                k++;
            } else if (irL(a, b, g1) && buscaNo(jaVis, a, b + 1)) {
                prox = new Nodulo("S", a, b + 1, ar.raiz);
                a = prox.x;
                b = prox.y;
                jaVis[0][k] = a;
                jaVis[1][k] = b + 1;
                k++;
            } else if (irSE(a, b, g1) && buscaNo(jaVis, a - 1, b + 1)) {
                prox = new Nodulo("SE", a - 1, b + 1, ar.raiz);
                a = prox.x;
                b = prox.y;
                jaVis[0][k] = a - 1;
                jaVis[1][k] = b + 1;
                k++;
            } else if (irS(a, b, g1) && buscaNo(jaVis, a - 1, b)) {
                prox = new Nodulo("S", a - 1, b, ar.raiz);
                a = prox.x;
                b = prox.y;
                jaVis[0][k] = a - 1;
                jaVis[1][k] = b;
                k++;
            } else if (irSO(a, b, g1) && buscaNo(jaVis, a - 1, b - 1)) {
                prox = new Nodulo("SO", a - 1, b - 1, ar.raiz);
                a = prox.x;
                b = prox.y;
                jaVis[0][k] = a - 1;
                jaVis[1][k] = b - 1;
                k++;
            } else if (irO(a, b, g1) && buscaNo(jaVis, a, b - 1)) {
                prox = new Nodulo("O", a, b - 1, ar.raiz);
                a = prox.x;
                b = prox.y;
                jaVis[0][k] = a;
                jaVis[1][k] = b - 1;
                k++;
            } else if (irNO(a, b, g1) && buscaNo(jaVis, a + 1, b - 1)) {
                prox = new Nodulo("NO", a + 1, b - 1, ar.raiz);
                a = prox.x;
                b = prox.y;
                jaVis[0][k] = a + 1;
                jaVis[1][k] = b - 1;
                k++;
            }

            if (testeObjetivo(prox.x, prox.y)) {
                cont = false;
            }

            retornaCaminho(prox);
        }

        retornaCaminho(prox);
    }

    void retornaCaminho(Nodulo prox) {
        Nodulo aux = new Nodulo();
        while (prox.pai != null) {
            System.out.println("Ir para " + prox.dir);
            aux = prox.pai;
            prox = aux;
        }
    }

    boolean testeObjetivo(int xg, int yg) {
        if (xg != this.x || yg != this.y) {
            return false;
        } else {
            return true;
        }
    }

//offline - testa para onde pode ir, guarda as direções e a partir delas faz de novo a busca
//criar uma estrutura de dados para isso, com os estados e buscando o estado objetivo
    void irDirecaoX(int dg, int dgy, Grid g1) {
        while (!testeObjetivo(dg, dgy) && this.x != dg && this.y != dgy) {
            lerPos();
            if (podeIr(x + 1, y, g1)) {
                //cout<<"N\n";
                g1.mat[g1.alt - x - 1][y] = 0;
                ir(x + 1, y, g1);
                custo++;
            } else if (podeIr(x + 1, y + 1, g1)) {
                //cout<<"NE\n";
                g1.mat[g1.alt - x - 1][y] = 0;
                ir(x + 1, y + 1, g1);
                custo++;
            } else if (podeIr(x, y + 1, g1)) {
                //cout<<"E\n";
                g1.mat[g1.alt - x - 1][y] = 0;
                ir(x, y + 1, g1);
                custo++;
            } else if (podeIr(x - 1, y + 1, g1)) {
                //cout<<"SE\n";
                g1.mat[g1.alt - x - 1][y] = 0;
                ir(x - 1, y + 1, g1);
                custo++;
            } else if (podeIr(x - 1, y, g1)) {
                //cout<<"S\n";
                g1.mat[g1.alt - x - 1][y] = 0;
                ir(x - 1, y, g1);
                custo++;
            } else if (podeIr(x - 1, y - 1, g1)) {
                //cout<<"SO\n";
                g1.mat[g1.alt - x - 1][y] = 0;
                ir(x - 1, y - 1, g1);
                custo++;
            } else if (podeIr(x, y - 1, g1)) {
                //cout<<"O\n";
                g1.mat[g1.alt - x - 1][y] = 0;
                ir(x, y - 1, g1);
                custo++;
            } else if (podeIr(x + 1, y - 1, g1)) {
                //cout<<"NO\n";
                g1.mat[g1.alt - x - 1][y] = 0;
                ir(x + 1, y - 1, g1);
                custo++;
            }
        }
    }

    void irDirecaoY(int dg, Grid g1) {
        while (!testeObjetivo(7, 8))//this->y!=dg)
        {
            lerPos();
            if (podeIr(x, y + 1, g1)) {
                //cout<<"E\n";
                g1.mat[g1.alt - x - 1][y] = 0;
                ir(x, y + 1, g1);
                custo++;
            } else if (podeIr(x, y - 1, g1)) {
                //cout<<"O\n";
                g1.mat[g1.alt - x - 1][y] = 0;
                ir(x, y - 1, g1);
                custo++;
            } else if (podeIr(x + 1, y - 1, g1)) {
                //cout<<"NO\n";
                g1.mat[g1.alt - x - 1][y] = 0;
                ir(x + 1, y - 1, g1);
                custo++;
            } else if (podeIr(x - 1, y - 1, g1)) {
                //cout<<"SO\n";
                g1.mat[g1.alt - x - 1][y] = 0;
                ir(x - 1, y - 1, g1);
                custo++;
            } else if (podeIr(x - 1, y + 1, g1)) {
                //cout<<"SE\n";
                g1.mat[g1.alt - x - 1][y] = 0;
                ir(x - 1, y + 1, g1);
                custo++;
            }
        }
    }

}
