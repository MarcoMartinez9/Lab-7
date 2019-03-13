import java.util.ArrayList;

public class QueueHospital<PatientType> extends Hospital<PatientType>
{
	private ArrayList<PatientType> queue;
	
	public QueueHospital()
	{
		queue = new ArrayList<PatientType>();
	}
	
	@Override
	public void addPatient(PatientType patient) {
		queue.add(patient);
	}

	@Override
	public PatientType nextPatient() {
		
		return queue.get(0);
	}

	@Override
	public PatientType treatNextPatient() {
		int first = queue.indexOf(0);
		return queue.remove(first);
	}

	@Override
	public int numPatients() {
		
		return queue.size();
	}

	@Override
	public String hospitalType() {
		
		return "QueueHospital";
	}

	@Override
	public String allPatientInfo() {
		String list = "";
		for(int i = 0; i < queue.size(); ++i)
		{
			list = list + queue.get(i).toString();
		}
		return list;
	}

}
