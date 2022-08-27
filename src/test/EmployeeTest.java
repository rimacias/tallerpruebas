package test;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import tallerpruebas.*;

public class EmployeeTest {
	int mes = LocalDate.now().getMonthValue();
	Employee dollarWorker = new Employee(1000f, "USD", 10f, EmployeeType.Worker);
	Employee euroWorker = new Employee(1000f, "euro", 10f, EmployeeType.Worker);
	Employee usdManager = new Employee(3000f, "USD", 25f, EmployeeType.Manager);
	Employee euManager = new Employee(3000f, "EU", 25f, EmployeeType.Manager);
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
		assertNotNull(new Employee(260.6f, "USD", 0.2f, EmployeeType.Worker));
		assertNotNull(new Employee(3000f, "USD", 0.15f, EmployeeType.Manager));
	}

	@Test
	public void testCs() {
		if(mes%2!=0) {
			assertEquals(new BigDecimal(1064+1/3), new BigDecimal(dollarWorker.cs()));
			assertEquals(new BigDecimal(1014+1/3), new BigDecimal(euroWorker.cs()));
			assertEquals(new BigDecimal(usdManager.cs()), new BigDecimal(3081.8333333333));
			assertEquals(new BigDecimal(euManager.cs()), new BigDecimal(2931.8333333333));
		}else {
			assertEquals(new BigDecimal(1000), new BigDecimal(dollarWorker.cs()));
			assertEquals(new BigDecimal(950), new BigDecimal(euroWorker.cs()));
			assertEquals(new BigDecimal(usdManager.cs()), new BigDecimal(3017.5));
			assertEquals(new BigDecimal(euManager.cs()), new BigDecimal(2867.5));
		}
	}

	@Test
	public void testCalculateYearBonus() {
		assertEquals(new BigDecimal(386), new BigDecimal(dollarWorker.CalculateYearBonus()));
		assertEquals(new BigDecimal(usdManager.CalculateYearBonus()), new BigDecimal(3386));
		assertEquals(new BigDecimal(euManager.CalculateYearBonus()), new BigDecimal(3236));
	}

}
