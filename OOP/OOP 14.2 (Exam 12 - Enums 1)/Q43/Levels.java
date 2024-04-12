package Q43;
enum Levels 
{
	TOP,MEDIUM(10),BOTTOM(20,30);
	int i,j;

	private Levels()
	{

	}
	private Levels (int i)
	{
		this.i = i;
		// this.j = i;
	}
	private Levels(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
}