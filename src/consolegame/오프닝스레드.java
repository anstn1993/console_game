package consolegame;

public class 오프닝스레드 implements Runnable {

	@Override
	public void run() {
		String[] 오프닝1= {"변","화","라",".",".",".",".","."," ","누","군","가","는"," ","변","화","가"," ","필","요","하","다","고"," ","말","하","지",".",".",".","."};
		String 오프닝주인공="???: ";
		System.out.print(오프닝주인공);
		for(int i=0; i<오프닝1.length; i++ ) {
			System.out.print(오프닝1[i]);
		
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("");
		
		String[] 오프닝2= {"하","지","만"," ","변","화","는"," ","현","재","의"," ","안","정","을"," ","위","협","하","면","서"," ","불","필","요","한"," ","혼","란","만"," ","가","져","올"," ","뿐","이","다","."};
		String 공백1="            ";
		System.out.print(공백1);
		for(int i=0; i<오프닝2.length; i++ ) {
			System.out.print(오프닝2[i]);
		
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("");
		
		String[] 오프닝3= {"이","번","에"," ","찾","아","올"," ","변","화","의"," ","파","도","는"," ","꽤","나"," ","커"," ","보","이","는","구","나","."};
		String 공백2="            ";
		System.out.print(공백2);
		for(int i=0; i<오프닝3.length; i++ ) {
			System.out.print(오프닝3[i]);
		
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("");
		
		String[] 오프닝4= {"그"," ","파","도","를"," ","막","는"," ","것","이"," ","나","의"," ","운","명","이","라","면"," ","난"," ","그"," ","운","명","마","저","도"," ","내"," ","발","아","래"," ","둘"," ","것","이","다","."};
		String 공백3="            ";
		System.out.print(공백3);
		for(int i=0; i<오프닝4.length; i++ ) {
			System.out.print(오프닝4[i]);
		
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("");
		
		String[] 오프닝5= {"난",".",".",".","이"," ","탑","의"," ","신","이","니","까",".",".","."};
		String 공백4="            ";
		System.out.print(공백4);
		for(int i=0; i<오프닝5.length; i++ ) {
			System.out.print(오프닝5[i]);
		
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
		
		String[] 로고 = new String[28];
		로고[0]="                         EK                                                  ";
		로고[1]="                          QBQ                                                ";
		로고[2]="                         UBQ                                                 ";
		로고[3]="                         BBB                                          i      ";
		로고[4]="                         BBu                                          s      ";
		로고[5]="                        QBv                                          u       ";
		로고[6]="                       iBdkBY      uS                                l       ";
		로고[7]="                       BB BBB     vBBB                         BBBD  U       ";
		로고[8]="                      vB  UBB     PBBr                 i      rQ    iZ       ";
		로고[9]="                      BX   iQi    EZ               Yr  v      Dr     E       ";
		로고[10]="                     BB     UB    UQ             iBBBi B      B      I       ";
		로고[11]="                    iB       vr   iB            iQ     B      PivM   BBE     ";
		로고[12]="                    Bi        R   iB            iBi    B      BQqr   BBQK    ";
		로고[13]="                   BI         iM   B              Yr   B      B      Qvv     ";
		로고[14]="                 SB           i   B                    B     QB ri  iX       ";
		로고[15]="                  i                B              rsPviB     rMBBBi          ";
		로고[16]="                                   Q             JBJ   B      iQBQ   r       ";
		로고[17]="                                   i                  iB             B       ";
		로고[18]="                                   i                  B            rBi       ";
		로고[19]="                                  JBi                               BBB      ";
		로고[20]="                                  LBj                           iB  dBB      ";
		로고[21]="                           ir       v                            B   Br      ";
		로고[22]="                           BBB      i                            SVDSv       ";
		로고[23]="                           RBB                                   V   d       ";
		로고[24]="                            S                                    L   a       ";
		로고[25]="                            k                                    iEvr        ";
		로고[26]="                            PvvrrrUi                              B Q        ";
		로고[27]="                            qBs                                   iBB        ";
		for(int i=0; i<로고.length ;i++) {
			System.out.println(로고[i]);	
			
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


