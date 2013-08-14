package apprentice;

import java.net.UnknownHostException;

public class Test {
	public static void main(String[] args) throws UnknownHostException{
		
		System.out.println(java.net.InetAddress.getLocalHost().getHostName());
	}
}
