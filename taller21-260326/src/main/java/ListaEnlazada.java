class ListaEnlazada {
    Nodo cabeza;

    public void agregar(int dato) {
        Nodo nuevo = new Nodo(dato);

   
     if (cabeza == null) {
       cabeza = nuevo;
          return;
      }
        Nodo temp = cabeza;
        while (temp.siguiente != null) {
            temp = temp.siguiente;
        }
        temp.siguiente = nuevo;
    }

    public void ordenar() {

          if (cabeza == null || cabeza.siguiente == null) {
            return;
        }

        boolean cambio;

        do {
            cambio = false;
            Nodo actual = cabeza;

            
            while (actual.siguiente != null) {
                if (actual.dato > actual.siguiente.dato) {

                    int temp = actual.dato;
                    actual.dato = actual.siguiente.dato;
                    actual.siguiente.dato = temp;

                    cambio = true;
                }
                actual = actual.siguiente;
            }

        } while (cambio);
    }

    public int suma() {
        int suma = 0;
        Nodo temp = cabeza;

       
        while (temp != null) {
            suma += temp.dato;
            temp = temp.siguiente;
        }

        return suma;
    }

    public void mostrar() {
        Nodo temp = cabeza;

        while (temp != null) {
            System.out.print(temp.dato + " ");
            temp = temp.siguiente;
        }
        System.out.println();
    }
}
