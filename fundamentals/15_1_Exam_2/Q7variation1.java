public class spock{
	public static void main(String[]args){
	int mask = 0;
	int count = 0;
	if (((++count <5))| ++count >10) mask =mask+1;
	if ((6>8)^false) mask = mask+10;
	if (!(mask>1)&& ++count>1) mask = mask+10;
	System.out.print(mask + " " + count);
	
	}
}
