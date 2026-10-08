
package Clases;

public class Mesero extends Empleado {
   private int mesasAsignadas;
   private static final int MESAS_ASIGNADAS = 4;
   private Cliente clienteOrden;

   
   public Mesero(String nombre, String edad){
       super(nombre, edad);
       this.mesasAsignadas = MESAS_ASIGNADAS;
   }
   
   public Mesero(String nombre, double salario, String edad,int mesasAsiganadas){
       super(nombre, edad);
       this.mesasAsignadas = mesasAsiganadas;
   }

    public int getMesasAsignadas() {
        return this.mesasAsignadas;
    }

    public void setMesasAsignadas(int mesasAsignadas) {
        this.mesasAsignadas = mesasAsignadas;
    }
   
    public void tomarOrden(Cliente cliente) {
        this.clienteOrden = cliente;
        System.out.println("El mesero  ha tomado la orden del cliente ");
    }
   
}