package Entidade;

public class Lista {
    private Node head;
    private  Node tail;

    public Lista() {
        this.head = null;
        this.tail = null;
    }

    public void procurar(int id){
        Node p = this.head;
        boolean check = false;
        while (p != null){
            if (p.getValue().getId() == id) {
                check = true;
                break;
            }
            p = p.getProx();
        }
        if (check){
            System.out.println(p.getValue().getNome());
        }else {
            System.out.println("usuario não encontrado");
        }
    }

    
    public  void inserir(Pessoa novaPessoa){
        Node node = new Node(novaPessoa);
        Node p =this.head;
        if (this.head == null){
            this.head = node;
            this.tail = node;
        } else{
            while (p != null){
                if (p.getValue().getId() > novaPessoa.getId()){
                    if(this.head.equals(p)){
                        node.setProx(this.head);
                        this.head.setAnt(node);
                        this.head = node;
                    }else {

                        node.setProx(p);
                        p.setAnt(node);

                    }
                    break;
                }else if (this.tail.equals(p) && node.getValue().getId() > p.getValue().getId()){
                    this.tail.setProx(node);
                    node.setAnt(this.tail);
                    this.tail = node;
                    break;
                }
                p = p.getProx();
            }
        }
    }

    public void remover(Pessoa removerPessoa){
        Node p = this.head;
        while (p != null){
            if (p.getValue().equals(removerPessoa)){
                if (p.equals(this.head)){
                    this.head = p.getProx();
                    this.head.setAnt(null);
                } else if (p.equals(this.tail)) {
                    this.tail = p.getAnt();
                    this.tail.setProx(null);
                } else {
                    p.getProx().setAnt(p.getAnt());
                    p.getAnt().setProx(p.getProx());
                }
            }
            p = p.getProx();
        }
    }

    public void copiarLista(Lista lista){
        Node p = this.head;
        while (p != null){
            lista.inserir(p.getValue());
            p = p.getProx();
        }

    }


    public void print(){
        Node l = this.head;
        while (l != null){
            System.out.println(l.getValue().getId());
            System.out.println(l.getValue().getNome());
            l = l.getProx();
        }
    }
}
