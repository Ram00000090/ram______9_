//CLIENT SIDE

import java.net.*;
import java.io.*;
import java.util.Scanner;
public class Clientside {
public static void main(String[] args) throws IOException {
Socket socket = new Socket("localhost" , 55555);
System.out.println("SOCKET CONNECTED ! ");
PrintWriter out = new PrintWriter(socket.getOutputStream() , true);
BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
Scanner obj = new Scanner(System.in); 
System.out.println("NOTE : TYPE STOP ON ANY MOMENT IF YUH WANT TO END THE CHAT ! ");

System.out.println("DO YUH WANT TO CHAT WITH THE SERVER , IF YES : TYPE 'START' \t IF NO : TYPE 'STOP'");
String choice = obj.nextLine();
String clientmsg = "";
String servermsg = "";
System.out.println("START CHATTING ! ");
while(choice.equals("START")) {

System.out.print("ME :-  ");
clientmsg = obj.nextLine();

out.println(clientmsg);
if (clientmsg.equals("STOP")) {
break; 
}

servermsg = in.readLine();
if (servermsg.equals("STOP")) {
System.out.println("SERVER STOPPED THE CONVERSATION ! ");

break; 
}

System.out.println("SERVER :- " + servermsg); 





}
out.close();
in.close();
socket.close();
}
}




