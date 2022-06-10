package ec.edu.utpl.poo.semana8.proyecto;

public class Main {

    public static void main(String[] args) {

        // crear un objeto de la clase Motorcycle enviando elementos para inicializar los valores
        Motorcycle motorcycle1 = new Motorcycle("BMW", "Black", 2020);

        // mostrar datos utilizando metodos get para retornar valores
        System.out.println("Brand: " + motorcycle1.getBrand());
        System.out.println("Color: " + motorcycle1.getColor());
        System.out.println("Year: " + motorcycle1.getYear());

        System.out.println("Llantas: " + motorcycle1.llantas);

        // cambiamos el valor del año con el metodo set a un numero que no este incluido en el rango

        System.out.println("\nYear change");

        // utilizamos el metodo get para mostrar el año ingresado anterior

        System.out.println("Previous Year: \t" + motorcycle1.getYear());

        // utilizamos el metodo set para otorgar un nuevo valor a year
        motorcycle1.setYear(2010);

        // mostrar el valor modificado del objeto
        System.out.println("New Year: \t" + motorcycle1.getYear());
        
    }
}
