import Entidade.Lista;
import Entidade.Node;
import Entidade.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p =new Pessoa(1,"paulo");
        Pessoa p2 =new Pessoa(3,"paulo");
        Pessoa p3 =new Pessoa(2,"paulo");
        Pessoa p4 =new Pessoa(4,"paulo");
        Lista l = new Lista();
        l.inserir(p);
        l.inserir(p2);
        l.inserir(p3);
        l.inserir(p4);
        l.print();
    }
}
