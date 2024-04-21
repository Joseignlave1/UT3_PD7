public class Conjunto<T> implements ILista<T> , IConjunto<T>{

    private Nodo<T> primero;

    public Conjunto() {
        primero = null;
    }

    @Override
    public Nodo<T> GetPrimero() {
        return this.primero;
    }
    @Override
    public void insertar(T dato, Comparable clave) {
        Nodo<T> nuevoNodo = new Nodo<T>(clave, dato);
        if(primero == null) { //Si la lista no tiene elementos
            primero = new Nodo<T>(clave,dato);
        } else {
            Nodo<T> actual = primero;
            while(actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);// Cuándo se encuentra un nodo en la lista que sea null
            // indica que estamos en el último nodo de la lista
            // entonces ese nodo pasa a apuntar al nuevo nodo, y ese nuevo nodo
            // pasa a apuntar a null;
        }
    }

    @Override
    public T buscar(Comparable clave) {
        if(primero == null) { //No tiene elementos
            return null;
        } else {
            Nodo<T> actual = primero;
            while(actual != null) {
                if(actual.getEtiqueta().compareTo(clave) == 0) {
                    return actual.getDato();
                }
                actual = actual.getSiguiente();
            }
            return null;
        }
    }

    @Override
    public boolean eliminar(Comparable clave) {
        if(primero == null) { //Caso lista vacia
            return false;
        }
        Nodo<T>  actual = primero;
        Nodo<T> anterior = null;

        while(actual != null) {
            if(actual.getEtiqueta().compareTo(clave) == 0) { //Encuentro un match
                if(anterior == null) { //Caso en el que el nodo a eliminar es el prim de la lista.
                    primero = actual.getSiguiente();
                } else {
                    anterior.setSiguiente(actual.getSiguiente());
                }
                return true;
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }

        return false;
    }

    @Override
    public String imprimir() {
        Nodo<T> actual = primero;
        while(actual != null) {
            System.out.println(actual.getEtiqueta().toString());
            actual = actual.getSiguiente();
        }
        return "";
    }


    @Override
    public String imprimirConSeparador(String separador) {
        Nodo<T> actual = primero;
        while(actual != null) {
            System.out.print(actual.getEtiqueta().toString() + separador);
            actual = actual.getSiguiente();
        }
        return null;
    }

    @Override
    public int cantElementos() {
        int contador = 0;
        Nodo<T> actual = primero;
        while (actual != null) {
            actual = actual.getSiguiente();
            contador++;
        }
        return contador;
    }

    @Override
    public boolean esVacia() {
        return primero == null;
    }


    @Override
    public IConjunto<T> union(IConjunto<T> otroConjunto) {
        Nodo<T> actual = primero;
        Nodo<T> otroConjuntoNodo = otroConjunto.GetPrimero();

        IConjunto<T> conjuntoFinal = new Conjunto<>();
            while(actual != null) {
                if(conjuntoFinal.buscar(actual.getEtiqueta()) == null){
                    conjuntoFinal.insertar(actual.getDato(), actual.getEtiqueta());
                }
                actual = actual.getSiguiente();
            }
            while(otroConjuntoNodo != null) {
                if(conjuntoFinal.buscar(otroConjuntoNodo.getEtiqueta()) == null) {
                    conjuntoFinal.insertar(otroConjuntoNodo.getDato(), otroConjuntoNodo.getEtiqueta());
                }
                otroConjuntoNodo = otroConjuntoNodo.getSiguiente();
            }

            return conjuntoFinal;
    }

    @Override
    public IConjunto<T> interseccion(IConjunto<T> otroConjunto) {
        Nodo<T> actual = primero;
        Nodo<T> otroConjuntoNodo = otroConjunto.GetPrimero();

        IConjunto<T> conjuntoFinal = new Conjunto<>();
        while(actual != null && otroConjuntoNodo != null) {
                if(actual.getEtiqueta().compareTo(otroConjuntoNodo.getEtiqueta()) == 0) {
                        conjuntoFinal.insertar(actual.getDato(), actual.getEtiqueta());
                }
            actual = actual.getSiguiente();
            otroConjuntoNodo = otroConjuntoNodo.getSiguiente();
        }
        return conjuntoFinal;
    }
}
