package errores_a_r;
import java.util.Scanner;

public class Errores_A_R {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double a1, a2,abs;
            System.out.println("Ingrese el valor Aproximado: ");
        a1=leer.nextDouble();
            System.out.println("Ingrese el valor Real: ");
        a2=leer.nextDouble();
        abs=Error_Absoluto(a1,a2);
        System.out.println("El error absoluto es: "+Error_Absoluto(a1,a2));
        System.out.println("El error relativo es: "+Error_Relativo(abs,a2));
        
    }
    
    public static double Error_Absoluto(double a1, double a2){
        double Abs;
        Abs=Math.abs(a2-a1);
        return Abs;
    }
    public static double Error_Relativo(double abs, double a2){
        double Rel;
        Rel=abs/a2;
        return Rel;
    }
}
