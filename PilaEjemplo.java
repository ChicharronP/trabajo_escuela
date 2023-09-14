import java.util.Stack;

public class PilaEjemplo {
    public static void main(String[] args) {
        // Creamos una pila de enteros utilizando la clase Stack de Java
        Stack<Integer> pila = new Stack<>();

        // Insertamos elementos en la pila utilizando el método push
        pila.push(1);
        pila.push(2);
        pila.push(3);

        // Mostramos los elementos de la pila en la consola
        System.out.println("Elementos de la pila: " + pila);

        // Obtenemos y mostramos el tamaño de la pila utilizando el método size
        System.out.println("Tamaño de la pila: " + pila.size());

        // Obtenemos y mostramos el elemento en la cima de la pila sin eliminarlo utilizando el método peek
        System.out.println("Elemento en la cima de la pila: " + pila.peek());

        // Eliminamos elementos de la pila y los mostramos en la consola utilizando el método pop
        System.out.println("Eliminando elementos de la pila:");
        while (!pila.isEmpty()) {
            int elementoEliminado = pila.pop();
            System.out.println("Elemento eliminado: " + elementoEliminado);
        }
    }
}
