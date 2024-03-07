public enum SeasonsOfTheYear 
{
    Summer(10),
    spring(20),
    fall(30),
    Winter(40); 
    
    SeasonsOfTheYear(int level)
    {
       levelExcitement = level; 
    }

    private int levelExcitement;

    public int getSeosonsOfTheYear()
    {
        return levelExcitement;
    }
} 