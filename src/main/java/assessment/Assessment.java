package assessment;
public class Assessment {
	
	public static String main(int totalSeconds) throws NegativeIntException {
		try {
			int hours = calcHours(totalSeconds);
			int minutes = calcMinutes(totalSeconds);
			int seconds = calcSeconds(totalSeconds);
			String answer = formatAnswer(hours,minutes,seconds) ; 
			System.out.println(answer);
			return answer;
		}
		catch(NegativeIntException ex){
			throw new NegativeIntException("Negative input");
		}
	}
	
	static boolean isNegative(int totalSeconds) {
		return (totalSeconds < 0) ;
	}
	public static int calcHours (int totalSeconds) throws NegativeIntException{
		if(isNegative(totalSeconds)) {
			throw new NegativeIntException("Negative Input");
		}
		return ((totalSeconds/60)/60);
	}
	public static int calcMinutes (int totalSeconds) throws NegativeIntException {
		if(isNegative(totalSeconds)) {
			throw new NegativeIntException("Negative Input");
		}
		return ((totalSeconds / 60) % 60);
	}
	public static int calcSeconds (int totalSeconds) throws NegativeIntException{
		if(isNegative(totalSeconds)) {
			throw new NegativeIntException("Negative Input");
		}
		return (totalSeconds % 60);
	}

	public static String formatAnswer(int hours, int minutes, int seconds) throws NegativeIntException{
		if(hours<0 || minutes<0 || seconds<0) {
			throw new NegativeIntException("Negative Input");
		}
		String answer = "" ; 
		if(hours < 10) {
			answer += "0"+hours;
		}else {
			answer += hours;
		}
		answer += ":";
		if(minutes < 10) {
			answer += "0"+minutes;
		}else {
			answer += minutes;
		}
		answer += ":";
		if(seconds < 10) {
			answer += "0"+seconds;
		}else {
			answer += seconds;
		}
		return answer;
	}

}
