package bingo;

public class Presupuesto {
    private int presupuesto;

    public Presupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    public String comprar(int cantidad, int precio){
        
        if (this.presupuesto - (precio * cantidad) >= 0){
            this.presupuesto -= precio * cantidad;
            return "Acaba de comprar " + cantidad + " cartones.";
        }else{
            return "Dinero insuficiente.";
        }
    }
}
