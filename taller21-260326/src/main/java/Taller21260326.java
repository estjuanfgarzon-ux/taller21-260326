import java.util.Scanner;
public class Taller21260326 {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamaño:");
        int n = sc.nextInt();

        ListaEnlazada lista = new ListaEnlazada();

        System.out.println("Ingrese " + (n - 1) + " numeros (falta uno):");

    
        for (int i = 0; i < n - 1; i++) {
            lista.agregar(sc.nextInt());
        }

        System.out.println("Lista original:");
        lista.mostrar();

        lista.ordenar();

        System.out.println("Lista ordenada:");
        lista.mostrar();

        int sumaLista = lista.suma();

        
        int esperado = n * (n + 1)/2;

        
        int faltante = sumaLista - esperado;

       
        System.out.println("El numero faltante es: " + sumaLista);
    }
}