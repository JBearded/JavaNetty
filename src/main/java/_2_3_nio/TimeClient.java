package _2_3_nio;

public class TimeClient {

	public static void main(String[] args) {
		
		int port = 8080;
		if(args != null && args.length > 0){
			try{
				port = Integer.parseInt(args[0]);
			}catch(Exception e){
				
			}
		}
		
		TimeClientHandle handle = new TimeClientHandle(null, port);
		new Thread(handle, "NIO-MultiplexerTimeServer-001").start();
	}
}
