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
	static int mes = LocalDate.now().getMonthValue();;
	
	static Employee dollarWorker;
	static Employee euroWorker;
	static Employee usdManager;
	static Employee euManager;
	static BigDecimal CS_USD_W_EXPECTED;
	static BigDecimal CS_EU_W_EXPECTED;
	static BigDecimal CS_USD_M_EXPECTED;
	static BigDecimal CS_EU_M_EXPECTED;
	static BigDecimal CYB_W_EXPECTED;
	static BigDecimal CYB_USD_M_EXPECTED;
	static BigDecimal CYB_EU_M_EXPECTED;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Boolean isEven = mes % 2 == 0;
		dollarWorker = new Employee(1000f, "USD", 10f, EmployeeType.Worker);
		euroWorker = new Employee(1000f, "euro", 10f, EmployeeType.Worker);
		usdManager = new Employee(3000f, "USD", 25f, EmployeeType.Manager);
		euManager = new Employee(3000f, "EU", 25f, EmployeeType.Manager);
		CS_USD_M_EXPECTED = isEven ? new BigDecimal(3017.5) : new BigDecimal(3081.8333333333);
		CS_EU_M_EXPECTED = isEven ? new BigDecimal(2867.5) : new BigDecimal(2931.8333333333);
		CS_USD_W_EXPECTED = isEven ? new BigDecimal(1000) : new BigDecimal(1064 + 1 / 3);
		CS_EU_W_EXPECTED = isEven ? new BigDecimal(950) : new BigDecimal(1014 + 1 / 3);
		CYB_W_EXPECTED = new BigDecimal(386);
		CYB_USD_M_EXPECTED = new BigDecimal(3386);
		CYB_EU_M_EXPECTED = new BigDecimal(3236);
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
		assertEquals(new BigDecimal(dollarWorker.cs()), CS_USD_W_EXPECTED);
		assertEquals(new BigDecimal(euroWorker.cs()), CS_EU_W_EXPECTED);
		assertEquals(new BigDecimal(usdManager.cs()), CS_USD_M_EXPECTED);
		assertEquals(new BigDecimal(euManager.cs()), CS_EU_M_EXPECTED);
	}

	@Test
	public void testCalculateYearBonus() {
		assertEquals(new BigDecimal(dollarWorker.CalculateYearBonus()), CYB_W_EXPECTED);
		assertEquals(new BigDecimal(usdManager.CalculateYearBonus()), CYB_USD_M_EXPECTED);
		assertEquals(new BigDecimal(euManager.CalculateYearBonus()), CYB_EU_M_EXPECTED);
	}

}
