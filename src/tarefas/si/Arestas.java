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
public class Arestas {
    
    Vertice []origem;
    Vertice []destino;
    String []dir;

    public Arestas(int tam){
        origem = new Vertice[tam];
        destino = new Vertice[tam];
        dir = new String[tam];
    }

    void novaArestas(Vertice origem, Vertice destino, String dir,int k) {
        this.origem[k] = origem;
        this.destino[k] = destino;
        this.dir[k] = dir;
    }

    

    /*public void inserirNo(int x) {
        int y = 0;

        if (raiz != null) {
            Vertice novo;
            Vertice aux = raiz;//noduloMedio(x, raiz);
            if (aux != null) {
            //novo = new Nodulo(x, aux);
            //if(x > aux->getValor())
                 aux->setFilhoD(novo);
                 else
                 aux->setFilhoE(novo);/
            } else {

            }
            //std::cout << "Este elemento ja foi inserido." << std::endl;
        } else {
            raiz = new Vertice("", x, y, null);
        }
    }

    public Vertice encontraNodulo(int x, Vertice nod) {
        if (nod != null) {
            /*if(x > nod->getValor())
             return encontraNodulo(x, nod->getFilhoD());
             else if(x < nod->getValor())
             return encontraNodulo(x, nod->getFilhoE());/
            return nod;
        } else {
            return null;
        }
    }*/

}
