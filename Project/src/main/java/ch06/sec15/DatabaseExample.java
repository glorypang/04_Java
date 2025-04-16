package ch06.sec15;

public class DatabaseExample {
    public static void main(String[] args) {
        Database db = Database.getInstance();

        String conn = db.connect();
        System.out.println("데이터베이스: " + conn);

        db.close();
    }
}