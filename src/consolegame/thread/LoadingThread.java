package consolegame.thread;

import java.util.ArrayList;
import java.util.List;

public class LoadingThread implements Runnable{
	private String type;//로딩스레드 실행시 어떤 로딩 메소드를 쓸지 지정하기 위해 존재하는 변수

	public LoadingThread(String type){//객체를 생성할 때 입력하는 타입에 따라 실행되는 로딩 메소드가 달라지게끔 설정
		this.type=type;
	}
	
	public void executeLoading() {
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
		System.out.print("로딩중");
		for(int i=0; i<20; i++ ) {
			System.out.print('.');
		
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
	
	public void executeMovoToTown() {
		System.out.print("마을로 돌아갑니다");
		for(int i=0; i<20; i++ ) {
			System.out.print('.');

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
	
	public void executeFinishGame() {

		for(int i=0; i<60; i++) {
			System.out.println("");
		}
		System.out.print("게임을 종료합니다");
		for(int i=0; i<20; i++ ) {
			System.out.print('.');

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
	
	public void executeRevive() {

		for(int i=0; i<30; i++) {
			System.out.println("");
		}
		System.out.print("마을에서 부활합니다");
		for(int i=0; i<20; i++ ) {
			System.out.print('.');

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
	
	public void executeMovoToNextStage() {
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
		System.out.print("다음 층으로 이동합니다");
		for(int i=0; i<20; i++ ) {
			System.out.print('.');

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
	
	public void executeInitCharacter() {
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
		System.out.print("케릭터 정보 생성중");
		for(int i=0; i<20; i++ ) {
			System.out.print('.');

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
	
	public void executeStartFighting() {
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
		System.out.print("로딩중");
		for(int i=0; i<5; i++ ) {
			System.out.print('.');
		
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
			case "loading"://로딩중 실행
				executeLoading();
				break;
			case "moveToTown"://마을로 이동할 때 실행
				executeMovoToTown();
				break;
			case "finishGame"://게임종료시 실행
				executeFinishGame();
				break;
			case "revive"://부활하면 실행
				executeRevive();
				break;
			case "moveToNextStage"://스테이지로 이동할 때 실행
				executeMovoToNextStage();
				break;
			case "initCharacter"://케릭터 정보 생성시 실행
				executeInitCharacter();
				break;
			case "startFighting"://전장에서 실행
				executeStartFighting();
				break;
		}
	}
}
