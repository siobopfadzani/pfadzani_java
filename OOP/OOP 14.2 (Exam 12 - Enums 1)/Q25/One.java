package Q25;

class One 
{
    String one = "one";
    {
        one = one + "one";
    }
    enum Enums
    {
        ONE;
        One one = new One();
        {
            one.one = one.one + "one";
        }

        private Enums(){
            one.one = one.one + "one";
        }
    }
}