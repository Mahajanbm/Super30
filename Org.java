import java.util.Scanner;
class Org
{
 int orgReg;
String orgName;
 String location;

void getData()
{Scanner s1=new Scanner(System.in);
System.out.println("Enter Org Reg Number");
orgReg= s1.nextInt();
System.out.println("Enter Org name ");
orgName=s1.next();
System.out.println("Enter location");
location=s1.next();
System.out.println("org Reg number is:  "+orgReg);
System.out.println("Org name is:  "+orgName);
System.out.println("Org location is: "+location);

}

public static void main(String args[] )
{Org o1=new Org();
 o1.getData();
o1.getData();


}


}