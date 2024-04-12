public class spock{
	public static void main(String[]args){
	int mask = 0;
	int count = 0;
	if (((8>4) | (++count <10)) || ++count <10) mask =mask+1;
	if (!(6>8)^false) mask = mask+10;
	if ((mask>1)) mask = mask+10;
	System.out.print(mask + " " + count);
	
	}
}
