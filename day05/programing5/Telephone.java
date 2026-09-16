package programing5;

public class Telephone extends Phone{
	private String when;
	
	void autoAnswering() {
		System.out.println(owner + "가 부재 중이니 " + when + "에게 전화를 요망합니다.");
	}
	
	Telephone(String owner){
		super(owner);
	}
	
	Telephone(String owner, String when){
		super(owner);
		this.when = when;
	}
}
