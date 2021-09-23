class PassOrFail{
public static void main(String[] args){
int english=10, maths=16, java=5, physics=15, electronics=19; 
float total, percentage;
total = english+java+electronics+physics+maths;
percentage = (total/500)*100;
if(percentage>79 && percentage<100)
{System.out.println("Mehnti Ahhyo Par Skills Bhii Thahyo.");
System.out.println("Total Marks =  "+total);
System.out.println("Marks Percentage =  "+percentage);}
if(percentage>69 && percentage<79)
{System.out.println("Thor Anya Parhin Ta Top Kande Per Chad Yar Eien Theek Ahhin bs Mehnat kr.");
System.out.println("Total Marks =  "+total);
System.out.println("Marks Percentage =  "+percentage);}
if(percentage>59 && percentage<69)
{System.out.println("Tu Wich Me Ahhin Maza Tunja Ahhin Na Pass Ji Khushi Na Fail Jo Gham");
System.out.println("Total Marks =  "+total);
System.out.println("Marks Percentage =  "+percentage);}
if(percentage>49 && percentage<59)
{System.out.println("Bachi Wayen Nata Khain Ha Pee Ja Talarh.");
System.out.println("Total Marks =  "+total);
System.out.println("Marks Percentage =  "+percentage);}
if(percentage>0 && percentage<49)
{System.out.println("VC Thahande?");
System.out.println("Total Marks =  "+total);
System.out.println("Marks Percentage =  "+percentage);}
}
}