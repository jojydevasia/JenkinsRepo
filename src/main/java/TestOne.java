import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOne {
	
	@Test
	public void test1() {
	    Assert.assertTrue(0>1);
	}
	
	@Test
	public void test2() {
		Assert.assertTrue(true  );
	}

}
