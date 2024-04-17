package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {
    public DaoImpl2() {
    }

    public double getData() {
        System.out.println("Version Capteurs");
        double temp = 80.0;
        return temp;
    }
}