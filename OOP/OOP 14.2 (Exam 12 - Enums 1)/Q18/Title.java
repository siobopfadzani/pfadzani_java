public enum Title {

    MR("MR"),MRS("mrs"),MS("ms.");
    private String title;

    private Title(String s)
    {
        title = s;
    }

    public  String format(String first, String last)
    {
        return title+ " "+last;
    }

}
