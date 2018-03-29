package cricket_system;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Overtestcase {
	
	Match match;
	Scores score;
	
	@Test
	public void test() {
		match = new Match("AUSTRALIA","SOUTHAFRICA",20);
		score = new Scores(match);
		score.addScore(1);
		score.addScore(2);
		score.addScore(1);
		score.addScore(2);
		score.addScore(1);
		score.addScore(2);
		
		score.addScore(1);
		score.addScore(2);
		assertEquals(2, match.getCurrentOver()+1);
	}

}
