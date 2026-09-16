package programing5;

public class Phone {
	protected String owner;
	
	void talk() {
		System.out.println(owner + "가 통화중입니다.");
	}
	
	Phone(String owner){
		this.owner = owner;
	}
}
