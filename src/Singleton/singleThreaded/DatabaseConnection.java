package Singleton.singleThreaded;

public class DatabaseConnection {
    private static DatabaseConnection dbConnection = null;
    private DatabaseConnection(){
    }

    public static DatabaseConnection getInstance(){
        if(dbConnection == null){
            dbConnection = new DatabaseConnection();
        }
        return dbConnection;
    }
}
