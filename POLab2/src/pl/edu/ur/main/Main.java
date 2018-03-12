package pl.edu.ur.main;

import java.util.Scanner;
/**
 *
 * @author marcin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7
        
        //zad 3
        System.out.println("ZAD.3");
        System.out.println("Podaj 10 liczb do tablicy");
        Scanner input = new Scanner(System.in);
        int[] tab1 = new int[10];
        for(int i=0;i<10;i++){
            tab1[i]=input.nextInt();
        }
        int x;
        do{
        System.out.println("Wybierz operacje do wykonania:");
        System.out.println("1.Wyswietlanie tablicy od pierwszego do ostatniego indeksu.");
        System.out.println("2.Wyswietlanie tablicy od ostatniego do pierwszego indeksu.");
        System.out.println("3.Wyswietlanie elementow o nieparzystych indeksach.");
        System.out.println("4.Wyswietlanie elementow o parzystych indeksach.");
        System.out.println("5.Exit");
        
        x = input.nextInt();
        
        if(x==1){
            for(int i=0;i<10;i++) System.out.println(tab1[i]);  
        }
        else if(x==2){
            for(int i=9;i>=0;i--) System.out.println(tab1[i]);
        }
        else if(x==3){
            for(int i=1;i<10;i=i+2) System.out.println(tab1[i]);
        }
        else if(x==4){
            for(int i=0;i<9;i=i+2) System.out.println(tab1[i]); 
        }
        
        }while(x!=5);
        
        //zad 4
        System.out.println("ZAD.4");
        System.out.println("Podaj 10 liczb do tablicy");
        int tab2[] = new int[10];
        for(int i=0;i<10;i++){
            tab2[i]=input.nextInt();
        }
        int suma=0;
        int ilocz=0;
        int max=tab2[0];
        int min=tab2[0];
        
        for(int i=0;i<10;i++){
            suma=suma+tab2[i];
            ilocz=ilocz*tab2[i];
            if(tab2[i]>max) max=tab2[i];
            if(tab2[i]<min) min=tab2[i];
        }
        float sred=suma/10;
        
        int y;
        do{
            System.out.println("Co wyswietlic?");
            System.out.println("1.Suma");
            System.out.println("2.Iloczyn");
            System.out.println("3.Srednia");
            System.out.println("4.Element max");
            System.out.println("5.Element min");
            System.out.println("6.Exit");
            y = input.nextInt();
            
            if(y==1) System.out.println("Suma wynosi: "+suma);
            else if(y==2) System.out.println("Iloczyn wynosi: "+ilocz);
            else if(y==3) System.out.println("Srednia wynosi: "+sred);
            else if(y==4) System.out.println("Element max wynosi: "+max);
            else if(y==5) System.out.println("Element min wynosi: "+min);
        }while(y!=6);
         
        //zad 6
        System.out.println("ZAD.6");
        
        int z=1;
        System.out.println("Petla nieskonczona - aby skonczyc wprowadzanie wpisz ujemna liczbe");
        while(z>0) z=input.nextInt();
            
        //zad 7
        System.out.println("ZAD.7");
        System.out.println("Ile liczb wprowwadzisz: ");
        int n = input.nextInt();
        int tab3[] = new int[n];
        System.out.println("Wprowadz "+n+" liczb");
        for(int i=0;i<n;i++){
            tab3[i]=input.nextInt();
        }
        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(tab3[j]>tab3[j+1]){
                    temp = tab3[j];
                    tab3[j] = tab3[j+1];
                    tab3[j+1] = temp;
                }
            }
        }
        System.out.println("Tablica po sortowaniu:");
        for(int i=0;i<n;i++) System.out.println(+tab3[i]);
    }
    
}
