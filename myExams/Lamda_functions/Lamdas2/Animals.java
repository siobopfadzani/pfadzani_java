package Lamda_functions.Lamdas2;

public class Animals {

    private String species;
    private boolean canhop;
    private boolean canswim;

    public Animals(String species, boolean canhop, boolean canswim)
    {
        this.species = species;
        this.canhop = canhop;
        this.canswim = canswim;

    }
    public boolean canhop()
    {
        return canhop;
    }
    public boolean canswim()
    {
        return canswim;
    }
    public String toString()
    {
        return species;
    }
    
}
