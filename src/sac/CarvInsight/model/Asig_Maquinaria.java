
package sac.CarvInsight.model;


public class Asig_Maquinaria {
    
    private int id_asig;
    private int state;
    private float time_estimade;
    private String date_plann;
    private String id_prod;
    private String id_maq;
    private String description;

    public Asig_Maquinaria() {
    }

    public Asig_Maquinaria(int id_asig, int state, float time_estimade, String date_plann, String id_prod, String id_maq, String description) {
        this.id_asig = id_asig;
        this.state = state;
        this.time_estimade = time_estimade;
        this.date_plann = date_plann;
        this.id_prod = id_prod;
        this.id_maq = id_maq;
        this.description = description;
    }



    public int getId_asig() {
        return id_asig;
    }

    public void setId_asig(int id_asig) {
        this.id_asig = id_asig;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public float getTime_estimade() {
        return time_estimade;
    }

    public void setTime_estimade(float time_estimade) {
        this.time_estimade = time_estimade;
    }

    public String getDate_plann() {
        return date_plann;
    }

    public void setDate_plann(String date_plann) {
        this.date_plann = date_plann;
    }

    public String getId_prod() {
        return id_prod;
    }

    public void setId_prod(String id_prod) {
        this.id_prod = id_prod;
    }

    public String getId_maq() {
        return id_maq;
    }

    public void setId_maq(String id_maq) {
        this.id_maq = id_maq;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object[] getDatosForTable(){
        Object[] datos = {id_asig,id_maq,id_prod,description};
        return datos;
    }
            
    
}
