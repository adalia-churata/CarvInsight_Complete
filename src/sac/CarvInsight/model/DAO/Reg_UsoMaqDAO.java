package sac.CarvInsight.model.DAO;

import java.util.List;
import sac.CarvInsight.model.OEEGraphic;
import sac.CarvInsight.model.Reg_UsoMaq;

public interface Reg_UsoMaqDAO {
    public  List<OEEGraphic> findToDay(int id_maq);
    public List<OEEGraphic> findToWeek(int id_maq, String Date);
    public List<OEEGraphic> findToProduction(int id_maq, int prod);
    public int insert(Reg_UsoMaq RgUso);
}
