package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "s224107868";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Ishika";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
	    // January min boundary area: min+1
	    DateUtil date = new DateUtil(1, 1, 2024);
	    System.out.println("testMinJanuary1ShouldIncrementToJanuary2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	}

	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
	    // January min boundary area: min-1
	    DateUtil date = new DateUtil(1, 1, 2024);
	    System.out.println("testMinJanuary1ShouldDecrementToDecember31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(2023, date.getYear());
	}
	
	
	@Test
	public void testMinJune1ShouldDecrementToMay31() {
	    DateUtil date = new DateUtil(1, 6, 1994);
	    System.out.println("testMinJune1ShouldDecrementToMay31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(5, date.getMonth());
	}

	@Test
	public void testMinJune2ShouldDecrementToJune1() {
		DateUtil date = new DateUtil(2, 6, 1994);
	    System.out.println("testMinJune2ShouldDecrementToJune1 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}
	//3A
	@Test
	public void testJune15ShouldDecrementToJune14() {
	    DateUtil date = new DateUtil(15, 6, 1994);
	    System.out.println("testJune15ShouldDecrementToJune14 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}

	//4A
	@Test
	public void testJune30ShouldDecrementToJune29() {
	    DateUtil date = new DateUtil(30, 6, 1994);
	    System.out.println("testJune30ShouldDecrementToJune29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}

	//5A
	@Test
	public void testJune31ShouldDecrementToInvalidDate() {
	    DateUtil date = new DateUtil(31, 6, 1994);
	    System.out.println("testJune31ShouldDecrementToInvalidDate > " + date);
	    date.decrement();
	    System.out.println(date);
	    // Asserting that the date becomes invalid
	    Assert.assertThrows(RuntimeException.class, () -> date.decrement());
	}

	//6A
	@Test
	public void testJan15ShouldDecrementToJan14() {
	    DateUtil date = new DateUtil(15, 1, 1994);
	    System.out.println("testJan15ShouldDecrementToJan14 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	}

	//7A
	@Test
	public void testFeb15ShouldDecrementToFeb14() {
	    DateUtil date = new DateUtil(15, 2, 1994);
	    System.out.println("testFeb15ShouldDecrementToFeb14 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	}

	//8A
	@Test
	public void testNov15ShouldDecrementToNov14() {
	    DateUtil date = new DateUtil(15, 11, 1994);
	    System.out.println("testNov15ShouldDecrementToNov14 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	}

	//9A
	@Test
	public void testDec15ShouldDecrementToDec14() {
	    DateUtil date = new DateUtil(15, 12, 1994);
	    System.out.println("testDec15ShouldDecrementToDec14 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	}

	//10A
	@Test
	public void testJune15ShouldDecrementToJune14_Year1700() {
	    DateUtil date = new DateUtil(15, 6, 1700);
	    System.out.println("testJune15ShouldDecrementToJune14_Year1700 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1700, date.getYear());
	}

	//11A
	@Test
	public void testJune15ShouldDecrementToJune14_Year1701() {
	    DateUtil date = new DateUtil(15, 6, 1701);
	    System.out.println("testJune15ShouldDecrementToJune14_Year1701 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1701, date.getYear());
	}

	//12A
	@Test
	public void testJune15ShouldDecrementToJune14_Year2023() {
	    DateUtil date = new DateUtil(15, 6, 2023);
	    System.out.println("testJune15ShouldDecrementToJune14_Year2023 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2023, date.getYear());
	}

	//13A
	@Test
	public void testJune15ShouldDecrementToJune14_Year2024() {
	    DateUtil date = new DateUtil(15, 6, 2024);
	    System.out.println("testJune15ShouldDecrementToJune14_Year2024 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	//1B
	@Test
	public void testJune1ShouldIncrementToJune2() {
	    DateUtil date = new DateUtil(1, 6, 1994);
	    System.out.println("testJune1ShouldIncrementToJune2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	//2B
	@Test
	public void testJune2ShouldIncrementToJune3() {
	    DateUtil date = new DateUtil(2, 6, 1994);
	    System.out.println("testJune2ShouldIncrementToJune3 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(3, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	//3B
	@Test
	public void testJune15ShouldIncrementToJune16() {
	    DateUtil date = new DateUtil(15, 6, 1994);
	    System.out.println("testJune15ShouldIncrementToJune16 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	//4B
	@Test
	public void testJune30ShouldIncrementToJuly1() {
	    DateUtil date = new DateUtil(30, 6, 1994);
	    System.out.println("testJune30ShouldIncrementToJuly1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(7, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	//5B
	@Test
	public void testJune31ShouldIncrementToInvalidDate() {
	    DateUtil date = new DateUtil(31, 6, 1994);
	    System.out.println("testJune31ShouldIncrementToInvalidDate > " + date);
	    date.increment();
	    System.out.println(date);
	    // Asserting that the date becomes invalid
	    Assert.assertThrows(RuntimeException.class, () -> date.increment());
	}

	//6B
	@Test
	public void testJan15ShouldIncrementToJan16() {
	    DateUtil date = new DateUtil(15, 1, 1994);
	    System.out.println("testJan15ShouldIncrementToJan16 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	//7B
	@Test
	public void testFeb15ShouldIncrementToFeb16() {
	    DateUtil date = new DateUtil(15, 2, 1994);
	    System.out.println("testFeb15ShouldIncrementToFeb16 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	//8B
	@Test
	public void testNov15ShouldIncrementToNov16() {
	    DateUtil date = new DateUtil(15, 11, 1994);
	    System.out.println("testNov15ShouldIncrementToNov16 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	//9B
	@Test
	public void testDec15ShouldIncrementToDec16() {
	    DateUtil date = new DateUtil(15, 12, 1994);
	    System.out.println("testDec15ShouldIncrementToDec16 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	//10B
	@Test
	public void testJune15ShouldIncrementToJune16_Year1700() {
	    DateUtil date = new DateUtil(15, 6, 1700);
	    System.out.println("testJune15ShouldIncrementToJune16_Year1700 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1700, date.getYear());
	}

	//11B
	@Test
	public void testJune15ShouldIncrementToJune16_Year1701() {
	    DateUtil date = new DateUtil(15, 6, 1701);
	    System.out.println("testJune15ShouldIncrementToJune16_Year1701 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1701, date.getYear());
	}

	//12B
	@Test
	public void testJune15ShouldIncrementToJune16_Year2023() {
	    DateUtil date = new DateUtil(15, 6, 2023);
	    System.out.println("testJune15ShouldIncrementToJune16_Year2023 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2023, date.getYear());
	}

	//13B
	@Test
	public void testJune15ShouldIncrementToJune16_Year2024() {
	    DateUtil date = new DateUtil(15, 6, 2024);
	    System.out.println("testJune15ShouldIncrementToJune16_Year2024 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}


}
