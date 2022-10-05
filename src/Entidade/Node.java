package Entidade;

public class Node {
    private Pessoa chave ;
    private Node prox;
    private Node ant;

    public Node(Pessoa chave) {
        this.chave = chave;
        this.ant = null;
        this.prox = null;
    }

    public Pessoa getChave() {
        return chave;
    }

    public void setChave(Pessoa chave) {
        this.chave = chave;
    }

    public Node getProx() {
        return prox;
    }

    public void setProx(Node prox) {
        this.prox = prox;
    }

    public Node getAnt() {
        return ant;
    }

    public void setAnt(Node ant) {
        this.ant = ant;
    }
}
