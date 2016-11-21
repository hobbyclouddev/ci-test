package HcApi;
import static org.junit.Assert.*;

import HcApi.Token.Token;
import org.junit.Test;

public class LoginTest {

	@Test
	public void GetTimeTest() {
		boolean timeResult = LoginManager.GetTime();
		assertTrue(timeResult);
	}

	@Test
	public  void TryLoginTest() {
		if (TryLogin())
		{
			assertTrue("Login ok, token valid",true);
		}
		else
		{
			TryRegistration();
			if (TryLogin())
			{
				assertTrue("Login ok, token valid",true);
			}
			else
			{
				assertTrue("##HIBA##  Success reg -> Login -> failed",false);
			}
		}
	}

	public static boolean TryLogin()
	{
		String token = LoginManager.Login("mark.rausch@telvice.hu", "12345");
		if (token.length()>0) {
			Token.setKey(token);
			return true;
		}
		else
		{
			return false;
		}
	}

	public static boolean TryRegistration()
	{
		return LoginManager.Registration("mark.rausch@telvice.hu", "12345","first", "last");
	}

	@Test
	public  void RegistrationTest() {

		if (TryRegistration()) {
			assertTrue("registration ok",true);
		}
		else
		{
			assertTrue("##HIBA##  registration failed",false);
		}
	}


}
