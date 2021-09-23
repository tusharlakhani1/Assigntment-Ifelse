class BijliKaBill{
public static void main(String args[]){
int unit=199;
float ziada,p= (unit/100)*10;
ziada=(unit*30)+p;
if (unit<100){
System.out.println("Your Bill Amount is: "+unit*5+" Rupees");}
if (unit>100 && unit<200){
System.out.println("Your Bill Amount is: "+unit*10+" Rupees");}
if (unit>200 && unit<300){
System.out.println("Your Bill Amount is: "+unit*20+" Rupees");}
if (unit>300){
System.out.println("Your Bill Amount is: "+ziada+" Rupees");}
}
}