package OOP_2_3_Odev._14_AbstractDemo;

public class SqlServerDatabaseManager extends BaseDatabaseManager{

    @Override
    public void getData() {
        System.out.println("Veri getirildi : SQL Server");
    }
}
