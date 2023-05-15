public class spock{
	public static void main(String[]args){
	int mask = 1;
	int count = 2;
	if (((2<7) || (++count <10))| (--count <10)) mask =mask+1;
	
	if (!(mask>1)&& --count>1) mask = mask+10;
	System.out.print(mask + " " + count);
	
	}
}
