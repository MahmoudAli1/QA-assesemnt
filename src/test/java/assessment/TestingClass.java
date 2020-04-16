package assessment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class TestingClass {

	@Test
	void testHours() throws NegativeIntException {
		int [] testSet = new int [3];
		int [] answerSet = new int [3];
		testSet[0] = 3600;
		testSet[1] = 4511;
		testSet[2] = 7261;
		answerSet[0] = 1; 
		answerSet[1] = 1; 
		answerSet[2] = 2;
		for(int i = 0 ; i<testSet.length ; i++) {
			assertEquals(answerSet[i],Assessment.calcHours(testSet[i]));
		}
	}
	@Test
	void testMinutes() throws NegativeIntException {
		int [] testSet = new int [3];
		int [] answerSet = new int [3];
		testSet[0] = 3600;
		testSet[1] = 4511;
		testSet[2] = 7261;
		answerSet[0] = 0; 
		answerSet[1] = 15; 
		answerSet[2] = 1;
		for(int i = 0 ; i<testSet.length ; i++) {
			assertEquals(answerSet[i],Assessment.calcMinutes(testSet[i]));
		}
	}
	@Test
	void testSeconds() throws NegativeIntException {
		int [] testSet = new int [3];
		int [] answerSet = new int [3];
		testSet[0] = 3600;
		testSet[1] = 4511;
		testSet[2] = 7261;
		answerSet[0] = 0; 
		answerSet[1] = 11; 
		answerSet[2] = 1;
		for(int i = 0 ; i<testSet.length ; i++) {
			assertEquals(answerSet[i],Assessment.calcSeconds(testSet[i]));
		}
	}
	@Test
	void testFormat() throws NegativeIntException {
		int [] hours = new int[]{1,11} ;
		int [] minutes = new int[]{4,22};
		int [] seconds = new int[]{34,9};
		String [] answers = new String[] {"01:04:34","11:22:09"};
		for(int i = 0 ; i<answers.length ; i++) {
			assertEquals(answers[i],Assessment.formatAnswer(hours[i],minutes[i],seconds[i]));
		}
	}
	@Test
	void testMain() throws NegativeIntException  {
		int [] totalSeconds = new int[] {5874,4674,3214};
		String [] expected = new String[] {"01:37:54","01:17:54","00:53:34"};
		for(int i = 0 ; i< totalSeconds.length ; i++) {
			assertEquals(expected[i],Assessment.main(totalSeconds[i]));
		}
	}
	
	@Test
	void testNegativeNumber_main()  {
		int totalSeconds = -1;
		assertThrows(NegativeIntException.class, () -> {
			Assessment.main(totalSeconds);
		});
	}
	@Test
	void testNegativeNumber_seconds()  {
		int totalSeconds = -1;
		assertThrows(NegativeIntException.class, () -> {
			Assessment.calcSeconds(totalSeconds);
		});
	}
	@Test
	void testNegativeNumber_minutes()  {
		int totalSeconds = -1;
		assertThrows(NegativeIntException.class, () -> {
			Assessment.calcMinutes(totalSeconds);
		});
	}
	@Test
	void testNegativeNumber_hours()  {
		int totalSeconds = -1;
		assertThrows(NegativeIntException.class, () -> {
			Assessment.calcHours(totalSeconds);
		});
	}
	@Test
	void testNegativeHours_formatAnswer() throws NegativeIntException  {
		int hours = -1 ;
		int minutes = 2 ;
		int seconds = 4 ; 
			assertThrows(NegativeIntException.class , () -> {
				Assessment.formatAnswer(hours,minutes,seconds);
			});
	}
	@Test
	void testNegativeMinutes_formatAnswer() throws NegativeIntException  {
		int hours = 3 ;
		int minutes = -2 ;
		int seconds = 5 ; 
			assertThrows(NegativeIntException.class , () -> {
				Assessment.formatAnswer(hours,minutes,seconds);
			});
	}
	@Test
	void testNegativeSeconds_formatAnswer() throws NegativeIntException  {
		int hours = 1 ;
		int minutes = -2 ;
		int seconds = 6 ; 
			assertThrows(NegativeIntException.class , () -> {
				Assessment.formatAnswer(hours,minutes,seconds);
			});
	}
}


