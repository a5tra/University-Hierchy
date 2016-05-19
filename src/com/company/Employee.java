package com.company;

/**
 *
 * @author sabbi
 */
import java.lang.String;
public class Employee extends Comunity
{
    private String name;
    private String ID;
    private double salary;
    private double increment;


    public Employee(String nam,String i,int sal,int incr,String dep,String ins)
    {
        super(dep,ins);
        name=nam;
        ID=i;
        salary=sal;
        increment=incr;
    }
    public String get_name(){return name;}
    public String get_id(){return ID;}
    public double get_sal(){return salary;}
    public double get_inc(){return increment;}

    public void view()
    {
        super.view();
        System.out.println(name);
        System.out.println(ID);
        System.out.println(salary);
        System.out.println(increment);
    }
}
class faculty extends Employee
{
    private int facultyCode;
    private String designation;
    private int join_yr;

    public faculty(int fc,String des,int yr,String nam,String i,int sal,int incr,String dep,String ins)
    {
        super(nam,i,sal,incr,dep,ins);
        facultyCode=fc;
        designation=des;
        join_yr=yr;
    }

    public int get_facultyCode(){return facultyCode;}
    public int get_join_yr(){return join_yr;}
    public String get_designation(){return designation;}

    public void view()
    {
        super.view();
        System.out.println(facultyCode);
        System.out.println(designation);
        System.out.println(join_yr);
    }
}

class Administrator extends faculty
{
    private String position;
    private double duration;
    Administrator(String pos,double dur,int fc,String des,int yr,String nam,String i,int sal,int incr,String dep,String ins)
    {
        super(fc,des,yr,nam,i,sal,incr,dep,ins);
        position=pos;
        duration=dur;
    }
    String getPosition(){return position;}
    double getDuration(){return duration;}
    public void view()
    {
        super.view();
        System.out.println(position);
        System.out.println(duration);
    }
}
class Teacher extends faculty
{
    private int noCourses;
    private double weekHour;

    public Teacher(int nc,double hr,int fc,String des,int yr,String nam,String i,int sal,int incr,String dep,String ins)
    {
        super(fc,des,yr,nam,i,sal,incr,dep,ins);
        noCourses=nc;
        weekHour=hr;
    }

    public int getnoCourses(){return noCourses;}
    public double getWeekHour(){return weekHour;}
    public void view()
    {
        super.view();
        System.out.println(noCourses);
        System.out.println(weekHour);
    }
}
class stuff extends Employee
{
    private int join_year;
    private int dur;

    public stuff(int jy,int durat,String nam,String i,int sal,int incr,String dep,String ins)
    {
        super(nam,i,sal,incr,dep,ins);
        join_year=jy;
        dur=durat;
    }

    public int get_jy(){return join_year;}
    public int get_durr(){return dur;}

    public void view()
    {
        super.view();
        System.out.println(join_year);
        System.out.println(dur);
    }
}