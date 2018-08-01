/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railwaystationscenarioproject;
import java.util.Scanner;
import java.util.*;
import java.util.Date;
/**
 *
 * @author Muhammad Taha Azam
 */

class Train{

    
}
class Reservation{
String name,cnic;
int nom;
double phone;
    
public void ticket(String name, String cnic, int nom,double phone){
this.name=name;
this.cnic=cnic;
this.nom=nom;

  
}
    
    }

public class RailwayStationScenarioProject {

    public static void main(String[] args) {
        // TODO code application logic here
Scanner obj=new Scanner(System.in);
      System.out.println("Enter name");
      String name=obj.nextLine();
        System.out.println("Enter cnic number");
        String cnic=obj.nextLine();
        System.out.println("Enter no of members");
        int numofmem=obj.nextInt();
        
    
Reservation ob=new Reservation("name","cnic",numofmem);

    }
    
}
