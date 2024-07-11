
package sac.CarvInsight.model;

public class Reg_UsoMaq {
    
    
    private int id_asig;
    private String date;
    private float timeWork;
    private int quantity;
    private int error;
  

    public Reg_UsoMaq() {
    }

    public Reg_UsoMaq(int id_asig, String date, float timeWork, int quantity, int error) {
        this.id_asig = id_asig;
        this.date = date;
        this.timeWork = timeWork;
        this.quantity = quantity;
        this.error = error;
    }

    public int getId_asig() {
        return id_asig;
    }

    public void setId_asig(int id_asig) {
        this.id_asig = id_asig;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(float timeWork) {
        this.timeWork = timeWork;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }
 
    
    
}
