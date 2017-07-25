package student;

public class StudenttoSting {
    private String name;
    private int rollNumber;
    private String div;
    public String  toString(){
        String Printstring="Name:-"+name +"\t"+"\tRollno:-"+rollNumber +"\t"+"Div:-"+div;
        return Printstring;
    }
    public void setname(String name,int rollNumber,String div){
        this.name=name;
        this.rollNumber=rollNumber;
        this.div=div;
    }
}
