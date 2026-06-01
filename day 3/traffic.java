import java.util.Scanner;	
public class traffic{
    public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the signal:");
String sig=sc.nextLine();
//char sig=sc.next().charAt(0)

switch(sig){
case "R":
System.out.println("Stop");
break;
case "Y":
System.out.println("Wait");
break;
case "G":
System.out.println("Go");
break;
default:
System.out.println("Invalid input");
}
sc.close();
}
}
 