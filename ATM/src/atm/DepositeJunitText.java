package atm;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

import org.junit.jupiter.api.Test;

class DepositeJunitTest {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	LinkedHashSet<Account> customerList = new LinkedHashSet<>();
	@Test
	void withdrawalTest() throws IOException {
		customerList = Validation.userObjectsCreation(customerList);
		Account obj = customerList.stream().findFirst().get();
			String result = Operation.deposite(br,0,Operation.addNotesToMachine(),obj);
			assertEquals("Money deposited Successfully!",result);
	}

}