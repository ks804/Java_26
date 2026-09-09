package homework;

public class ex_02_Triangle {
	
	private double bot;
	private double height;
	
	public ex_02_Triangle(double bot, double height) {
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
    
    public boolean isSameArea(ex_02_Triangle t) {
        return findArea() == t.findArea();
    }
}
