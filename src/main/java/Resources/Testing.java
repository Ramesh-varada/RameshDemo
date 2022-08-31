package Resources;

import org.testng.annotations.Test;

public class Testing extends Logintest
{
@Test
public void login() throws Throwable
{
	driver= driver();
	driver.get("https://www.youtube.com/watch?v=OwukisykQCw");
}
}
