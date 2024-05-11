//SERVER SIDE

import java.net.*;
import java.io.*;
import java.util.Scanner;
public class Server extends Thread {
count = count + 1;
temp = count;
 public void run() {
try {

Socket clientsocket = socket.accept();
System.out.println("CLIENT SOCKET" + cliensocket +  " CONNECTED SUCCESSFULLY ! ");

BufferedReader in = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
PrintWriter out = new PrintWriter(clientsocket.getOutputStream(), true);
Scanner obj = new Scanner(System.in); 
System.out.println("NOTE : TYPE STOP ON ANY MOMENT IF YUH WANT TO END THE CHAT ! ");



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
break; 
}
}
}
catch(IOException e ) {
e.printStackTrace();
}
finally{

out.close();
in.close();
clientsocket.close();
}
}

}

public class ServerSide {
static public int count = 0;
public static void main(String[] args) {
ServerSocket socket = new ServerSocket(55555);
while(true) {
    Server thread = new Server();
    thread.start();
}
}
}
 


