public class ArrayTest3 {
    public static void main(String[] args) {
        int [] lottonumbers = {233,444,678,675,897,678,453,567,455,456,453};
       
        int i = 1;       

        for(int tempValue : lottonumbers){

            System.out.println("index = "+ i +" value = "+tempValue);
            i+=2;
        }
    }
}
