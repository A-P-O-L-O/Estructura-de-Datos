package PQ.Listas;

public class Index {
    public static void main(String[] args) {

        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();

        lista.agregar(35);
        lista.agregar(769);
        lista.agregar(8876);
        lista.agregar(554326);

        System.out.println("-----LISTA ORIGINAL-----");
        lista.imprimir();

        lista.eliminar(769);
        System.out.println("-----LISTA DESPUES DE ELIMINAR-----");
        lista.imprimir();


        System.out.println("LA LISTA CONTIENE EL NUMERO  35?: " + lista.contener(35));

    }
}
