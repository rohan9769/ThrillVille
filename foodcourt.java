import java.util.*;
class foodcourt
{
 public static void food()
 {int a,c,c3;
         
 int i=1;
           Scanner scanner =new Scanner(System.in);
     do
     {
      

      
      
      
      System.out.println("1.McDonalds");
      System.out.println("2.PizzaHut");
      System.out.println("3.DrinksCorner");
      System.out.println("4.PopcornKing");
      System.out.println("5.Exit");
      System.out.println("Enter a choice");
      a=scanner.nextInt();
      switch(a)
      {
          case 1:mac();
                 break;
           case 2:pizza();
                  break;     
           case 3:drinks();
                  break;
           case 4:popcorn();
                  break;
           case 5:break;       
           default:System.out.println("Invalid Option");
        }// switch ends
    i++;     
    }while(a!=5);//do while ends
    
}//main ends  


public static void pizza()

    {   
            Scanner scanner=new Scanner(System.in);
            
            int c;int c1;
            int b=0;
            int n;
            System.out.println("1.Margherita");
            System.out.println("2.Farmhouse");
            System.out.println("3.Peppy Paneer");
            System.out.println("4.Deluxe Veggie");
            System.out.println("5.Cheese&Barbeque Chicken");
            System.out.println("6.Spicy Chicken");
            System.out.println("7.Keema Do Pyaaza");
            System.out.println("8.Chicken Golden Delight");
          
            System.out.println("Enter a choice");
            c=scanner.nextInt();
            if(c>=1||c<=4)
            {
                  System.out.println("1.Regular   Rs.135");
                  System.out.println("2.Medium    Rs.240");
                  System.out.println("3.Large     Rs.395");
                  System.out.println("Enter choice");
                  c1=scanner.nextInt();
                  System.out.println("Enter number of pizza");
                  n=scanner.nextInt();
                  if(c1==1)
                  {
                    b=n*135;
                }
                 else if(c1==2)
                 {
                     b=n*240;
                    }
                    else if(c1==3)
                    {
                        b=n*395;
                    }
                    else
                    {
                        System.out.println("Invalid Option");
                        pizza();
                    }
                    System.out.println("Bill :"+b);
                    System.out.println("   Please Enjoy your meal");
                    System.out.println("   Thank You");
                    
                    
                }
                    else if(c<5||c>=8)
                    {
                        System.out.println("1.Regular  Rs.165");
                        System.out.println("2.Medium   Rs.280");
                        System.out.println("3.Large    Rs.440");
                        System.out.println("Enter a Choice");
                        c1=scanner.nextInt();
                        System.out.println("Enter number of pizza");
                        n=scanner.nextInt();
                        
                        if(c1==1)
                        {
                            b=n*165;
                        }
                        else if(c1==2)
                        {
                            b=n*280;
                        }
                        else if(c1==3)
                        {
                            b=n*440;
                        }    


                        else
                        {
                        System.out.println("Invalid Option");
                        pizza();
                        }//if else ends
                        
                        System.out.println("Bill :"+b);
                        System.out.println("   Please Enjoy your meal");
                        System.out.println("   Thank You");
                        
                      

                      
                    }  
       }//pizza ends
    
        public static void drinks()
        {  Scanner scanner=new Scanner(System.in);
            int c;int b=0;int n;
            System.out.println("1.Pepsi");
            System.out.println("2.Thumbsup");
            System.out.println("3.Limca");
            System.out.println("4.Sprite");
            System.out.println("5.Cloud9");
            System.out.println("6.Redbull");
            System.out.println("Enter a choice");
            c=scanner.nextInt();
            System.out.println("Enter number of drinks");
            n=scanner.nextInt();
            if(c>=1||c<=4)
            {
               b=n*35;
            }
            else if(c==5||c==6)
            {
                b=n*75;
            }
            else
            {
             System.out.println("Invalid Option");
             drinks();
             }//if else ends
             System.out.println("Bill  :"+b);
             System.out.println("  Please Enjoy your drink");
             System.out.println("  Thank You");
}//drinks ends
        public static void popcorn()
        { Scanner scanner=new Scanner(System.in);
          int c; int b=0;int n; 
         System.out.println("1.Salted Popcorn  Rs.25");
         System.out.println("2.Cheese Popcorn  Rs.30");
         System.out.println("3.Caramel Popcorn Rs.30");
         
         System.out.println("Enter a choice");
         c=scanner.nextInt();
         System.out.println("Enter number of popcorn");
         n=scanner.nextInt();
         if(c==1)
         {
             b=n*25;
            }
            else if(c==2||c==3)
            {
                b=n*35;
            }    
            else
           {
              System.out.println("Invalid Option");
              popcorn();
             }//if else ends
      System.out.println("     Bill   :"+b);
      System.out.println("     Please Enjoy");
      System.out.println("     Thank You");
            
        }//popcorn ends
        
        
        
        public static void mac()
        {
           int c;int c1;int b=0;int n;
           Scanner scanner=new Scanner(System.in);
           System.out.println("Menu");
           System.out.println("1.Burgers");
           System.out.println("2.Fries");
           
           c=scanner.nextInt();
           if(c<1&&c>3)
           {
                System.out.println("Invalid Option");
            }
            else if(c==1)
            {
                System.out.println("1.McAloo         Rs.25");
                System.out.println("2.McVeggie       Rs.45");
                System.out.println("3.ChickenMcGrill Rs.30");
                System.out.println("4.Fliet-o-Fish   Rs.70");
                System.out.println("5.Veg Zinger     Rs.55");
                System.out.println("6.Chicken Zinger Rs.65");
                System.out.println("Enter a choice");
                c=scanner.nextInt();
                System.out.println("Enter number of burgers ");
                n=scanner.nextInt();
                 
                    if(c==1)
                    {
                       b=n*25; 
                    }
                    else if(c==2)
                    {
                        b=n*45;
                    }
                    else if(c==3)
                    {
                        b=n*30;
                    }
                    else if(c==4)
                    {
                        b=n*70;
                    }
                    else if(c==5)
                    {
                        b=n*55;
                    }
                    else if(c==6)
                    {
                        b=n*65;
                    }
                    else
                    {   System.out.println();
                        System.out.println("Invalid Option");
                        mac();
                    }
                    System.out.println("  Bill  :"+b);
                    System.out.println("  Please Enjoy your meal");
                    System.out.println("  Thank You");
                    
                    
                }
              else if(c==2)
              {
                  System.out.println("1.Regular    Rs.32");
                  System.out.println("2.Medium     Rs.45");  
                  System.out.println("3.Large      Rs.55");
                  System.out.println("Enter a choice");
                  c1=scanner.nextInt();
                  System.out.println("Enter number of fries");
                  n=scanner.nextInt();
                     if(c1==1)
                     {
                        b=n*32;
                    }   
                    else if(c1==2)
                    {
                        b=n*45;
                    }
                    else if(c1==3)
                    {
                        b=n*55;
                    }

                        
                }
                        else
                        {
                            
                            System.out.println("Invalid Option");
                            System.out.println();
                        }//if else ends
                        System.out.println("  Bill  :"+b);
                        System.out.println("  Please Enjoy your meal");
                        System.out.println("  Thank You");
}//mac ends
}



 
 
     
                      
                   
                                         
                        
              
                     
                         
            
                           

     
           
            
                       
         
      