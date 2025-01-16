import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public  class Question01
{
	public static void main(String[]args)
	{
		// Date d = new Date();
		// DateFormat df = DateFormat.getDateInstance();
		// System.out.println(Locale.getDefaultLocale().getDisplayCountry() + " " + df.format(d));
		// System.out.println(Locale.getCurrent().getDisplayCountry() + " " + df.format(d));
		// System.out.println(Locale.getInstance().getDisplayCountry() + " " + df.format(d));
		// System.out.println(Locale.getDefault().getDisplayCountry() + " " + df.format(d));
		System.out.format("%2$d is bigger than %2$d",10,5);
	}
}