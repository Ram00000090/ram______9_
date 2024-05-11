Chat Application: Serverside and Clientside
Welcome to the Chat Application repository! This repository contains the source code for both the server-side and client-side components of a simple chat application implemented in Java. This README provides instructions on how to utilize these resources efficiently.

Overview
The chat application consists of two main components:

Serverside: This is the server-side component responsible for accepting incoming client connections, managing client interactions, and facilitating communication between multiple clients.

Clientside: This is the client-side component that allows users to connect to the server, send messages, and receive messages from other connected clients.

Getting Started
To get started with the chat application, follow these steps:

1. Clone the Repository: Clone this repository to your local machine using the following command:

git clone <repository_url>

2. Compile the Source Code: Compile both Serverside.java and Clientside.java using a Java compiler. You can use the following commands:

javac Serverside.java
javac Clientside.java

4. Run the Server: Start the server by executing the Serverside class:

5. Connect Clients: Run the Clientside class to connect clients to the server. You can run multiple instances of Clientside to simulate multiple clients connecting to the server:

java Clientside

6. Start Chatting: Once the clients are connected, follow the prompts to start the chat session. Type 'START' to initiate the chat with the server. You can type messages to send to the server, and the server will relay them to other connected clients.

End the Chat: To end the chat session, type 'STOP' at any time. This will terminate the connection between the client and the server.

Note : 
Ensure that you have Java Development Kit (JDK) installed on your system to compile and run the Java source code.
The default port used for communication is 55555. Make sure this port is available and not blocked by any firewall settings.


Contributors
Ramakotesh Ramulapenta - Creator and Maintainer
License
This project is licensed under the MIT License.
