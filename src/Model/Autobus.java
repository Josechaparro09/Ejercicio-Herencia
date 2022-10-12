
package Model;


public class Autobus extends Vehiculo{
    
    private double kInicial;
    private double kdevolucion;
    private double pKilometro;

    public Autobus() {
        this.alquilado=false;
    }

    public double getkInicial() {
        return kInicial;
    }

    public void setkInicial(double kInicial) {
        this.kInicial = kInicial;
    }

    public double getKdevolucion() {
        return kdevolucion;
    }

    public void setKdevolucion(double kdevolucion) {
        this.kdevolucion = kdevolucion;
    }

    public double getpKilometro() {
        return pKilometro;
    }

    public void setpKilometro(double pKilometro) {
        this.pKilometro = pKilometro;
    }
    
    public double calcularRenta(){
        double rTotal = this.pKilometro*(this.kdevolucion-this.kInicial);
        return rTotal;
    }
    
    public String rentar(double kInicial, double pKilometro, String marca, String placa) {
        this.marca=marca;
        this.placa=placa;
        this.kInicial = kInicial;
        this.kdevolucion = kdevolucion;
        this.pKilometro = pKilometro;
        this.alquilado=true;
        return "El vehiculo con placas " + this.placa + " ha sido rentado con exito";
    }
     
    public void devolver(double kdevolucion){
        this.alquilado=false;
        this.kdevolucion=kdevolucion;
        System.out.println("Total a pagar: " +this.calcularRenta()+ this.toString());

    }
    
    @Override
    public String toString() {
        return "\nInfo: " + 
                "\nplaca: " +this.placa +
                "\nmarca: "+this.marca+
                "\nkInicial: " + kInicial + 
                "\nkdevolucion:" + kdevolucion + 
                "\npKilometro:" + pKilometro;
    }
 
}
