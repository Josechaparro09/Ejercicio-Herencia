
package Model;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Tractor extends Vehiculo{
    
    private Date fRenta;
    private Date fDevolucion;
    private double pDia;

    public Tractor() {
        this.alquilado=false;
    }

    public Date getfRenta() {
        return fRenta;
    }

    public void setfRenta(Date fRenta) {
        this.fRenta = fRenta;
    }

    public Date getfDevolucion() {
        return fDevolucion;
    }

    public void setfDevolucion(Date fDevolucion) {
        this.fDevolucion = fDevolucion;
    }

    public double getpDia() {
        return pDia;
    }

    public void setpDia(double pDia) {
        this.pDia = pDia;
    }

    public long calDias(){
        TimeUnit unidad = TimeUnit.DAYS;
        long dias = (this.fDevolucion.getTime()-this.fRenta.getTime());
        dias = unidad.convert(dias, TimeUnit.MILLISECONDS);
        return dias;
    }
    
    public void rentar(Date fRenta, double pDia, String marca, String placa) {
        this.marca=marca;
        this.placa=placa;
        this.fRenta = fRenta;
        this.pDia = pDia;
    }
    
    public void devolver(Date fDevolucion){
        this.fDevolucion=fDevolucion;
         System.out.println("Total a pagar: " +this.calDias()*this.pDia+ this.toString() + "\nDias rentados: " + this.calDias());
    }
    
    @Override
    public String toString() {
        return "\nInfo: " + 
                "\nplaca: "+this.placa+
                "\nmarca: "+this.marca+
                "\nfRenta: " + fRenta + 
                "\nfDevolucion:" + fDevolucion + 
                "\npDia:" + pDia;
    }

}
