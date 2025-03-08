package dao;

public class DaoImp implements IDao {
    public DaoImp() {
    }

    @Override
    public double getData() {
        System.out.println("Data base!");
        return 12.12;
    }
}
