package test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.AfterClass;
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
		assertNotNull(new Employee(260.6f,"USD",0.2f,EmployeeType.Worker));
	}

	@Test
	public void testCs() {
		Employee dollarWorker = new Employee(1000f,"USD",10f,EmployeeType.Worker);
		Employee euroWorker = new Employee(1000f,"euro",10f,EmployeeType.Worker);
		Employee dollarSupervisor = new Employee(1000f,"USD",10f,EmployeeType.Supervisor);
		Employee euroSupervisor = new Employee(1000f,"euro",10f,EmployeeType.Supervisor);
		assertEquals(new BigDecimal(1000),new BigDecimal(dollarWorker.cs()));
		
		
	}

	@Test
	public void testCalculateYearBonus() {
		fail("Not yet implemented");
	}

}
