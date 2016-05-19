package com.company;

/**
 * Created by sabbi on 5/18/2016.
 */
public class Alumny extends Comunity
{
    private String name;
    private int passYear;

    public Alumny(String num,int py,String dep,String ins)
    {
        super(dep,ins);
        name=num;
        passYear=py;
    }
    public String getName(){return name;}
    public int getPassYear(){return passYear;}
    public void view()
    {
        super.view();
        System.out.println(name);
        System.out.println(passYear);
    }
}
