package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl() {
    }

    public double calcul() {
        double tmp = this.dao.getData();
        return tmp * 540.0 / Math.cos(tmp * Math.PI);
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}