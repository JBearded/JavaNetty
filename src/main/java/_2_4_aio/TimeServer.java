package _2_4_aio;

public class TimeServer {

	public static void main(String[] args) {
		
		int port = 8080;
		if(args != null && args.length > 0){
			try{
				port = Integer.parseInt(args[0]);
			}catch(Exception e){
				
			}
		}
		
		
	}
}
