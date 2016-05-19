package com.company;

public class Comunity
{
    private String Department;
    private String Institute;

    public Comunity(String dep,String ins)
    {
        Department=dep;
        Institute=ins;
    }
    public void view()
    {
        System.out.println(Department);
        System.out.println(Institute);
    }
    public String get_dep(){return Department;}
    public String get_ins(){return Institute;}
}