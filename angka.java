import java.util.Scanner;
class angka
{
public static void main(String[]args)
{
   
    //kamus data
    int bilangan;
    Scanner scan=new Scanner(System.in);

    //body program
    System.out.println("Masukkan bilangan : ");
    bilangan=scan.nextInt();
    if (bilangan<0){
        System.out.println("bilangan " +bilangan+ " adalah bilangan negatif");

    }
    if (bilangan>0){
        System.out.println("bilangan " +bilangan+ " adalah bilangan positif");
    }

    if (bilangan==0){
        System.out.println("bilangan " +bilangan+ " adalah bukan positif atau negatif");
    }
  }
}