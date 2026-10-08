
package Clases;
import java.util.Scanner;

public class Cajero extends Empleado {

    private boolean cajaAbierta;
    private static final boolean CAJA_DISPONIBLE = true;
    private Cliente clientePago;
    public double cambiopago;
    
    public Cajero(){
        
    }
    public Cajero(String nombre, double salario, String fechaNacimiento, int idEmpleado, int horasTrabajadas, boolean cajaAbierta) {
        super(nombre,fechaNacimiento);
        this.cajaAbierta = cajaAbierta;
    }

    public boolean isCajaAbierta() {
        return this.cajaAbierta;
    }

    public void setCajaAbierta(boolean cajaAbierta) {
        this.cajaAbierta = cajaAbierta;
    }


    public double getCambiopago() {
        return cambiopago;
    }

    public void setCambiopago(double cambiopago) {
        this.cambiopago = cambiopago;
    }

    
    public void cobrar(double totalOrden, double pagoCliente) {
      cambiopago = pagoCliente - totalOrden;
    }
}