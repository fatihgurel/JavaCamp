package exerciseInterfaces;
 
public class MySqlCustomerDal implements ICustomerDal, IRepository{

    @Override
    public void add() {
        System.out.println("MySql eklendi");
    }

}
