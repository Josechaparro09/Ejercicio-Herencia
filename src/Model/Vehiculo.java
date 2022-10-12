
package Model;

public class Vehiculo {
    
    protected String marca;
    protected String placa;
    protected boolean alquilado;

    public Vehiculo() {
        this.alquilado=false;
    }

    public Vehiculo(String marca, String placa) {
        this.alquilado = false;
        this.marca = marca;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }
    
//    public void rentar(){
//        v.alquilado=true;
//    }
//    public void devolver(){
//        this.alquilado=false;
//    }
    
    public String estado(){

        if (this.alquilado==true) {
            return "Alquilado";
        }else{
            return "No alquilado";
        }
    }
}
