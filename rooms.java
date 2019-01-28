import java.util.*;
class rooms
{
public static void room()
{
Scanner scanner=new Scanner(System.in);
int c;
int i=1,n;

int cs;
String nm,ad;


    System.out.println("\f");
    
    System.out.println("\t\t\t\t                                           ");
    System.out.println("\t\t\t\t                     ___________            ");
    System.out.println("\t\t\t\t                    |           |           ");
    System.out.println("\t\t\t\t                    | __    __  |           ");
    System.out.println("\t\t\t\t                    ||__|  |__| |           ");
    System.out.println("\t\t\t\t             ______ | __    __  | ______    ");
    System.out.println("\t\t\t\t     /\\     |  __   ||__|  |__| |  __   |   ");
    System.out.println("\t\t\t\t    /  \\    | |__|  | __    __  | |__|  |   ");
    System.out.println("\t\t\t\t   /    \\   |  __   ||__|  |__| |  __   |   ");
    System.out.println("\t\t\t\t  /      \\  | |__|  | __    __  | |__|  |   ");
    System.out.println("\t\t\t\t |        | |  __   ||__|  |__| |  __   |   ");
    System.out.println("\t\t\t\t |   __   | | |__|  |     __    | |__|  |   ");
    System.out.println("\t\t\t\t |  |  |  | |       |    |  |   |       |   ");
    System.out.println("\t\t\t\t |__|__|__|_|_______|____|__|___|_______|   ");

    System.out.println("\n\t\t\t\t1.Royal Suites");
    System.out.println("\n\t\t\t\t2.Deluxe Rooms");
    System.out.println("\n\t\t\t\t3.Cottages");
    System.out.println("\n\t\t\t\t4.Exit");

    System.out.print("\n\t\t\t\tEnter Choice : ");
    c=scanner.nextInt();
    
    double b=0;
    double d,nb;
    
    if (c==1 || c==2 || c==3)
    {
        System.out.print ("\n\t\t\t\tEnter Name : ");
        nm=scanner.next();
        System.out.print("\n\t\t\t\tEnter Address : ");
        ad=scanner.next();
        System.out.print("\n\t\t\t\tEnter Number Of Days : ");
        n=scanner.nextInt();

        if(c==1)
        {
            cs=4000;
            b=n*cs;
        }
        else if(c==2)
        {
            cs=2500;
            b=n*cs;
        }
        else if(c==3)
        {
            cs=1500;
            b=n*cs;
        }
    
        if(n>7)
        {
            d=0.15*b;
        }
        else
        {
            d=0;
        }
        
        nb=b-d;
        
        System.out.println("\n\t\t\t\tName           :"+nm);
        System.out.println("\n\t\t\t\tAddress        :"+ad);
        System.out.println("\n\t\t\t\tNumber Of Days :"+n);
        System.out.println("\n\t\t\t\tBill           :"+b);
        System.out.println("\n\t\t\t\tNet Bill       :"+nb);
    
        System.out.println("\n\t\t\t\tThank You For Your Stay");
    }
    else 
    {
            System.out.println("\n\t\t\t\tReturning Back to main menu ....");
        
    }
    
    Support.EnterToContinue();

}//room ends

} // class ends











