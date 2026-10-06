package chap7Pro_05;

public class TV extends Controller{
	public TV(boolean power) {
		this.power = power;
	}
	
	@Override
	void show() {
		if(power) {
			System.out.println(getName() + "가 켜졌습니다.");
		}
		else{
			System.out.println(getName() + "가 꺼졌습니다.");
		}
		
	}

	@Override
	String getName() {
		return "TV";
	}
}
