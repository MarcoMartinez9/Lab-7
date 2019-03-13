
public class HealthyPerson extends Person
{
	
	private String reason;
	
	public HealthyPerson(String name, int age, String reason) {
		super(name, age);
		this.reason = reason;
	}


	@Override
	protected int compareToImpl(Person o) 
	{
		if(!(o instanceof HealthyPerson))
		{
		return 0;
		}
		else
		{
			return this.getName().compareToIgnoreCase(o.getName());
		}
	}
	
	@Override
	public String toString()
	{
		return String.format("%s In for %s", getName(), reason);
	}
}
