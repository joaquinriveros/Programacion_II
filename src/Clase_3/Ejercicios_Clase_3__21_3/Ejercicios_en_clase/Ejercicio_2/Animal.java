package Ejercicios_Clase_3.Ejercicios_Clase_3__21_3.Ejercicios_en_clase.Ejercicio_2;

public abstract class Animal {
    private String foto;
    private String comida;
    private String localizacion;
    private String tamanio;
    //Constructor
    public Animal(){}

    public Animal(String foto, String comida, String localizacion, String tamanio) {
        this.foto = foto;
        this.comida = comida;
        this.localizacion = localizacion;
        this.tamanio = tamanio;
    }
    //Getter y Setter

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    //Metodos
    public abstract void HacerRuido();
    public abstract void Comer();
    public void Dormir(){
        System.out.println("El animal duerme");
    }
    public abstract void Rugir();
}
