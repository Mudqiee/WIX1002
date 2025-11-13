// Create  a  class  Connection. The  Connection  class  keeps  track  of  the  number  of 
// connections to the server. Whenever an object is created, a connection is established. 
// The  class  has  a  disconnect  method  and  a  display  method  that  display  the  number  of 
// connections to the server. 

class Connection {

    private static int connectionCount = 0;

    public Connection() {
        connectionCount++;
        System.out.println("Connection established. (" + connectionCount + " total)");
    }

    public void disconnect() {
        connectionCount--;
        System.out.println("Connection terminated. (" + connectionCount + " total)");
    }

    public static void display() {
        System.out.println("SERVER STATUS: Total active connections: " + connectionCount);
    }
}

public class T8Q5 {
    public static void main(String[] args) {
        Connection.display();

        Connection c1 = new Connection(); 
        Connection.display();

        Connection c2 = new Connection(); 
        Connection.display(); 

        c1.disconnect(); 
        Connection.display(); 

        c2.disconnect(); 
        Connection.display();
    }
}

