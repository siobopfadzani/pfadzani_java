package Question35;

 interface Account {
    public default String getId()
    {
        return "0000";
    }
    
}
 interface PremiumAccount extends Account {

    abstract String hi ();
    String getId();
    default String getID(){return "111";}
}
