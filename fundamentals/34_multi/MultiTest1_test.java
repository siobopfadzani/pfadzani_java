public class MultiTest1 {
    public static void main(String[] args) {
    	
        int [][] lottogroups ={{1111,2222,3333,4444},{6666,7777,8888,9999},{11111,121212,131313}};

        System.out.println("Number of Groups (Outer Array): " + lottogroups.length);

        for(int i = 0;i < lottogroups.length ;i++){

           int innerArraySize = lottogroups[i].length;
           
            System.out.println("Group " + i + " Size (Inner Array): " + innerArraySize);
            System.out.println("Group :"+i);

            for(int j = 0;j < lottogroups[i].length ;j++){
                System.out.println("  Value "+j+" = "+lottogroups[i][j]);
            }        	
        }
    }
}
