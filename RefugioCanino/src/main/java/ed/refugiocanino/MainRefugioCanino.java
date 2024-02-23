
package ed.refugiocanino;

public class MainRefugioCanino {

    public static void main(String[] args) {
        
        System.out.println("Bienvenido a la base de datos del refugio");
        
        // Crear una instancia del refugio
        RefugioCanino refugio = new RefugioCanino();

        // Agregar algunos perros al refugio
        refugio.agregarPerro("Max", "Labrador");
        refugio.agregarPerro("Bella", "Pastor Alemán");
        refugio.agregarPerro("Sara","Golden retriever");

        // Mostrar la lista de perros en el refugio
        System.out.println("\nLista de perros en el refugio:");
        refugio.mostrarPerros();

        // Obtener y mostrar el número de perros en el refugio
        int numeroDePerros = refugio.obtenerNumeroDePerros();
        System.out.println("\nNúmero de perros en el refugio: " + numeroDePerros);

    }
}
