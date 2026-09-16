package programing5;

public class Smartphone extends Telephone{
	private String game;
	
	void playGame() {
		System.out.println(owner + "가" + game + "게임 중 입니다.");
	}
	
	Smartphone(String owner, String game){
		super(owner);
		this.game = game;
	}
}
