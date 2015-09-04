package _2_3_nio;

public class TimeServer {

	public static void main(String[] args) {
		
		int port = 8080;
		if(args != null && args.length > 0){
			try{
				port = Integer.parseInt(args[0]);
			}catch(Exception e){
				
			}
		}
		
		MultiplexerTimeServer server = new MultiplexerTimeServer(port);
		new Thread(server, "NIO-MultiplexerTimeServer-001").start();
	}
}
