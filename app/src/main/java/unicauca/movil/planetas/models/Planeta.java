package unicauca.movil.planetas.models;

public class Planeta {

    private Long id;
    private String nombre;
    private Float gravedad;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getGravedad() {
        return gravedad;
    }

    public void setGravedad(Float gravedad) {
        this.gravedad = gravedad;
    }
}
