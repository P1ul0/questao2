import Entidade.Lista;
import Entidade.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p =new Pessoa(1,"paulo");
        Pessoa p2 =new Pessoa(2,"paulo");
        Pessoa p3 =new Pessoa(3,"paulo");
        Pessoa p4 =new Pessoa(4,"paulo");
        Lista l = new Lista();
        Lista l2 = new Lista();

        l.inserir(p3);
        l.inserir(p4);
        l.inserir(p);
        l.inserir(p2);
        l.remover(p3);
        l.print();
        l.copiarLista(l2);
        l2.print();
        l.procurar(3);
    }
}
