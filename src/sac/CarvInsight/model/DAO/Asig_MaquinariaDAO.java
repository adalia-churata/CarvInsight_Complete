package sac.CarvInsight.model.DAO;

import java.util.List;
import sac.CarvInsight.model.Asig_Maquinaria;
//import sac.CarvInsight.model.;

public interface Asig_MaquinariaDAO {
    public List<Asig_Maquinaria> findAllIncompleted();
    
    //public int insert(Asig_Maquinaria AsMaq);    
    public int updateState (int id_Asig);
    public String findTipoMac(int id_Asig);
    public String findTimeEstimate(int id_Asig);
}
