import java.util.*;
class ThrillVilleApplication
{
public static void main()
{
Scanner scanner=new Scanner(System.in);
int c;


    Support.welcome();

    
    entrance b=new entrance();
    b.information();

    Support.EnterToContinue();
    
    
    do
    {
        System.out.println("\t\t\t\t\t\t************************************************************************************************* ");
        System.out.println("\t\t\t\t\t\t**        M    M         AAA      II  NN     N          M     M      EEEEEE NN     N  U   U    ** ");   
        System.out.println("\t\t\t\t\t\t**       M M  M M       A   A     II  N N    N         M M   M M     E      N N    N  U   U    ** ");                  
        System.out.println("\t\t\t\t\t\t**      M   MM   M     A AAA A    II  N  N   N        M   MMM   M    EEEE   N  N   N  U   U    ** ");           
        System.out.println("\t\t\t\t\t\t**     M          M   A       A   II  N   N  N       M           M   E      N   N  N  U   U    ** ");         
        System.out.println("\t\t\t\t\t\t**    M            M A         A  II  N    NNN      M             M  EEEEEE N    NNN  UUUUU    ** ");                        
        System.out.println("\t\t\t\t\t\t************************************************************************************************* ");
        

        System.out.println("\n");
        System.out.println("\n\t\t\t\t1.Rooms");
        System.out.println("\n\t\t\t\t2.FoodCourt");
        System.out.println("\n\t\t\t\t3.Rides");
        System.out.println("\n\t\t\t\t4.See Map");
        System.out.println("\n\t\t\t\t5.Exit");

        System.out.print("\n\t\t\t\t Enter Choice  : ");
        c=scanner.nextInt();

        if(c==1)
        {
            rooms c1=new rooms();
            c1.room();
        }
        else if(c==2)
        {
            foodcourt d=new foodcourt();
            d.food();
        }
        else if(c==3)
        {
            rides r=new rides();
            r.rides();
        }
        else if(c==4)
        {
            Map e=new Map();
            e.map();
        }
        else if (c!=5)
        {
            System.out.println("Invalid Option");
        }
        
        
    } while (c!=5);
        
        Support. exit();
        
    }// main ends
    
    
    
    
    
   
    
}// class ends