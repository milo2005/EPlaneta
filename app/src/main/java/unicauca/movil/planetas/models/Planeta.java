package unicauca.movil.planetas.models;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class Planeta {

    @Id(autoincrement = true)
    private Long id;
    private String nombre;
    private Float gravedad;

    @Generated(hash = 320809106)
    public Planeta(Long id, String nombre, Float gravedad) {
        this.id = id;
        this.nombre = nombre;
        this.gravedad = gravedad;
    }

    @Generated(hash = 1290983286)
    public Planeta() {
    }

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
