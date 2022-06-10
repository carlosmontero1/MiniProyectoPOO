package ec.edu.utpl.poo.semana8.proyecto;
import java.time.LocalDate;
public class Motorcycle {

    // atributo de clase
    static int llantas = 2;

    // atributos de instancia
    private String brand;
    private String color;
    private int year;

    // constructor

    public Motorcycle(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        if (year > 1885 && year < LocalDate.now().getYear()) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("El año de la motocycleta no puede ser antes de 1885 o mayor a este año");
        }
    }

    // sobrecarga de constructores

    public Motorcycle(String brand) {
        this.brand = brand;
    }

    public Motorcycle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public Motorcycle(String color, int year) {
        this.color = color;
        this.year = year;
    }

    public Motorcycle(int year) {
        this.year = year;
    }

    // metodos

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1885 && year < LocalDate.now().getYear()) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("El año de la motocycleta no puede ser antes de 1885 o mayor a este año");
        }
    }
}