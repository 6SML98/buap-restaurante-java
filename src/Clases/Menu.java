package Clases;

public class Menu {
    private final String nombres[] = {"Hamburguesa Sensilla","Hamburguesa Doble","Hamburguesa Hawaiana",
    "Pizza Peperoni","Pizza Hawaiana","Pizza de Queso","Papas Fritas Grandes","Papas Fritas Medianas",
    "Refresco","Malteada","Agua de Sabor"};
    private final int precios[] = {36,60,45,100,130,89,25,15,18,35,12};
    private int contadores[];

    
    public Menu(){
        contadores = new int[11];
        for (int i = 0; i < 11; i++) {
            contadores[i] = 0; 
        }
    }
    
    public void HamburguesaSensilla(){
        contadores[0]++;
    }
    
    public void  HamburguesaDoble(){
        contadores[1]++;
    }
    
    public void  HamburguesaHawaiana(){
        contadores[2]++;
    }
    
    public void PizzaPeperoni(){
        contadores[3]++;
    }
    
    public void PizzaHawaiana(){
        contadores[4]++;
    }
    
    public void PizzaQueso(){
        contadores[5]++;
    }
    
    public void PapasGrandes(){
        contadores[6]++;
    }
    
    public void PapasMedianas(){
        contadores[7]++;
    }
    
    public void BebidaRefresco(){
        contadores[8]++;
    }
    
    public void BebidaMalteada(){
        contadores[9]++;
    }
    
    public void BebidaAgua(){
        contadores[10]++;
    }
    
    @Override
    public String toString(){
        String cadena = "";
        int total = 0;
        for (int i = 0; i < 11; i++) {
            if(contadores[i] != 0){
                cadena += nombres[i] + "\n " + contadores[i] + " x $" + precios[i] + ".00 = $"
                        + (contadores[i] * precios[i] + ".00\n");
                total += contadores[i] * precios[i];
            }
        }
        if(cadena.length() > 10)
            cadena += "\nTOTAL\n        $" + total + ".00";
        else
            cadena = "\n\nNo se ordeno nada";
        return cadena;
    }
}