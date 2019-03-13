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
		
		
		Hospital<Person> c = new QueueHospital<Person>();
		Person d = new SickPerson("Mom", 21, 1);
		Person e = new SickPerson("Dad", 21, 3);
		c.addPatient(d);
		c.addPatient(e);
		
		
		Hospital<Person> f = new PriorityQueueHospital<Person>();
		Person g = new HealthyPerson("Mom", 21, "Check up");
		Person h = new HealthyPerson("Dad", 21, "Check up");
		f.addPatient(g);
		f.addPatient(h);
		
	}

	@Test
	public final void testNextPatient() {
		Hospital<Person> a = new StackHospital<Person>();
		Person b = new HealthyPerson("Mom", 21, "Check up");
		Person b1 = new HealthyPerson("Dad", 21, "Check up");
		a.addPatient(b);
		a.addPatient(b1);
		Assert.assertEquals(b1, a.nextPatient());
		
		Hospital<Person> c = new QueueHospital<Person>();
		Person d = new SickPerson("Mom", 21, 1);
		Person e = new SickPerson("Dad", 21, 3);
		c.addPatient(d);
		c.addPatient(e);
		Assert.assertEquals(d, c.nextPatient());
		
		Hospital<Person> f = new PriorityQueueHospital<Person>();
		Person g = new HealthyPerson("Mom", 21, "Check up");
		Person h = new HealthyPerson("Dad", 21, "Check up");
		f.addPatient(g);
		f.addPatient(h);
		Assert.assertEquals(h, f.nextPatient());
	}

	@Test
	public final void testTreatNextPatient() {
		Hospital<Person> a = new StackHospital<Person>();
		Person b = new HealthyPerson("Mom", 21, "Check up");
		Person b1 = new HealthyPerson("Dad", 21, "Check up");
		a.addPatient(b);
		a.addPatient(b1);
		Assert.assertEquals(b1, a.treatNextPatient());
		
		Hospital<Person> c = new QueueHospital<Person>();
		Person d = new SickPerson("Mom", 21, 1);
		Person e = new SickPerson("Dad", 21, 3);
		c.addPatient(d);
		c.addPatient(e);
		//Assert.assertEquals(e, c.treatNextPatient());
		
		Hospital<Person> f = new PriorityQueueHospital<Person>();
		Person g = new HealthyPerson("Mom", 21, "Check up");
		Person h = new HealthyPerson("Dad", 21, "Check up");
		f.addPatient(g);
		f.addPatient(h);
		Assert.assertEquals(h, f.treatNextPatient());
	}

	@Test
	public final void testNumPatients() {
		Hospital<Person> a = new StackHospital<Person>();
		Person b = new HealthyPerson("Mom", 21, "Check up");
		Person b1 = new HealthyPerson("Dad", 21, "Check up");
		a.addPatient(b);
		a.addPatient(b1);
		Assert.assertEquals(2, a.numPatients());
		
		Hospital<Person> c = new QueueHospital<Person>();
		Person d = new SickPerson("Mom", 21, 1);
		Person e = new SickPerson("Dad", 21, 3);
		c.addPatient(d);
		c.addPatient(e);
		Assert.assertEquals(2, c.numPatients());
		
		Hospital<Person> f = new PriorityQueueHospital<Person>();
		Person g = new HealthyPerson("Mom", 21, "Check up");
		Person h = new HealthyPerson("Dad", 21, "Check up");
		f.addPatient(g);
		f.addPatient(h);
		Assert.assertEquals(2, f.numPatients());
	}

	@Test
	public final void testHospitalType() {
		Hospital<Person> a = new StackHospital<Person>();
		Person b = new HealthyPerson("Mom", 21, "Check up");
		Person b1 = new HealthyPerson("Dad", 21, "Check up");
		a.addPatient(b);
		a.addPatient(b1);
		Assert.assertEquals("StackHospital", a.hospitalType());
		
		Hospital<Person> c = new QueueHospital<Person>();
		Person d = new SickPerson("Mom", 21, 1);
		Person e = new SickPerson("Dad", 21, 3);
		c.addPatient(d);
		c.addPatient(e);
		Assert.assertEquals("QueueHospital", c.hospitalType());
		
		Hospital<Person> f = new PriorityQueueHospital<Person>();
		Person g = new HealthyPerson("Mom", 21, "Check up");
		Person h = new HealthyPerson("Dad", 21, "Check up");
		f.addPatient(g);
		f.addPatient(h);
		Assert.assertEquals("PriorityQueueHospital", f.hospitalType());
	}

	@Test
	public final void testAllPatientInfo() {
		Hospital<Person> a = new StackHospital<Person>();
		Person b = new HealthyPerson("Mom", 21, "Check up");
		Person b1 = new HealthyPerson("Dad", 21, "Check up");
		a.addPatient(b);
		a.addPatient(b1);
		Assert.assertEquals("Mom In for Check upDad In for Check up", a.allPatientInfo());
		
		Hospital<Person> c = new QueueHospital<Person>();
		Person d = new SickPerson("Mom", 21, 1);
		Person e = new SickPerson("Dad", 21, 3);
		c.addPatient(d);
		c.addPatient(e);
		Assert.assertEquals("Mom Severity level 1Dad Severity level 3", c.allPatientInfo());
		
		Hospital<Person> f = new PriorityQueueHospital<Person>();
		Person g = new HealthyPerson("Mom", 21, "Check up");
		Person h = new HealthyPerson("Dad", 21, "Check up");
		f.addPatient(g);
		f.addPatient(h);
		Assert.assertEquals("Dad In for Check upMom In for Check up", f.allPatientInfo());
	}

	@Test
	public final void testToString() {
		Hospital<Person> a = new StackHospital<Person>();
		Person b = new HealthyPerson("Mom", 21, "Check up");
		Person b1 = new HealthyPerson("Dad", 21, "Check up");
		a.addPatient(b);
		a.addPatient(b1);
		Assert.assertEquals("A StackHospital-type hospital with 2 patients.", a.toString());
		
		Hospital<Person> c = new QueueHospital<Person>();
		Person d = new SickPerson("Mom", 21, 1);
		Person e = new SickPerson("Dad", 21, 3);
		c.addPatient(d);
		c.addPatient(e);
		Assert.assertEquals("A QueueHospital-type hospital with 2 patients.", c.toString());
		
		Hospital<Person> f = new PriorityQueueHospital<Person>();
		Person g = new HealthyPerson("Mom", 21, "Check up");
		Person h = new HealthyPerson("Dad", 21, "Check up");
		f.addPatient(g);
		f.addPatient(h);
		Assert.assertEquals("A PriorityQueueHospital-type hospital with 2 patients.", f.toString());
	}

}
