package Clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Empleado {
    protected String nombre;
    protected String salario;
    protected String fechaNacimiento;
    protected int idEmpleado;
    protected String direccion;
    protected String numeroTel;
    protected String correoElectronico;
    protected String fechaRegistro;
    protected String puesto;
    protected String turnoLaboral;
 

    public Empleado(){
        
    }
    
    public Empleado(String nombre, String edad){
        this.nombre = nombre;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
        this.idEmpleado = generarIdAleatorio();
    }

    public Empleado(String nombre, String fechaNacimiento, String direccion, String numeroTel, String correoElectronico, String fechaRegistro) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.idEmpleado = idEmpleado;
        this.direccion = direccion;
        this.numeroTel = numeroTel;
        this.correoElectronico = correoElectronico;
        this.fechaRegistro = fechaRegistro;
        this.puesto = puesto;
        this.turnoLaboral = turnoLaboral;
    }
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public String getTurno(){
        return turnoLaboral;
    }
    public void setTurno(String turno){
        this.turnoLaboral = turno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSalario() {
        return this.salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }

   public void setFechaNacimiento(String fechaNacimiento) { // Cambio en el tipo del parámetro
        if (validarFecha(fechaNacimiento)) { // Validar la fecha antes de asignarla
            this.fechaNacimiento = fechaNacimiento;
        } else {
            throw new IllegalArgumentException("Fecha de nacimiento inválida");
        }
    }

    public int getIdEmpleado() {
        return generarIdAleatorio();
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    public String getTurnoLaboral() {
        return turnoLaboral;
    }

    public void setTurnoLaboral(String turnoLaboral) {
        this.turnoLaboral = turnoLaboral;
    }
  
    public int generarIdAleatorio() {
        Random rand = new Random();
        return rand.nextInt(1000); // Genera un número aleatorio entre 0 y 999
    }
    public static boolean validarFecha(String fecha) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false); // Para que no permita fechas inválidas
        try {
            // Intenta parsear la fecha
            Date date = dateFormat.parse(fecha);
            return true; // La fecha es válida
        } catch (ParseException e) {
            // La fecha no es válida
            return false;
        }
    }

    @Override
 
public String toString() {
    return "Empleado{" +
            "nombre=" + nombre  +
            ", fechaNacimiento=" + fechaNacimiento +
            ", numeroTel=" + numeroTel +
            ", direccion=" + direccion + 
            ", correoElectronico=" + correoElectronico + 
            ", fechaRegistro=" + fechaRegistro + 
            ", puesto=" + puesto + 
            ", idEmpleado=" + idEmpleado +
            ", Turno Laboral= " + turnoLaboral +
            ", Sueldo Semanal = $" + salario + "."+
            '}';
}


   
}
