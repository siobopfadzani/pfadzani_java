public enum Day 
{
	MONDAY(1),
	TUESDAY(2),
	WEDNESDAY(3),
	Thursday(4),
    Friday(5),
    Saturday(6),
    Sunday(7);

	Day(int level)
    {
		excitement = level;
	}
	 
	private int excitement;
	 
	public int getExcitement()
    {
		return excitement;
	}	
}
