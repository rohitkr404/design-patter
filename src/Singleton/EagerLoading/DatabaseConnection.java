package Singleton.EagerLoading;

public class DatabaseConnection {
    private static DatabaseConnection dbConnection = new DatabaseConnection();

    private DatabaseConnection(){

    }

    public static DatabaseConnection getDbConnection(){
        return dbConnection;
    }
}
