package Lambdas13;

public class Main{

    public static void main(String[] args) {
        InterFaceFunctional increments = (a) ->{
            a++;
            return a;
    };
    System.out.println("incremented value "+ increments.increment(20));
  }
}
