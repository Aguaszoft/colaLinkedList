
    import java.util.LinkedList;

    public class Cola {
        private LinkedList<Integer> elementos;

        public Cola() {
            elementos = new LinkedList<Integer>();
        }

        // Método para agregar un elemento a la cola
        public void agregar(int elemento) {
            elementos.add(elemento);
            System.out.println("Se agregó el elemento " + elemento + " a la cola.");
        }

        // Método para eliminar y devolver el primer elemento de la cola
        public int eliminar() {
            if (!elementos.isEmpty()) {
                int elementoEliminado = elementos.removeFirst();
                System.out.println("Se eliminó el elemento " + elementoEliminado + " de la cola.");
                return elementoEliminado;
            } else {
                System.out.println("La cola está vacía. No se puede eliminar ningún elemento.");
                return -1;
            }
        }

        // Método para imprimir los elementos de la cola
        public void imprimir() {
            if (!elementos.isEmpty()) {
                System.out.println("Elementos en la cola:");
                for (Integer elemento : elementos) {
                    System.out.print(elemento + " ");
                }
                System.out.println();
            } else {
                System.out.println("La cola está vacía.");
            }
        }
    }

