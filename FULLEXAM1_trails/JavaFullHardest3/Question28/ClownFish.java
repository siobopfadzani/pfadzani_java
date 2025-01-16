package Question28;
 interface Fish {
    public default int getNumberOfGrills(int input){return 2;}
    
}
public class ClownFish implements Fish{
    public String getNumberOfGrills(){return "4";}
    // public String getNumberOfGrills(int input ){return "6";}
    public static void main(String[] args) {
        System.out.println(new ClownFish().getNumberOfGrills(1));
    }

    
}
