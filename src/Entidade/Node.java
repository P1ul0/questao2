package Entidade;

public class Node {
    private Pessoa value;
    private Node prox;
    private Node ant;

    public Node(Pessoa chave) {
        this.value = chave;
        this.ant = null;
        this.prox = null;
    }

    public Pessoa getValue() {
        return value;
    }

    public void setValue(Pessoa value) {
        this.value = value;
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
