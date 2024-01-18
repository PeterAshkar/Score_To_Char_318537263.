package Exe_2_Score_To_Char.vers_2.Exe_2_Score_To_Char.vers_2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	
	
	//-------------------------------------------------------------
	//A Partition
	
	@Test
	public void exe_2_Partition_A_min() {
		
		String result = App.numberToChar(90);
		String expected_result="A";
		org.junit.Assert.assertEquals(expected_result,result);
	}
	@Test
	public void exe_2_Partition_A_min_plus1() {
		
		String result = App.numberToChar(91);
		String expected_result="A";
		org.junit.Assert.assertEquals(expected_result,result);
	}
	@Test
	public void exe_2_Partition_A_Nominal() {
	    String result = App.numberToChar(95);
	    String expected_result = "A";

	    org.junit.Assert.assertEquals(expected_result, result);
	}
	@Test
	public void exe_2_Partition_A_Max_Minus1() {
		String result = App.numberToChar(99);
		String expected_result="A";
		org.junit.Assert.assertEquals(expected_result,result);
	}
	@Test
	public void exe_2_Partition_A_Max() {
		String result = App.numberToChar(100);
		String expected_result="A";
		org.junit.Assert.assertEquals(expected_result,result);
	}
}
 