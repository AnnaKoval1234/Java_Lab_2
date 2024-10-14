class Name
{
    private String surName;
    private String firstName;
    private String lastName;
    
    public String getSurName()
    {
        return surName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setSurName(String surName)
    {
        this.surName = surName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public Name(String firstName)
    {
        this.surName = "";
        this.firstName = firstName;
        this.lastName = "";
    }
    public Name(String surName, String firstName)
    {
        this.surName = surName;
        this.firstName = firstName;
        this.lastName = "";
    }
    public Name(String surName, String firstName, String lastName)
    {
        this.surName = surName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString()
    {
        if ("".equals(surName) && "".equals(lastName))
            return firstName;
        else if ("".equals(lastName))
            return surName + " " + firstName;
        else
            return surName + " " + firstName + " " + lastName;
    }
}