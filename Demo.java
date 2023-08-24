/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;
import java.util.*;

/**
 *
 * @author 22cseb60
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("ENTER NO.OF ELEMENTS : ");
        int n = obj.nextInt();
        System.out.println("ENTER THE ARRAY ELEMENTS : ");
        int ele[] = new int[n];
        for (int i = 0; i < n; i++) {
            ele[i] = obj.nextInt();
        }
        System.out.println("ENTER THE SEARCH ELEMENTS : ");
        int search = obj.nextInt();
        searchelement s = new searchelement();
        s.find(ele,search);
    }
}

class searchelement
{
    int flag=0;
    void find(int e[],int a)
    {
     for(int i=0;i<e.length;i++)
     {
         if(e[i]==a)
         {
             flag=1;
             break;
         }
     }
     if(flag==1)
     {
         System.out.println("SEARCH ELEMENT IS PRESENT : ");
     }
     else
     {
         System.out.println("SEARCH ELEMENT IS NOT PRESENT : ");
     }
       
    }
}