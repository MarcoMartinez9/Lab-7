import java.util.ArrayList;

public class StackHospital<PatientType> extends Hospital<PatientType>
{
	private ArrayList<PatientType> stack;
	
	public StackHospital()
	{
		stack = new ArrayList<PatientType>();
	}
	
	@Override
	public void addPatient(PatientType patient) {
		stack.add(patient);
	}

	@Override
	public PatientType nextPatient() {
		int lastPerson = stack.size() - 1;
		return stack.get(lastPerson);
	}

	@Override
	public PatientType treatNextPatient() {
		int nextPerson = stack.size() - 1;
		return stack.remove(nextPerson);
	}

	@Override
	public int numPatients() {
		return stack.size();
	}

	@Override
	public String hospitalType() {
		return "StackHospital";
	}

	@Override
	public String allPatientInfo() {
		String list = "";
		for(int i = 0; i < stack.size(); ++i)
		{
			list = list + stack.get(i).toString();
		}
		return list;
	}


}
