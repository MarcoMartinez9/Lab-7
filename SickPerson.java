
public class SickPerson extends Person
{

	private int severity;

	public SickPerson(String name, int age, int severity) {
		super(name, age);
		this.severity = severity;
	}
	

	@Override
	protected int compareToImpl(Person o) {
		SickPerson name = (SickPerson) o;
		if(!(name instanceof SickPerson))
		{
		return 0;
		}
		else
		{
			if(this.severity > name.severity)
			{
				return -1;
			}
			else if(this.severity < name.severity)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		
	}
	
	@Override
	public String toString()
	{
		return String.format("%s Severity level %d", getName(), severity);
	}

}
