package tuto8;

public class Q5 {

    public static void main(String[] args) {
        Connection.display(); // 0
        Connection c1 = new Connection();
        Connection.display(); // 1
        Connection c2 = new Connection();
        Connection.display(); // 2
        c1.disconnect();
        Connection.display(); // 1
        c2.disconnect();
        Connection.display(); // 0
    }
}

class Connection {

    private static int connectionNumber = 0;

    public Connection() {
        connectionNumber++;
    }

    public void disconnect() {
        connectionNumber--;
    }

    public static void display() {
        System.out.println("Number of connections: " + connectionNumber);
    }
}