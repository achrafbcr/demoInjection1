package ext;

import dao.IDao;

public class DaoImplVWS implements IDao {
    public DaoImplVWS() {
    }

    public double getData() {
        System.out.println("Version web service");
        return 90.0;
    }
}
