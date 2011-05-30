/**
 * 
 */
package executeurCodeAdistance;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * @author excilys
 * 
 */
public class Slave extends Thread {

	private List<Serializable> executables;

	private ServerSocket server;

	public static void main(String argv[]) throws Exception {
		new Slave();
	}

	public Slave() throws Exception {
		executables = new ArrayList<Serializable>();
		server = new ServerSocket(3000);
		System.out.println("Server listening on port 3000.");
		this.start();
	}

	public void run() {
		while (true) {
			try {
				System.out.println("Waiting for connections.");
				Socket client = server.accept();
				System.out.println("Accepted a connection from: " + client.getInetAddress());
				Connect c = new Connect(client);
				c.run();
			} catch (Exception e) {
			}
		}
	}
}

class Connect extends Thread {
	private Socket client = null;
	private ObjectInputStream ois = null;

	public Connect() {
	}

	public Connect(Socket clientSocket) {
		client = clientSocket;
		try {
			ois = new ObjectInputStream(client.getInputStream());
		} catch (Exception e1) {
			try {
				client.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			return;
		}
		this.start();
	}

	public void run() {
		try {
			ois.close();
			client.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
