package sac.CarvInsight.model;


public class OEEGraphic extends Reg_UsoMaq{
   
    
    private int perfr_maq;
    private float planned_time;

    public OEEGraphic() {
    }

    public OEEGraphic(int perfr_maq, float planned_time, int id_asig, String date, float timeWork, int quantity, int error) {
        super(id_asig, date, timeWork, quantity, error);
        this.perfr_maq = perfr_maq;
        this.planned_time = planned_time;
    }

    public int getPerfr_maq() {
        return perfr_maq;
    }

    public void setPerfr_maq(int perfr_maq) {
        this.perfr_maq = perfr_maq;
    }

    public float getPlanned_time() {
        return planned_time;
    }

    public void setPlanned_time(float planned_time) {
        this.planned_time = planned_time;
    }

    
    
}
