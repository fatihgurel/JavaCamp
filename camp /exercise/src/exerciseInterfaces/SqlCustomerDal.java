package exerciseInterfaces;
 
public class SqlCustomerDal implements ICustomerDal, IRepository {

    @Override
    public void add() {
        System.out.println("Sql eklendi");
    }
}
