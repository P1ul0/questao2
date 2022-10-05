package Entidade;

public class Lista {
    private Node head;
    private  Node tail;

    public Lista() {
        this.head = null;
        this.tail = null;
    }
    
    public  void inserir(Pessoa novaPessoa){
        Node node = new Node(novaPessoa);
        Node p =this.head;
        if (this.head == null){
            this.head = node;
        } else{
            while (p != null){
                if (p.getChave().getId() > novaPessoa.getId()){
                    this.tail.setProx(node);
                    node.setAnt(this.tail);
                }else {
                    p.setProx(node);
                    node.setAnt(p);
                    p = node;
                }
                p = p.getProx();
            }

        }
        this.tail = node;
    }

    public void print(){
        Node l = this.head;
        while (l != null){
            System.out.println(l.getChave().getId());
            System.out.println(l.getChave().getNome());
            l = l.getProx();
        }
    }
}
