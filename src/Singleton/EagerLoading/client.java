package Singleton.EagerLoading;


public class client {
    public static void main(String[] args) {
        DatabaseConnection dbConnection = DatabaseConnection.getDbConnection();
        System.out.println(dbConnection.toString());
        DatabaseConnection dbConnection1 = DatabaseConnection.getDbConnection();
        System.out.println(dbConnection1.toString());
    }
}
