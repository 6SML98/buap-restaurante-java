package Clases;

public class Restaurante {

    private String nombre;
    private String direccion;
    private String telefono;
    private int capacidad;
    private boolean disponibleRestaurante;
    private Cliente cliente;
    private Empleado empleados;
    

    private static final String NOMBRE_RESTAURANTE = "SABOR BUAP";
    private static final String DIRECCION_RESTAURANTE = "Ciudad Universitaria, Avenida San Claudio";
    private static final String TELEFONO_RESTAURANTE = "2222175429";
    private static final int CAPACIDAD_MAX = 200;
    private static final boolean RESTAURANTE_ABIERTO = true;

    public Restaurante() {
        this.nombre = NOMBRE_RESTAURANTE;
        this.direccion = DIRECCION_RESTAURANTE;
        this.telefono = TELEFONO_RESTAURANTE;
        this.capacidad = CAPACIDAD_MAX;
        this.disponibleRestaurante = RESTAURANTE_ABIERTO;
    }

    public Restaurante(int capacidad, boolean disponibleRestaurante) {
        this.nombre = NOMBRE_RESTAURANTE;
        this.direccion = DIRECCION_RESTAURANTE;
        this.telefono = TELEFONO_RESTAURANTE;
        this.capacidad = capacidad;
        this.disponibleRestaurante = disponibleRestaurante;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public boolean isDisponibleRestaurante() {
        return this.disponibleRestaurante;
    }
 
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Restaurante" + "nombre=" + nombre 
                + ", direccion=" + direccion 
                + ", telefono=" + telefono 
                + ", capacidad=" + capacidad + 
                ", disponibleRestaurante=" + disponibleRestaurante + 
                ", cliente=" + cliente 
                + ", empleados=" + empleados + '}';
    }  
    public void recibirCliente(){
        System.out.println("BIENVENIDO AL RESTAURANTE PASE A LA MESA RESERVADA");
    }    
    public void capacidadLlena(){
        if(this.capacidad >= 200){
            System.out.println("Cpacidad llena de restaurante");
        }
    }
}