package consolegame;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class 사운드스레드 extends Thread {
	private Player player;
	private boolean loop; 
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
 	
	public 사운드스레드(String name, boolean loop) {
		try {
			this.loop=loop;
			file=new File(메인.class.getResource("../music/" + name).toURI());
			fis=new FileInputStream(file);
			bis=new BufferedInputStream(fis);
			player=new Player(bis);  
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void 종료() {
		loop=false;
		player.close();
		this.interrupt();
	}
	
	@Override
	public void run() {
		try {
			do {
				player.play();
				fis=new FileInputStream(file);
				bis=new BufferedInputStream(fis);
				player=new Player(bis);   
			}while(loop);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
}