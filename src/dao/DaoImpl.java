
package dao;

public class DaoImpl implements IDao {
    public DaoImpl() {
    }

    public double getData() {
        System.out.println("version base de données");
        double temp = Math.random() * 40.0;
        return temp;
    }
}
