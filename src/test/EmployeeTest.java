package test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import tallerpruebas.*;

public class EmployeeTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEmployee() {
		assertNotNull(new Employee(3000f, "USD", 0.15f, EmployeeType.Manager));
	}

	@Test
	public void testCs() {
		Employee usdManager = new Employee(3000f, "USD", 15f, EmployeeType.Manager);
		Employee euManager = new Employee(3000f, "EU", 25f, EmployeeType.Manager);
		Assert.assertEquals(new BigDecimal (usdManager.cs()), new BigDecimal(0));
		Assert.assertEquals(new BigDecimal (euManager.cs()), new BigDecimal(0));
	}

	@Test
	public void testCalculateYearBonus() {
		fail("Not yet implemented");
	}

}
