package INheritance;

public class Childclass extends classInheritance{

    public static void main(String[] args) {
        Childclass clas = new Childclass();
        // clas.setAge(30);
        // System.out.println(clas.getAge()+" ");
        
        clas.getReasults();
    }

    void getReasults()
    {
        System.out.println(this.getAge()+ " ");
        this.setAge(30);
        System.out.println(getAge());
    }
    
}
