package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class quest4Test {

	quest4 multi;
	@BeforeAll
	static void SetupAll() {
		System.out.println("@BeforAll Method");

	}

	@BeforeEach
	void setup() {
		multi = new quest4();
		System.out.println("@BeforeEach Method");
	}

	@Test
	void test() {

		int expected = 4;
		int actual = multi.multiple(2, 2);
		assertEquals(expected, actual);
		System.out.println(actual);
	}

	@Test
	void test2() {
		int expected = 20;
		int actual = multi.multiple(4, 5);
		assertEquals(expected, actual);
		System.out.println(actual);

	}

	@AfterEach
	void setup2() {
		System.out.println("@AfteEach Method");
	}

	@AfterAll
	static void SetupAll2() {
		System.out.println("@AfterAll Method");

	}

}
