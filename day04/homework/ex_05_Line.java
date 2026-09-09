package homework;

public class ex_05_Line {
	int line;
		
		public ex_05_Line(int line) {
			this.line = line;
		}
		
		public boolean isSameLine(ex_05_Line l) {
			if(line == l.line) {
				return true;
			}else {
				return false;
			}
		}
}
