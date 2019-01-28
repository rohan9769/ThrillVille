import java.util.*;
class rides
{
  public static void rides()
  {
      Scanner scanner=new Scanner(System.in);
      int c;
      int c1=0;
      int c2;
      int i=1;
      int n;
      int b;
      
      
      do
      {
      System.out.println("1.Coupon Centre");
      System.out.println("2.Exit");
      c=scanner.nextInt();
      
      if(c==1)
      {
          System.out.println("\n\t\t\t\t1.Miniature Railway       ");
          System.out.println("\n\t\t\t\t2.Feris Wheel             ");
          System.out.println("\n\t\t\t\t3.Spiral Slide            ");
          System.out.println("\n\t\t\t\t4.Steel Mini Rollercoaster");
          System.out.println("\n\t\t\t\t5.Steel Rollercoaster     ");
          System.out.println("\n\t\t\t\t6.Boat Ride               ");
          System.out.println("\n\t\t\t\t7.Log Fume                ");
          System.out.println("\n\t\t\t\t8.Exit                    ");
          System.out.println("Enter Choice            ");
          c1=scanner.nextInt();
             
               if(c1==1)
               {
                   System.out.println("\n\t\t\t\tMiniature Railway ");
                   System.out.println("\n\t\t\t\t- Narrow gauge raiway track with miniature passenger seats");
                   System.out.println("\n\t\t\t\tMaximum track slope         :25");
                   System.out.println("\n\t\t\t\tMaximum height above ground :29ft  ");
                   System.out.println("\n\t\t\t\tVehicles                    :Steam Train");
                   System.out.println("\n\t\t\t\tAge group                   :Below 12yrs");     
                   System.out.println("\n\t\t\t\tCost                        :Rs.100");
                   
                   System.out.println("Do you want to buy coupons ");
                   System.out.println("1.Yes     2.No             ");
                   c2=scanner.nextInt();
                   
                   if(c2==1)
                   {
                       System.out.println("Enter number of coupons ");
                       n=scanner.nextInt();
                       
                       b=n*100;
                       
                       System.out.println("Number of coupons :"+n);
                       System.out.println("Bill              :Rs."+b);
                       System.out.println("Thank You");
                       System.out.println("Please Enjoy your ride");
                       
                    }//if ends 
                    else if(c2==2)
                    {
                        break;
                    }
                    else
                    {
                       System.out.println("Invalid Option  ");
                       continue;
                    }//else ends
                }
                    
                    else if(c1==2)
                    {
                        System.out.println("Ferris Wheel");
                        System.out.println("-Large wheel with 16 self-righting chairs");
                        System.out.println("Age Group   :Any age");
                        System.out.println("Cost        :Rs.75  ");
                        System.out.println("Do you want to buy coupons ");
                   System.out.println("1.Yes     2.No             ");
                   c2=scanner.nextInt();
                   
                   if(c2==1)
                   {
                       System.out.println("Enter number of coupons ");
                       n=scanner.nextInt();
                       
                       b=n*175;
                       
                       System.out.println("Number of coupons :"+n);
                       System.out.println("Bill              :Rs."+b);
                       System.out.println("Thank You");
                       System.out.println("Please Enjoy your ride");
                       
                    }//if ends 
                    else if(c2==2)
                    {
                        break;
                    }
                    else
                    {
                       System.out.println("Invalid Option  ");
                       continue;
                    }
                }
                
                else if(c1==3)
                {
                    System.out.println("Spiral Slide ");
                    System.out.println("-Wooden Stucture with an internal staircase and external slide for use with slide mats");
                    System.out.println("Age Group   :Below 12");
                    System.out.println("Cost        :Rs.75   ");
                    
                   System.out.println("Do you want to buy coupons ");
                   System.out.println("1.Yes     2.No             ");
                   c2=scanner.nextInt();
                   
                   if(c2==1)
                   {
                       System.out.println("Enter number of coupons ");
                       n=scanner.nextInt();
                       
                       b=n*75;
                       
                       System.out.println("Number of coupons :"+n);
                       System.out.println("Bill              :Rs."+b);
                       System.out.println("Thank You");
                       System.out.println("Please Enjoy your ride");
                       
                    }//if ends 
                    else if(c2==2)
                    {
                        break;
                    }
                    else
                    {
                       System.out.println("Invalid Option  ");
                       continue;
                    }
                    
                    
                }
                else if(c1==4)
                {
                    System.out.println("Steel Mini RollerCoaster");
                    System.out.println("-Track has staal running rails with cross- bracing. ");
                    System.out.println(" Supporter are thin square section posts.Trains are ");
                    System.out.println(" held on the track by wheels above,below and outside");
                    System.out.println("the running rails.");
                    System.out.println("Maximum tracking slope      :60 ");
                    System.out.println("Lift hill maximum slope     :25");
                    System.out.println("Maximum height above ground :65ft");
                    System.out.println("Vehicles                    :'LadyBird'cars");
                    System.out.println("Age Group                   :Above 15  ");
                    System.out.println("Cost                        :Rs.120    ");
                    
                    System.out.println("Do you want to buy coupons ");
                   System.out.println("1.Yes     2.No             ");
                   c2=scanner.nextInt();
                   
                   if(c2==1)
                   {
                       System.out.println("Enter number of coupons ");
                       n=scanner.nextInt();
                       
                       b=n*120;
                       
                       System.out.println("Number of coupons :"+n);
                       System.out.println("Bill              :Rs."+b);
                       System.out.println("Thank You");
                       System.out.println("Please Enjoy your ride");
                    
                }
                else if(c2==2)
                    {
                        break;
                    }
                    else
                    {
                       System.out.println("Invalid Option  ");
                       continue;
                    }
            }
            else if(c1==5)
            {
                System.out.println("Steel RollerCoaster");
                System.out.println("-Track has a tabular steel spine ,connecting   ");
                System.out.println(" to the inside edges of tabular steel running  ");
                System.out.println(" rails.Supporters are large tabular steel      ");
                System.out.println(" posts.Trains are held on the track by wheels  ");
                System.out.println(" above,below and outside running rails.        ");
                System.out.println("Special Elements:Banked Curves,Vertical Loop,  ");
                System.out.println("                 Steep Twists,Banked Helox,on  ");
                System.out.println("                 ride photo                    ");                                          
                System.out.println("Banked Curves   :50 banking  ");
                System.out.println("Maximum Track slope:60");
                System.out.println("Lift hill max slope:25");
                System.out.println("Max height above ground:150ft");
                System.out.println("Vehicles           :RollerCoaster Train");
                System.out.println("Age Group          :Above 15");
                System.out.println("Cost               :Rs.170");
                System.out.println("Do you want to buy coupons ");
                   System.out.println("1.Yes     2.No             ");
                   c2=scanner.nextInt();
                   
                   if(c2==1)
                   {
                       System.out.println("Enter number of coupons ");
                       n=scanner.nextInt();
                       
                       b=n*170;
                       
                       System.out.println("Number of coupons :"+n);
                       System.out.println("Bill              :Rs."+b);
                       System.out.println("Thank You");
                       System.out.println("Please Enjoy your ride");
                    
                }
                else if(c2==2)
                    {
                        break;
                    }
                    else
                    {
                       System.out.println("Invalid Option  ");
                       continue;
                    }
            }
            
                
        
        else if(c1==6)
        {
            System.out.println("Boat Ride");
            System.out.println("-Boat Docks consists of wooden platforms ");
            System.out.println(" built on lake.Guide tracks can be built ");
            System.out.println(" to limit where passengers steer the boat.");
            System.out.println("Vehicles   :Rowing boat");
            System.out.println("Age Group  :any age    ");
            System.out.println("Cost       :Rs.150     ");
            
            System.out.println("Do you want to buy coupons ");
                   System.out.println("1.Yes     2.No             ");
                   c2=scanner.nextInt();
                   
                   if(c2==1)
                   {
                       System.out.println("Enter number of coupons ");
                       n=scanner.nextInt();
                       
                       b=n*100;
                       
                       System.out.println("Number of coupons :"+n);
                       System.out.println("Bill              :Rs."+b);
                       System.out.println("Thank You");
                       System.out.println("Please Enjoy your ride");
                       
                    }//if ends 
                    else if(c2==2)
                    {
                        break;
                    }
                    else
                    {
                       System.out.println("Invalid Option  ");
                       continue;
                    }//else ends
                }       
            else if(c1==7)
            {   
                System.out.println("Log Flume");
                System.out.println("-Water flume track supported by box section");
                System.out.println(" steel supporters.Boats are propelled up  ");
                System.out.println(" slopes on rollers and are freed to travel");
                System.out.println(" along water channel at their own pace");
                System.out.println("Maximum track slope         :25");
                System.out.println("Maximum height above ground :39ft");
                System.out.println("Vehicle                     :Log Flume Boat");
                System.out.println("Age Group                   :Above 12");
                System.out.println("Cost                        :190");
                System.out.println("Do you want to buy coupons    ");
                   System.out.println("1.Yes     2.No             ");
                   c2=scanner.nextInt();
                   
                   if(c2==1)
                   {
                       System.out.println("Enter number of coupons ");
                       n=scanner.nextInt();
                        
                       b=n*190;
                       
                       System.out.println("Number of coupons :"+n);
                       System.out.println("Bill              :Rs."+b);
                       System.out.println("Thank You");
                       System.out.println("Please Enjoy your ride");
                    }
                
                else if(c2==2)
                    {
                        break;
                    }
                    else
                    {
                       System.out.println("Invalid Option  ");
                       continue;
                    }
            }
            else if(c1==8)
            {
                rides();
            }    
            else
            {
                System.out.println("Invalid Option ");
                
            }    
                
            
            
            
            
            
        }// if ends
        i++;
    
}while(c!=2);//do while ends

   }// main ends
}//class ends
    
                
                        
                    
                       
                   
                       
                       
                       
                   
                  
          
          
          
   
