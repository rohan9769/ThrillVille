import java.util.*;

class Support
{

  public static void exit()
    {
        System.out.println("\t\t\t\t    ________                  .___ ___.                 ");
        System.out.println("\t\t\t\t   /  _____/  ____   ____   __| _/ \\_ |__ ___.__. ____  ");
        System.out.println("\t\t\t\t  /   \\  ___ /  _ \\ /  _ \\ / __ |   | __ <   |  |/ __ \\ ");
        System.out.println("\t\t\t\t  \\    \\_\\  (  <_> |  <_> ) /_/ |   | \\_\\ \\___  \\  ___/ ");
        System.out.println("\t\t\t\t   \\______  /\\____/ \\____/\\____ |   |___  / ____|\\___  >");
        System.out.println("\t\t\t\t          \\/                   \\/       \\/\\/         \\/ ");
        System.out.println("\t\t\t\t_______________________________________________________________________");
    }
    
    
    
    
    
    public static void welcome()
{
    String sp="";
    int i,j;
    
    String gateStr="$-$-$-$-$-$-$-$-$-$";
    int start =0;
    int end=gateStr.length();
    String gate=gateStr;
    
        System.out.println("\f");    
        
        for(i=1;i<=18;i++)
            {
                 System.out.println("\f");
                    System.out.println("                                                       ");
                    System.out.println("                                                     **  ");
                    System.out.println("                                                    ****");
                    System.out.println("                                                   ******");
                    System.out.println("                                                  ********");
                    System.out.println("                                                 **********");
                    System.out.println("                                                ************ ");
                    System.out.println("                                               **************");
                    System.out.println("                                              ****************");
                    System.out.println("                                             ******************");
                    System.out.println("                                            ********************");
                    System.out.println("                        **********************************************************");
                    System.out.println("                        **********" + gate + sp+ gate + "**********");
                    System.out.println("                        **********" + gate + sp+ gate + "**********");
                    System.out.println("                        **********" + gate + sp+ gate + "**********");
                    System.out.println("                        **********" + gate + sp+ gate + "**********");
                    System.out.println("                        **********" + gate + sp+ gate + "**********");
                    System.out.println("                        **********" + gate + sp+ gate + "**********");
                    System.out.println("                        **********" + gate + sp+ gate + "**********");
                    System.out.println("                        **********" + gate + sp+ gate + "**********");
                    System.out.println("                        **********" + gate + sp+ gate + "**********");
                    System.out.println("                        **********" + gate + sp+ gate + "**********");

                    for(j=1;j<=300000000;j++)
                    {
                        // empty delay loop    
                    } 
                    
    
                    sp=sp+"  ";  // increasing space 
                
                    gate=gateStr.substring(i,end);
                   

                   
          } // for ends
        
}



    public static void EnterToContinue()
    {
        char ch;
        Scanner ob=new Scanner(System.in);
        
        System.out.println("\n\n\t\t\t Press Any-key followed by \"Enter\" to continue ..... ");
        ch=ob.next().charAt(0);
        
        System.out.println("\f");
    }

}