package gomez.martinez.guevara.recycle;

public class Lugar {
    String foto, nombre;

    public Lugar(String foto, String nombre) {
        this.foto = foto;
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
