package PQ.Listas;

public class ListaDoblementeEnlazada {

    Nodo primerNodo;
    Nodo ultimoNodo;

    public  void  agregar(int valor){
        Nodo nuevoNodo = new Nodo(valor);

        if (primerNodo == null){
            primerNodo = ultimoNodo = nuevoNodo;
        }else {
            ultimoNodo.siguiente = nuevoNodo;
            ultimoNodo = nuevoNodo;
        }
    }

    public void eliminar(int valor){
        if (primerNodo ==null){
            return;
        }

        if (primerNodo.valor == valor){
            primerNodo = primerNodo.siguiente;
            if (primerNodo == null){
                ultimoNodo = null;
            }
            return;
        }


        Nodo actual = primerNodo;
        Nodo anterior = null;

        while (actual != null && actual.valor != valor){
            anterior = actual;
            actual = actual.siguiente;
        }

        if (actual != null){
            anterior.siguiente = actual.siguiente;
            if (actual == ultimoNodo){
                ultimoNodo = anterior;
            }
        }
    }

    public boolean contener(int valor) {
        Nodo actual = primerNodo;
        while (actual != null) {
            if (actual.valor == valor) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public void imprimir(){
        Nodo actual = primerNodo;

        while (actual != null){
            System.out.println(actual.valor);
            actual = actual.siguiente;
        }
    }

}

