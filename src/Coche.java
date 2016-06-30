import java.util.Comparator;

public class Coche implements Comparable<Coche> { // este "implements" permite hacer el "compareTo"

    private Long id;
    private String marca;
    private String modelo;
    private Integer anyo;
    private String matricula;


    public Coche(Long id, String marca, String modelo, Integer anyo, String matricula) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anyo = anyo;
        this.matricula = matricula;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnyo() {
        return anyo;
    }

    public void setAnyo(Integer anyo) {
        this.anyo = anyo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anyo=" + anyo +
                ", matricula='" + matricula + '\'' +
                "}" + System.lineSeparator();
    }


    public int compareTo(Coche coche) { // Método que per

        return (this.matricula.compareTo(coche.matricula));


    }

}

// ORDENAR LOS COCHES POR AÑO
class CompararCochePorAnyo implements Comparator<Coche> {

    @Override
    public int compare(Coche coche, Coche otroCoche) {

        if (coche.getAnyo() > otroCoche.getAnyo()) {

            return 1;

        } else if (coche.getAnyo() < otroCoche.getAnyo()) {

            return -1;

        } else {

            return 0;

        }

    }

}
