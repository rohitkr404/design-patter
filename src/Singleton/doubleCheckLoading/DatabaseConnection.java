package Singleton.doubleCheckLoading;

public class DatabaseConnection {
    private static DatabaseConnection dbConnection = null;

    private DatabaseConnection(){}

    public static DatabaseConnection getInstance(){
        if(dbConnection == null){
            synchronized (DatabaseConnection.class){
                if(dbConnection == null){
                    dbConnection = new DatabaseConnection();
                }
            }
        }
        return dbConnection;
    }
}
