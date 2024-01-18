package Exe_2_Score_To_Char.vers_2.Exe_2_Score_To_Char.vers_2;

/**
 * Hello world!
 *
 */
public class App 
{
	public static String numberToChar(int number) {
	    if (number >= 1 && number <= 49) {
	        return "F";
	    } else if (number >= 50 && number <= 59) {
	        return "E";
	    } else if (number >= 60 && number <= 69) {
	        return "D";
	    } else if (number >= 70 && number <= 79) {
	        return "C";
	    } else if (number >= 80 && number <= 89) {
	        return "B";
	    } else if (number >= 90 && number <= 100) {
	        return "A";
	    } else {
	        return "error";
	    }
	}
}
