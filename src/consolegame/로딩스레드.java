package consolegame;

public class 로딩스레드 implements Runnable{
	String type;//로딩스레드 실행시 어떤 로딩 메소드를 쓸지 지정하기 위해 존재하는 변수
	
	로딩스레드(String type){//객체를 생성할 때 입력하는 타입에 따라 실행되는 로딩 메소드가 달라지게끔 설정
		this.type=type;
		
	}
	
	public void 로딩() {
		String[] 로딩 = new String[20];
		로딩[0]=".";
		로딩[1]=".";
		로딩[2]=".";
		로딩[3]=".";
		로딩[4]=".";
		로딩[5]=".";
		로딩[6]=".";
		로딩[7]=".";
		로딩[8]=".";
		로딩[9]=".";
		로딩[10]=".";
		로딩[11]=".";
		로딩[12]=".";
		로딩[13]=".";
		로딩[14]=".";
		로딩[15]=".";
		로딩[16]=".";
		로딩[17]=".";
		로딩[18]=".";
		로딩[19]=".";
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
		String 로딩중="로딩중";
		System.out.print(로딩중);
		for(int i=0; i<로딩.length; i++ ) {
			System.out.print(로딩[i]);
		
			try {
				Thread.sleep(140);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
	}
	
	public void 마을이동() {
		String[] 로딩 = new String[20];
		로딩[0]=".";
		로딩[1]=".";
		로딩[2]=".";
		로딩[3]=".";
		로딩[4]=".";
		로딩[5]=".";
		로딩[6]=".";
		로딩[7]=".";
		로딩[8]=".";
		로딩[9]=".";
		로딩[10]=".";
		로딩[11]=".";
		로딩[12]=".";
		로딩[13]=".";
		로딩[14]=".";
		로딩[15]=".";
		로딩[16]=".";
		로딩[17]=".";
		로딩[18]=".";
		로딩[19]=".";
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
		String 로딩중="마을로 돌아갑니다";
		System.out.print(로딩중);
		for(int i=0; i<로딩.length; i++ ) {
			System.out.print(로딩[i]);
		
			try {
				Thread.sleep(140);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
	}
	
	public void 게임종료() {
		String[] 종료 = new String[20];
		종료[0]=".";
		종료[1]=".";
		종료[2]=".";
		종료[3]=".";
		종료[4]=".";
		종료[5]=".";
		종료[6]=".";
		종료[7]=".";
		종료[8]=".";
		종료[9]=".";
		종료[10]=".";
		종료[11]=".";
		종료[12]=".";
		종료[13]=".";
		종료[14]=".";
		종료[15]=".";
		종료[16]=".";
		종료[17]=".";
		종료[18]=".";
		종료[19]=".";
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
		String 종료중="게임을 종료합니다";
		System.out.print(종료중);
		for(int i=0; i<종료.length; i++ ) {
			System.out.print(종료[i]);
		
			try {
				Thread.sleep(140);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
	}
	
	public void 부활() {
		String[] 부활 = new String[20];
		부활[0]=".";
		부활[1]=".";
		부활[2]=".";
		부활[3]=".";
		부활[4]=".";
		부활[5]=".";
		부활[6]=".";
		부활[7]=".";
		부활[8]=".";
		부활[9]=".";
		부활[10]=".";
		부활[11]=".";
		부활[12]=".";
		부활[13]=".";
		부활[14]=".";
		부활[15]=".";
		부활[16]=".";
		부활[17]=".";
		부활[18]=".";
		부활[19]=".";
		for(int i=0; i<30; i++) {
			System.out.println("");
		}
		String 부활중="마을에서 부활합니다";
		System.out.print(부활중);
		for(int i=0; i<부활.length; i++ ) {
			System.out.print(부활[i]);
		
			try {
				Thread.sleep(140);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
	}
	
	public void 스테이지이동() {
		String[] 로딩 = new String[20];
		로딩[0]=".";
		로딩[1]=".";
		로딩[2]=".";
		로딩[3]=".";
		로딩[4]=".";
		로딩[5]=".";
		로딩[6]=".";
		로딩[7]=".";
		로딩[8]=".";
		로딩[9]=".";
		로딩[10]=".";
		로딩[11]=".";
		로딩[12]=".";
		로딩[13]=".";
		로딩[14]=".";
		로딩[15]=".";
		로딩[16]=".";
		로딩[17]=".";
		로딩[18]=".";
		로딩[19]=".";
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
		String 로딩중="다음 층으로 이동합니다";
		System.out.print(로딩중);
		for(int i=0; i<로딩.length; i++ ) {
			System.out.print(로딩[i]);
		
			try {
				Thread.sleep(140);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int i=0; i<30; i++) {
			System.out.println("");
		}
	}
	
	public void 케릭터정보생성() {
		String[] 케릭터정보생성 = new String[20];
		케릭터정보생성[0]=".";
		케릭터정보생성[1]=".";
		케릭터정보생성[2]=".";
		케릭터정보생성[3]=".";
		케릭터정보생성[4]=".";
		케릭터정보생성[5]=".";
		케릭터정보생성[6]=".";
		케릭터정보생성[7]=".";
		케릭터정보생성[8]=".";
		케릭터정보생성[9]=".";
		케릭터정보생성[10]=".";
		케릭터정보생성[11]=".";
		케릭터정보생성[12]=".";
		케릭터정보생성[13]=".";
		케릭터정보생성[14]=".";
		케릭터정보생성[15]=".";
		케릭터정보생성[16]=".";
		케릭터정보생성[17]=".";
		케릭터정보생성[18]=".";
		케릭터정보생성[19]=".";
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
		String 케릭터정보생성중="케릭터 정보 생성중";
		System.out.print(케릭터정보생성중);
		for(int i=0; i<케릭터정보생성.length; i++ ) {
			System.out.print(케릭터정보생성[i]);
		
			try {
				Thread.sleep(140);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int i=0; i<30; i++) {
			System.out.println("");
		}
	}
	
	public void 전장() {
		String[] 로딩 = new String[5];
		로딩[0]=".";
		로딩[1]=".";
		로딩[2]=".";
		로딩[3]=".";
		로딩[4]=".";
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
		String 로딩중="로딩중";
		System.out.print(로딩중);
		for(int i=0; i<로딩.length; i++ ) {
			System.out.print(로딩[i]);
		
			try {
				Thread.sleep(140);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
	}
	
	
	
	@Override
	public void run() {
		switch(type) {
			case "로딩"://로딩클래스의 생성자를 만들 때  type에 '로딩'이 들어가면 로딩() 실행
				this.로딩();
				break;
			case "마을이동"://로딩클래스의 생성자를 만들 때  type에 '마을이동'이 들어가면 마을이동() 실행
				this.마을이동();
				break;
			case "게임종료"://로딩클래스의 생성자를 만들 때  type에 '게임종료'가 들어가면 게임종료() 실행
				this.게임종료();
				break;
			case "부활"://로딩클래스의 생성자를 만들 때  type에 '부활'이 들어가면 부활() 실행
				this.부활();
				break;
			case "스테이지이동"://로딩클래스의 생성자를 만들 때  type에 '스테이지이동'이 들어가면 스테이지이동() 실행
				this.스테이지이동();
				break;
			case "케릭터정보생성"://로딩클래스의 생성자를 만들 때  type에 '케릭터정보생성'이 들어가면 케릭터정보생성() 실행
				this.케릭터정보생성();
				break;
			case "전장"://로딩클래스의 생성자를 만들 때  type에 '전장'이 들어가면 전장() 실행
				this.전장();
				break;
		}
	}
}
