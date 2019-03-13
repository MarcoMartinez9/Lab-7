
import java.util.PriorityQueue;

public class PriorityQueueHospital<PatientType> extends Hospital<PatientType>
{
	private PriorityQueue<PatientType> queue;
	
	public PriorityQueueHospital()
	{
		queue = new PriorityQueue<PatientType>();
	}
	
	@Override
	public void addPatient(PatientType patient) {
		queue.add(patient);
	}

	@Override
	public PatientType nextPatient() {
		return queue.peek();
	}

	@Override
	public PatientType treatNextPatient() {
		return queue.poll();
	}

	@Override
	public int numPatients() {	
		return queue.size();
	}

	@Override
	public String hospitalType() {
		
		return "PriorityQueueHospital";
	}

	@Override
	public String allPatientInfo() {
		String list = "";
		for(PatientType patient: queue)
		{
			list = list + patient;
		}
		return list;
	}

}
