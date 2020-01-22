package consolegame.thread;

public class OpeningThread implements Runnable {

	@Override
	public void run() {
		String[] openingScript= {"변","화","라",".",".",".",".","."," ","누","군","가","는"," ","변","화","가"," ","필","요","하","다","고"," ","말","하","지",".",".",".","."};
		System.out.print("???: ");
		for(int i=0; i<openingScript.length; i++ ) {
			System.out.print(openingScript[i]);
		
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("");
		
		String[] openingScript2= {"하","지","만"," ","변","화","는"," ","현","재","의"," ","안","정","을"," ","위","협","하","면","서"," ","불","필","요","한"," ","혼","란","만"," ","가","져","올"," ","뿐","이","다","."};
		System.out.print("            ");
		for(int i=0; i<openingScript2.length; i++ ) {
			System.out.print(openingScript2[i]);
		
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("");
		
		String[] openingScript3= {"이","번","에"," ","찾","아","올"," ","변","화","의"," ","파","도","는"," ","꽤","나"," ","커"," ","보","이","는","구","나","."};
		System.out.print("            ");
		for(int i=0; i<openingScript3.length; i++ ) {
			System.out.print(openingScript3[i]);
		
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("");
		
		String[] openingScript4= {"그"," ","파","도","를"," ","막","는"," ","것","이"," ","나","의"," ","운","명","이","라","면"," ","난"," ","그"," ","운","명","마","저","도"," ","내"," ","발","아","래"," ","둘"," ","것","이","다","."};
		System.out.print("            ");
		for(int i=0; i<openingScript4.length; i++ ) {
			System.out.print(openingScript4[i]);
		
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("");
		
		String[] openingScript5= {"난",".",".",".","이"," ","탑","의"," ","신","이","니","까",".",".","."};
		System.out.print("            ");
		for(int i=0; i<openingScript5.length; i++ ) {
			System.out.print(openingScript5[i]);
		
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.print("");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		String[] titles = new String[28];
		titles[0]="                         EK                                                  ";
		titles[1]="                          QBQ                                                ";
		titles[2]="                         UBQ                                                 ";
		titles[3]="                         BBB                                          i      ";
		titles[4]="                         BBu                                          s      ";
		titles[5]="                        QBv                                          u       ";
		titles[6]="                       iBdkBY      uS                                l       ";
		titles[7]="                       BB BBB     vBBB                         BBBD  U       ";
		titles[8]="                      vB  UBB     PBBr                 i      rQ    iZ       ";
		titles[9]="                      BX   iQi    EZ               Yr  v      Dr     E       ";
		titles[10]="                     BB     UB    UQ             iBBBi B      B      I       ";
		titles[11]="                    iB       vr   iB            iQ     B      PivM   BBE     ";
		titles[12]="                    Bi        R   iB            iBi    B      BQqr   BBQK    ";
		titles[13]="                   BI         iM   B              Yr   B      B      Qvv     ";
		titles[14]="                 SB           i   B                    B     QB ri  iX       ";
		titles[15]="                  i                B              rsPviB     rMBBBi          ";
		titles[16]="                                   Q             JBJ   B      iQBQ   r       ";
		titles[17]="                                   i                  iB             B       ";
		titles[18]="                                   i                  B            rBi       ";
		titles[19]="                                  JBi                               BBB      ";
		titles[20]="                                  LBj                           iB  dBB      ";
		titles[21]="                           ir       v                            B   Br      ";
		titles[22]="                           BBB      i                            SVDSv       ";
		titles[23]="                           RBB                                   V   d       ";
		titles[24]="                            S                                    L   a       ";
		titles[25]="                            k                                    iEvr        ";
		titles[26]="                            PvvrrrUi                              B Q        ";
		titles[27]="                            qBs                                   iBB        ";
		for(int i=0; i<titles.length ;i++) {
			System.out.println(titles[i]);
			
			try {
				Thread.sleep(140);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0; i<60; i++) {
			System.out.println("");
		}	
	}
}


