package Thamizh813;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPassword {

	@Test
	public void test() {
//		PasswordValidator p = new PasswordValidator();
//		boolean res = p.isValid("abc1224");
		boolean res = PasswordValidator.isValid("ahk4122");
		
		assertEquals(true,res);
	}

}
