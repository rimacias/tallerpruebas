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
<<<<<<< HEAD

public class EmployeeTest {
=======
>>>>>>> 1c77f4a7fba1c2af833838e8c93d816e6194e5cd

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
<<<<<<< HEAD
		assertNotNull(new Employee(260.6f,"USD",0.2f,EmployeeType.Worker));
=======
		assertNotNull(new Employee(3000f, "USD", 0.15f, EmployeeType.Manager));
>>>>>>> 1c77f4a7fba1c2af833838e8c93d816e6194e5cd
	}

	@Test
	public void testCs() {
<<<<<<< HEAD
		Employee dollarWorker = new Employee(1000f,"USD",10f,EmployeeType.Worker);
		Employee euroWorker = new Employee(1000f,"euro",10f,EmployeeType.Worker);
		Employee dollarSupervisor = new Employee(1000f,"USD",10f,EmployeeType.Supervisor);
		Employee euroSupervisor = new Employee(1000f,"euro",10f,EmployeeType.Supervisor);
		assertEquals(new BigDecimal(1000),new BigDecimal(dollarWorker.cs()));
		
		
=======
		Employee usdManager = new Employee(3000f, "USD", 15f, EmployeeType.Manager);
		Employee euManager = new Employee(3000f, "EU", 25f, EmployeeType.Manager);
		Assert.assertEquals(new BigDecimal (usdManager.cs()), new BigDecimal(0));
		Assert.assertEquals(new BigDecimal (euManager.cs()), new BigDecimal(0));
>>>>>>> 1c77f4a7fba1c2af833838e8c93d816e6194e5cd
	}

	@Test
	public void testCalculateYearBonus() {
		fail("Not yet implemented");
	}

}
