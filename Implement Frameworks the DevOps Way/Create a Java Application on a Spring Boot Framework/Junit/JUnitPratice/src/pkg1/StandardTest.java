package pkg1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StandardTest {

	@BeforeAll
	public static void beforeAll(){
		System.out.println("Before all test cases");
	}
	@BeforeEach
	public void beforeEach() {
		System.out.println("Before each Test cases");
	}
	@DisplayName("Standard Test")
	@Test
	public void test() {
		System.out.println("Test case 1");
	}
	
	@Test
	public void test1() {
		System.out.println("Test case 2");
	}
	@AfterEach
	public void afterEach() {
		System.out.println("After each test case");
	}
	@org.junit.jupiter.api.AfterAll
	public static void AfterAll() {
		System.out.println("after all test cases");
	}
	@Disabled
	@Test
	public void skippedTest() {
		System.out.println("Skipped Test case");
	}
}
