package consolegame.thread;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import consolegame.Main;
import javazoom.jl.player.Player;

public class SoundThread extends Thread {
	private Player player;
	private boolean loop; 
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
 	
	public SoundThread(String name, boolean loop) {
		try {
			this.loop=loop;
			file=new File(Main.class.getResource("../music/" + name).toURI());
			fis=new FileInputStream(file);
			bis=new BufferedInputStream(fis);
			player=new Player(bis);  
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void finish() {
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