package sac.CarvInsight.model;

public class Maq {
    
    private int id_Maq;
    private String Tipo;
    private String Brand;
    private String Model;
    private float Perfo;

    public Maq() {
    }

    public Maq(int id_Maq, String Tipo, String Brand, String Model, float Perfo) {
        this.id_Maq = id_Maq;
        this.Tipo = Tipo;
        this.Brand = Brand;
        this.Model = Model;
        this.Perfo = Perfo;
    }

    public int getId_Maq() {
        return id_Maq;
    }

    public void setId_Maq(int id_Maq) {
        this.id_Maq = id_Maq;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public float getPerfo() {
        return Perfo;
    }

    public void setPerfo(float Perfo) {
        this.Perfo = Perfo;
    }
    
    
    
}
