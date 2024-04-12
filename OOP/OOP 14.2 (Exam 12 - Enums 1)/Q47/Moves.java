package Q47;
enum Moves
{
	UP
	{
		int getValue()
		{
			return ++value;
		}
	},

	DOWN
	{
		int getValue()
		{
			return --value;
		}
	},
	LEFT,RIGHT;
	int value = 5151;

	int getValue()
	{
		return value;
	}
}