package _2_4_aio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.concurrent.CountDownLatch;

public class AsyncTimeServerHandler implements Runnable{

	private int port;
	
	CountDownLatch latch;
	AsynchronousServerSocketChannel asynchronousServerSocketChannel;
	
	public AsyncTimeServerHandler(int port) {
		
		this.port = port;
		try{
			asynchronousServerSocketChannel = AsynchronousServerSocketChannel.open();
			asynchronousServerSocketChannel.bind(new InetSocketAddress(port));
			System.out.println("The time server is start in port : "+port);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	
	public void run() {
		
		latch = new CountDownLatch(1);
		doAccept();
	}

	public void doAccept(){
		
		asynchronousServerSocketChannel.accept(this, new AcceptCompletionHandler());
	}
	
}
