
package Datos;

/**
 *
 * @authorJose Luis Rodriguez Elicerio
 */
public class Personal2 {

    private int Nomina;
    private String Nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private int Turno;
    private Object Ruta;
    byte Imagen;

    public Personal2() {
    }

    public Personal2(int Nomina, String Nombre, String ApellidoPaterno, String ApellidoMaterno,int Turno, byte Imagen, Object Ruta) {
        this.Nomina = Nomina;
        this.Nombre = Nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.Turno=Turno;
        this.Ruta=Ruta;
        this.Imagen=Imagen;
    }

    /**
     * @return the Nomina
     */
    public int getNomina() {
        return Nomina;
    }

    /**
     * @param Nomina the Nomina to set
     */
    public void setNomina(int Nomina) {
        this.Nomina = Nomina;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the ApellidoPaterno
     */
    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    /**
     * @param ApellidoPaterno the ApellidoPaterno to set
     */
    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    /**
     * @return the ApellidoMaterno
     */
    public String  getApellidoMaterno() {
        return ApellidoMaterno;
    }

    /**
     * @param ApellidoMaterno the ApellidoMaterno to set
     */
    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    
    /**
     * @return the ApellidoMaterno
     */
    public int getTurno() {
        return Turno;
    }

    /**
     * @param Turno the Turno to set
     */
    public void setTurno(int Turno) {
        this.Turno = Turno;
    }
     /**
     * @return the Ruta
     */
    public Object getRuta() {
        return Ruta;
    }

    /**
     * @param Ruta the Ruta to set
     */
    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }
    
    
       /**
     * @return the Imagen
     */
    public byte getImagen() {
        return Imagen;
    }

    /**
     * @param Imagen the Imagen to set
     */
    public void setRuta(byte Imagen) {
        this.Imagen = Imagen;
    }
    
    
    
    
    @Override
    public String toString() {
        return this.Nombre;
    }

}
