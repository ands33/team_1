package polymorphism;

public class SamsungTV implements TV {
	// 이 인터페이스를 쓰는 Bean은 다 생성이 됨,
	// applicationContext에 써있는 Speaker를 참조하는 모든 클래스들은 미리 만들어짐
	private Speaker speaker;
	private int price;

	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker 호출~!!!");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("===> setPrice 호출~!!!");
		this.price = price;
	}

	public SamsungTV() {
		System.out.println("삼성 TV 객체(1) 생성 완료~!!!");
	}
	
	/*
	 * public SamsungTV(Speaker speaker) {
	 * System.out.println("삼성 TV 객체(2) 생성 완료~!!!"); this.speaker = speaker; }
	 * 
	 * public SamsungTV(Speaker speaker, int price) {
	 * System.out.println("삼성 TV 객체(3) 생성 완료~!!!"); this.speaker = speaker;
	 * this.price = price; }
	 */

	public void initMethod() {
		System.out.println("initMethod 객체 초기화 작업 완료~!!!");
	}

	public void destroyMethod() {
		System.out.println("destroyMethod 객체 삭제 전 처리할 명령을 지정하는 부분~!!!");
	}

	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다.");
	}

	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}

	public void volumeUp() {
		// System.out.println("SamsungTV---소리 올린다.");
//	   speaker = new SonySpeaker();
		speaker.volumeUp();
	}

	public void volumeDown() {
//      System.out.println("SamsungTV---소리 내린다.");
//      speaker = new SonySpeaker();
		speaker.volumeDown();
	}

}