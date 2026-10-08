import Clases.Orden;
import java.nio.file.*;
public class ModelCheck {
 public static void main(String[] args) throws Exception {
  Files.writeString(Path.of("pedido-prueba.txt"), "Sopa,25.50\nAgua,10.00\n");
  Orden orden=new Orden("Tacos",35.50);
  if(Math.abs(orden.calcularTotal("pedido-prueba.txt")-35.50)>0.00001) throw new AssertionError("Ruta/total incorrecto");
  orden.agregarPlaillo();
  if(!Files.readString(Path.of("Orden.txt")).contains("Tacos,35.5")) throw new AssertionError("Pedido no guardado");
  System.out.println("PASS: total desde archivo solicitado y persistencia del pedido");
 }
}