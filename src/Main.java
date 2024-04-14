//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cola cola = new Cola();

        // Agregar algunos elementos a la cola
        cola.agregar(10);
        cola.imprimir();

        cola.agregar(20);
        cola.imprimir();

        cola.agregar(30);
        cola.imprimir();

        cola.agregar(40);
        cola.imprimir();

        // Eliminar un elemento de la cola y mostrarlo
        int elementoEliminado = cola.eliminar();
        System.out.println("Elemento eliminado de la cola: " + elementoEliminado);
        cola.imprimir();

        // Agregar otro elemento a la cola
        cola.agregar(50);
        cola.imprimir();

        // Eliminar otro elemento de la cola y mostrarlo
        cola.eliminar();
        cola.imprimir();
        }
    }
