import java.util.*;
class entrance
{
String name;
String address;
int no;
int ticket;
int bill;
public  void information()
{

Scanner scanner=new Scanner(System.in);

System.out.println("                            WELCOME TO THRILL-VILLE");
System.out.println("                            ENTER AT YOUR OWN RISK");

System.out.print ("\n\t\t\t\tEnter your name : ");
name=scanner.next();
System.out.print("\n\t\t\t\tEnter your address : ");
address=scanner.next();
System.out.print("\n\t\t\t\tEnter your contact no. :");
no=scanner.nextInt();
System.out.print("\n\t\t\t\tEnter no. of tickets : ");
ticket=scanner.nextInt();

bill=ticket*500;
System.out.println("");
System.out.println("\n\t\t\t\tName:"+name);
System.out.println("\n\t\t\t\tAddress:"+address);
System.out.println("\n\t\t\t\tContact no.:"+no);
System.out.println("\n\t\t\t\tNo of tickets:"+ticket);
System.out.println("\n\t\t\t\tBill:"+bill);
}








}