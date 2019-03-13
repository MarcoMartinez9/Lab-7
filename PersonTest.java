import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
	

	@Test
	public void testGetName() {
		Person a = new SickPerson("Mom", 21, 5);
		Person b = new HealthyPerson("Dad", 22, "Check up");
		Assert.assertEquals(a.getName(), "Mom");
		Assert.assertEquals(b.getName(), "Dad");
		
	}

	@Test
	public void testGetAge() {
		Person a = new SickPerson("Mom", 21, 5);
		Person b = new HealthyPerson("Dad", 22, "Check up");
		Assert.assertEquals(a.getAge(), 21);
		Assert.assertEquals(b.getAge(), 22);
	}

	@Test
	public void testCompareToImpl() {
		
		Person one = new HealthyPerson("Mom", 21, "Check up");
		Person two = new SickPerson("Dad", 22, 1);
		Assert.assertEquals(one.compareToImpl(two), 0);
		
		Person a = new SickPerson("Mom", 21, 1);
		Person b = new SickPerson("Dad", 22, 1);
		Assert.assertEquals(a.compareToImpl(b), 0);
		
		Person c = new SickPerson("Mom", 21, 5);
		Person d = new SickPerson("Dad", 22, 1);
		Assert.assertEquals(c.compareToImpl(d), -1);
		
		Person e = new SickPerson("Mom", 21, 1);
		Person f = new SickPerson("Dad", 22, 5);
		Assert.assertEquals(e.compareToImpl(f), 1);
		
	}

	@Test
	public void testCompareTo() {
		
		Person a = new SickPerson("Mom", 21, 1);
		Person b = new SickPerson("Dad", 21, 3);
		Assert.assertEquals(1, a.compareTo(b));
		
		Person c = new HealthyPerson("Mom", 21, "Check Up");
		Person d = new HealthyPerson("Dad", 22, "Check Up");
		Assert.assertEquals(9, c.compareTo(d));
	}

	@Test
	public void testToString() {
		Person a = new HealthyPerson("Mom", 21, "Check Up");
		Person b = new SickPerson("Dad", 22, 1);
		
		Assert.assertEquals("Mom In for Check Up", a.toString());
		Assert.assertEquals("Dad Severity level 1", b.toString());
		
	}

}
