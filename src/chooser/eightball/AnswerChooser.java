package chooser.eightball;

import java.util.Random;

public class AnswerChooser {

	private int chooser = new Random().nextInt(20) + 1;

	public int getChooser(){
		return chooser;
	}
	
	
	
	
}
