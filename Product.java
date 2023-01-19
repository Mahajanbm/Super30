import java.util.Scanner;
class Product
{
public static void main(String args[])
{  int pId;
String pName;
 float pPrice;
Scanner s1=new Scanner(System.in);

System.out.println("Enter Prouct Id ");
pId=s1.nextInt();
System.out.println("Enter Product name ");
pName=s1.next();

System.out.println("Enter Product price");
pPrice=s1.nextFloat();
System.out.println("Product Id is:  "+pId);
System.out.println("Product name is:  "+pName);
System.out.println("Product price is: "+pPrice);





}

}