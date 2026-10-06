package chap7Pro_06;

public interface Human {
	void eat();

	static void echo() {
		System.out.println("야호...");
	}
	
	// 따로 지정하지 않으면 abstract void로 적용됨 >> 자식클래스에서 구현해야함
	default void print() {
		System.out.println("인간입니다.");
	}
}
