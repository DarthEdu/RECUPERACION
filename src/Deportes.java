import java.util.Scanner;
//Clase Padre
class NombreDeportista {
    String nombre;

    NombreDeportista(String nombre){
        this.nombre = nombre;
    }

    String getNombre(){
        return nombre;
    }
    void setNombre(){
        nombre = "Desconocido";
    }
    void mostrarNombre(){
        System.out.println("Nombre: "+nombre);
    }
}

//Clase Hija 1

class EdadDeportista extends NombreDeportista{
    int edad;
    EdadDeportista(String nombre, int edad) {
        super(nombre);
        this.edad = edad;
    }

    int getEdad(){
        return edad;
    }
    void setEdad(){
        edad = 0;
    }
    void mostrarEdad(){
        System.out.println("Edad: "+edad);
    }
    void evaluarEdad(){
        if(edad < 18){
            System.out.println("El atleta no cumple con la edad requerida");
        }else{
            System.out.println("El atleta cumple con la edad requerida");
        }
    }
}

//Clase Hija 2
class Aptitud extends EdadDeportista{
    String aptitud;
    int sanciones, examenes;
    Aptitud(String nombre, int edad, String aptitud, int sanciones, int examenes){
        super(nombre, edad);
        this.aptitud = aptitud;
        this.sanciones = sanciones;
        this.examenes = examenes;
    }
    String getAptitud(){
        return aptitud;
    }
    void setAptitud(){
        aptitud="Desconocida";
    }
    void mostrarAptitud(){
        System.out.println("Aptitud: "+aptitud);
    }
    void evaluarAptitud(){
        if(aptitud == "A"){
            System.out.println("La aptitud del atleta es perfecta");
        }else{
            System.out.println("El atleta no cumple con la aptitud requerida");
        }
    }
    void Aceptacion(){
        if(sanciones == 2 && examenes == 2023){
            System.out.println("Usted ha sido registrado");
        }else{
            System.out.println("No ha sido registrado");
        }
    }
}

//Clase principal
public class Deportes{

    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del atleta:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la edad del atleta:");
        int edad = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over
        System.out.println("Ingrese la aptitud del atleta:");
        String aptitud = scanner.nextLine();
        System.out.println("Usted ha tenido sanciones? 1.Si 2.No: ");
        int sanciones = scanner.nextInt();
        System.out.println("De que año son sus examenes medicos:  ");
        int examenes = scanner.nextInt();

        try {
            Aptitud p1 = new Aptitud(nombre, edad, aptitud, sanciones, examenes);
            p1.mostrarNombre();
            p1.mostrarEdad();
            p1.mostrarAptitud();
            p1.evaluarEdad();
            p1.evaluarAptitud();
            p1.Aceptacion();
        } catch (Exception e) {
            System.out.println("Se produjo un error: " + e.getMessage());
        }
    }
}

