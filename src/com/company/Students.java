package com.company;

/**
 * Created by sabbi on 5/18/2016.
 */
public class Students extends Comunity
{
    private String name;
    private int studentID;
    private String status;

    public Students(String n,int i,String st,String dep,String ins)
    {
        super(dep, ins);
        name=n;
        studentID=i;
        status=st;
    }

    public String getName(){return name;}
    public int getStudentID(){return studentID;}
    public String getStatus(){return status;}

    public void view()
    {
        super.view();
        System.out.println(name);
        System.out.println(studentID);
        System.out.println(status);
    }
}
