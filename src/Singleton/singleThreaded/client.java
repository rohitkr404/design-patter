package Singleton.singleThreaded;

public class client {
    public static void main(String[] args) {
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        System.out.println(dbConnection.toString());
        DatabaseConnection dbConnection1 = DatabaseConnection.getInstance();
        System.out.println(dbConnection1.toString());
    }
}
