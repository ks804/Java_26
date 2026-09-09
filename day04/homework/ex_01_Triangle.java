package homework;

public class ex_01_Triangle {
	
	private double bot;
	private double height;
	
	public ex_01_Triangle(double bot, double height) {
		this.bot = bot;
        this.height = height;
    }

    public double getBase() {
        return bot;
    }

    public double getHeight() {
        return height;
    }

    public double findArea() {
        return bot * height / 2;
    }

}
