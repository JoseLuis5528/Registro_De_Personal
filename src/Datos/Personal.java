
package Datos;


public class Personal {
    
    // variables 
    String Nombre, ApellidoPaterno, ApellidoMaterno;
    String Proyecto,Ruta;
    byte Image;
    
    int tuno;
    // constructor

    public Personal(String Nombre, String ApellidoPaterno, String ApellidoMaterno, String Proyecto, String Ruta, byte Image, int tuno) {
        this.Nombre = Nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.Proyecto = Proyecto;
        this.Ruta = Ruta;
        this.Image = Image;
        this.tuno = tuno;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public String getProyecto() {
        return Proyecto;
    }

    public void setProyecto(String Proyecto) {
        this.Proyecto = Proyecto;
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }

    public byte getImage() {
        return Image;
    }

    public void setImage(byte Image) {
        this.Image = Image;
    }

    public int getTuno() {
        return tuno;
    }

    public void setTuno(int tuno) {
        this.tuno = tuno;
    }

    

   
}
