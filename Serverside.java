//SERVER SIDE

import java.net.*;
import java.io.*;
import java.util.Scanner;
class Server extends Thread {
   private int temp;
   private ServerSocket socket;
   private Socket clientsocket;
   private BufferedReader in;
   private PrintWriter out;

    Server( ServerSocket socket) {
        
        
        this.socket = socket;

        
       try {  clientsocket = socket.accept();
        Serverside.count = Serverside.count + 1;
        temp = Serverside.count;
        in = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
        out = new PrintWriter(clientsocket.getOutputStream(), true);
       }
       catch (Exception e)
 {
e.printStackTrace();

 }    }

 public void run() {

try {


System.out.println("CLIENT SOCKET" + clientsocket +  " CONNECTED SUCCESSFULLY ! ");

Scanner obj = new Scanner(System.in); 



String clientmsg = "";
String servermsg = "";
System.out.println("START CHATTING ! ");
while(true) {
 clientmsg = in.readLine();
if (clientmsg.equals("STOP")) {
System.out.println("CLIENT" + temp + " STOPPED THE CONVERSATION ! ");
break; 
}

System.out.println("CLIENT" + temp + ":-  " + clientmsg); 

System.out.print("TO CLIENT" + temp +" :-  ");
servermsg = obj.nextLine();
out.println(servermsg);
if (servermsg.equals("STOP")) {
Serverside.count = Serverside.count - 1;
break; 
}
}
out.close();
in.close();
clientsocket.close();

}
catch(IOException e ) {
e.printStackTrace();
}


}

}

public class Serverside  {

static public int count = 0;

static Object obj = new Object();
public static void main(String[] args) throws IOException {
   
ServerSocket  socket = new ServerSocket(55555);
System.out.println("NOTE : TYPE STOP ON ANY MOMENT IF YUH WANT TO END THE CHAT ! ");
while(true) { 
    
    Server thread = new Server(socket);
    thread.start();
}



}
}
 


