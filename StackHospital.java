import java.util.ArrayList;

public class StackHospital<PatientType> extends Hospital<PatientType>
{
	public StackHospital()
	{
		ArrayList<PatientType> patientStack = new ArrayList<PatientType>();
	}
	
	@Override
	public void addPatient(PatientType patient) {
		addPatient(patient);
	}

	@Override
	public PatientType nextPatient() {
		return nextPatient();
	}

	@Override
	public PatientType treatNextPatient() {
		return treatNextPatient();
	}

	@Override
	public int numPatients() {
		return numPatients();
	}

	@Override
	public String hospitalType() {
		return hospitalType();
	}

	@Override
	public String allPatientInfo() {
		return allPatientInfo();
	}


}
