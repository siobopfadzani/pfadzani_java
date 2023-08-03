public class Q11 {

    double[] mymethod(double[] arr) {
        double value = 100;
        arr[0] = value;
        return arr;
    }

    public static void main(String[] args) {
        
        double[] arr = { 1, 4, 3, 6 };
        Q11 q11Instance = new Q11(); 
	
        for(int i =0;i<arr.length;i++)

        System.out.println(arr[i]);
    }
}

