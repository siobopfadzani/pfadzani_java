 enum ABC {

    ABC;
    int i = 1;
    {
        i++;
    }
    
    {
        ++i;
    }
    private ABC()
    {
        i = i++ + ++i;
    }
}
