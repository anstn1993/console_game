package consolegame;

import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class 레벨업스레드 implements Runnable {
	

	@Override
	public void run() {
		String[] 레벨업로고=new String[16];
		레벨업로고[0]="7JSXPXKJJi    ujKXqKPKPKqXqS27j5KXqIs7IXKXXuvYKSPKPXqXPKqS17uSqXKIu7           Ls5qXq5J7u5qXK2vYXSPqqKPKPL";
		레벨업로고[1]="BBXKPPIBBB1  .QB2PPdPdPdPEPSgBBKqPKSQBbKPP5MBB5PPdbdPdPdq5RBBSPbXqBB          SBBXqdqSBBQ5PbSdBB5PbdbdPdEBBX";
		레벨업로고[2]="BB     :BQBg  BY             B7     QB      Br            .Bi     BB         :BBR     LB:     BP          7BBK.";
		레벨업로고[3]="QB     rBRgBgiBU             BJ     BB     .QJ            .B7     BB         BQBQ     jBi     QM            :BM";
		레벨업로고[4]="BB     rBgDDBBBJ     DBEdKS2PBu     BB     .BJ     EBZPKK2dB7     BB        .BBQB     2Br     Bg      jB.    BD";
		레벨업로고[5]="QB     rBMEDDMB1     BBBBBQBBBY     BB     .Bu     BQBBBBBQBr     BB         BQBQ     UBi     BR      JBI    Bd";
		레벨업로고[6]="BB     rBggEDDBj        MQgZgBL     BQ     .Bj        gQgEMB7     BB         BQBQ     2Qi     Bg      YQ1    BZ";
		레벨업로고[7]="QB     rBRZgZgB1        gBZgDBL     BB     .B1        ZBEDDBr     BB         BQBQ     UBi     BQ      UBX    Bd";
		레벨업로고[8]="BB     7BBBQBQBJ     BBQBBBBQBs     BB.    .BJ     BBBBBBQQQ7     BB         BQQQ     KQ7     BM      .2:    BZ";
		레벨업로고[9]="QB     vBBQBMRB1     BBBBBQQQBY     BB.     Q1     BBBBBQMQB7     BBBBBBBB   BMBD     SBr     BQ             Bd";
		레벨업로고[10]="BB            B1            .Bu            sBL            YB7           MQ   BQQB.            Bg     :Jrrr7rvBM";
		레벨업로고[11]="QB            BY             B7          iQBB7            7Bi           qB   BQgQBq           Bb     PQBBBBBBBY";
		레벨업로고[12]="BB.......... :B1 .......... iQ1 ...... .MQBMBj .......... 2BJ ......... gB   BBggQBBL....... .BE ... KBBBBBBv";
		레벨업로고[13]="DBQBBBBBBBBBBBQBBBBBBBQBBBBBQQBBBBBBQBBBBQQBBBBBBBBBBBBBQBBQBBBBBBBBBBQBBB   rBBQMgBBBQBQBBBBBQBBBBBBBBdZZi";
		레벨업로고[14]=" .PQBBBBBBBBBBBBBBBBBQBBBBBBBQBQBBBQBBBBBBBu:BBBBBBBBBBBBBBBBBBBBBBQBQBBB7     sBBBQBBBBBBBBBBBBBQBQBv";
		레벨업로고[15]="    7DbPPdPdPdPbPbPdPbPdPbPdPbPdPdPbPbPdbE:  QddPbPdPdPdPbPdPdPdPdPdPdPMY        bbbPdqbPbPdPdPbPEE7";
		for(int i=0;i<60;i++) {
			System.out.println("");
		}
		
		for(int i=0;i<레벨업로고.length;i++) {
			System.out.println(레벨업로고[i]);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		사운드스레드 레벨업사운드스레드=new 사운드스레드("level_up.mp3",false);
		레벨업사운드스레드.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("");
		
	}
	
}
