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
public class Arvore {

    Nodulo raiz;

    public void Arvore() {
        this.raiz = null;
    }

    public void inserirNo(int x) {
        int y = 0;

        if (raiz != null) {
            Nodulo novo;
            Nodulo aux = raiz;//noduloMedio(x, raiz);
            if (aux != null) {
            //novo = new Nodulo(x, aux);
            /*/if(x > aux->getValor())
                 aux->setFilhoD(novo);
                 else
                 aux->setFilhoE(novo);*/
            } else {

            }
            //std::cout << "Este elemento ja foi inserido." << std::endl;
        } else {
            raiz = new Nodulo("", x, y, null);
        }
    }

    public Nodulo encontraNodulo(int x, Nodulo nod) {
        if (nod != null) {
            /*if(x > nod->getValor())
             return encontraNodulo(x, nod->getFilhoD());
             else if(x < nod->getValor())
             return encontraNodulo(x, nod->getFilhoE());*/
            return nod;
        } else {
            return null;
        }
    }

}
