import org.junit.Assert;
import org.junit.Test;

public class HospitalTest {

	@Test
	public final void testAddPatient() {
		Hospital<Person> a = new StackHospital<Person>();
		Person b = new HealthyPerson("Mom", 21, "Check up");
		Person b1 = new HealthyPerson("Dad", 21, "Check up");
		a.addPatient(b);
		a.addPatient(b1);
		Assert.assertEquals("A StackHospital-type hospital with 2 patients.", a);
		
		Hospital<Person> c = new QueueHospital<Person>();
		Person d = new SickPerson("Mom", 21, 1);
		c.addPatient(d);
		Assert.assertEquals("Mom In for Check up", c.allPatientInfo());
		
		
	}

	@Test
	public final void testNextPatient() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testTreatNextPatient() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testNumPatients() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testHospitalType() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testAllPatientInfo() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testToString() {
		fail("Not yet implemented"); // TODO
	}

}
