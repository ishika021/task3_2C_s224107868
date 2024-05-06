package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "s224107868";
		Assert.assertNotNull("Student ID is empty", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Ishika";
		Assert.assertNotNull("Student name is empty", studentName);
	}

	@Test
	public void checkDayEqual() {
		
		DateUtil d1 = new DateUtil(29, 3, 2022);
		d1.increment();
		Assert.assertEquals(30, d1.getDay());
		
		DateUtil d2 = new DateUtil(5, 3, 2022);
		d2.increment();
		Assert.assertEquals(6, d2.getDay());
		
		DateUtil d3 = new DateUtil(16, 3, 2022);
		d3.increment();
		Assert.assertEquals(17, d3.getDay());
		
		DateUtil d4 = new DateUtil(25, 3, 2022);
		d4.increment();
		Assert.assertEquals(26, d4.getDay());
	}
	
	@Test
	public void checkMonthEqual() {
		
		DateUtil withoutLeap = new DateUtil(5, 5, 2021);
		withoutLeap.increment();
		Assert.assertEquals(5,  withoutLeap.getMonth());
		
		DateUtil withLeap = new DateUtil(17, 8, 2022);
		withLeap.increment();
		Assert.assertEquals(8,  withLeap.getMonth());
		
		DateUtil m1 = new DateUtil(4, 1, 2022);
		m1.increment();
		Assert.assertEquals(1,  m1.getMonth());
		
		DateUtil m2 = new DateUtil(31, 5, 2022);
		m2.increment();
		Assert.assertEquals(6,  m2.getMonth());
	}
	
	@Test
	public void checkYearEqual() {
		
		DateUtil yearWithoutLeap = new DateUtil(28, 2, 2021);
		yearWithoutLeap.increment();
		Assert.assertEquals(2021,  yearWithoutLeap.getYear());
		
		DateUtil yearLeap = new DateUtil(28, 2, 2022);
		yearLeap.increment();
		Assert.assertEquals(2022,  yearLeap.getYear());
	}
	
}
