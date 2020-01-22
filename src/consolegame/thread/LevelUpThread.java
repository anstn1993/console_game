package consolegame.thread;

public class LevelUpThread implements Runnable {

	@Override
	public void run() {
		String[] levelUpImages=new String[16];
		levelUpImages[0]="7JSXPXKJJi    ujKXqKPKPKqXqS27j5KXqIs7IXKXXuvYKSPKPXqXPKqS17uSqXKIu7           Ls5qXq5J7u5qXK2vYXSPqqKPKPL";
		levelUpImages[1]="BBXKPPIBBB1  .QB2PPdPdPdPEPSgBBKqPKSQBbKPP5MBB5PPdbdPdPdq5RBBSPbXqBB          SBBXqdqSBBQ5PbSdBB5PbdbdPdEBBX";
		levelUpImages[2]="BB     :BQBg  BY             B7     QB      Br            .Bi     BB         :BBR     LB:     BP          7BBK.";
		levelUpImages[3]="QB     rBRgBgiBU             BJ     BB     .QJ            .B7     BB         BQBQ     jBi     QM            :BM";
		levelUpImages[4]="BB     rBgDDBBBJ     DBEdKS2PBu     BB     .BJ     EBZPKK2dB7     BB        .BBQB     2Br     Bg      jB.    BD";
		levelUpImages[5]="QB     rBMEDDMB1     BBBBBQBBBY     BB     .Bu     BQBBBBBQBr     BB         BQBQ     UBi     BR      JBI    Bd";
		levelUpImages[6]="BB     rBggEDDBj        MQgZgBL     BQ     .Bj        gQgEMB7     BB         BQBQ     2Qi     Bg      YQ1    BZ";
		levelUpImages[7]="QB     rBRZgZgB1        gBZgDBL     BB     .B1        ZBEDDBr     BB         BQBQ     UBi     BQ      UBX    Bd";
		levelUpImages[8]="BB     7BBBQBQBJ     BBQBBBBQBs     BB.    .BJ     BBBBBBQQQ7     BB         BQQQ     KQ7     BM      .2:    BZ";
		levelUpImages[9]="QB     vBBQBMRB1     BBBBBQQQBY     BB.     Q1     BBBBBQMQB7     BBBBBBBB   BMBD     SBr     BQ             Bd";
		levelUpImages[10]="BB            B1            .Bu            sBL            YB7           MQ   BQQB.            Bg     :Jrrr7rvBM";
		levelUpImages[11]="QB            BY             B7          iQBB7            7Bi           qB   BQgQBq           Bb     PQBBBBBBBY";
		levelUpImages[12]="BB.......... :B1 .......... iQ1 ...... .MQBMBj .......... 2BJ ......... gB   BBggQBBL....... .BE ... KBBBBBBv";
		levelUpImages[13]="DBQBBBBBBBBBBBQBBBBBBBQBBBBBQQBBBBBBQBBBBQQBBBBBBBBBBBBBQBBQBBBBBBBBBBQBBB   rBBQMgBBBQBQBBBBBQBBBBBBBBdZZi";
		levelUpImages[14]=" .PQBBBBBBBBBBBBBBBBBQBBBBBBBQBQBBBQBBBBBBBu:BBBBBBBBBBBBBBBBBBBBBBQBQBBB7     sBBBQBBBBBBBBBBBBBQBQBv";
		levelUpImages[15]="    7DbPPdPdPdPbPbPdPbPdPbPdPbPdPdPbPbPdbE:  QddPbPdPdPdPbPdPdPdPdPdPdPMY        bbbPdqbPbPdPdPbPEE7";
		for(int i=0;i<60;i++) {
			System.out.println("");
		}
		
		for(int i=0;i<levelUpImages.length;i++) {
			System.out.println(levelUpImages[i]);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		SoundThread levelUpSound = new SoundThread("level_up.mp3",false);
		levelUpSound.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("");
		
	}
	
}
