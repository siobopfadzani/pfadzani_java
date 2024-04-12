package Functional1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class LambdaEg3
{
    public static void main(String[] args) {
        List <String> friends = new ArrayList<String>(Arrays.asList("1Brain","Nate","Neal",
        "Raju","sara","scott"));
        friends.removeIf(e -> Arrays.asList("0","1","2","3","4","5","6","7","8","9")
                        .contains(e.substring(0,1)));
                        System.out.println(friends);
    }
}