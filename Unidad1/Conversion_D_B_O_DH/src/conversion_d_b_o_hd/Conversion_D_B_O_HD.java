package conversion_d_b_o_hd;
import java.util.Scanner;

public class Conversion_D_B_O_HD {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int op, op1, op2, op3;
        do {
            System.out.println("Menu:");
            System.out.println("1. Convertir Decimal");
            System.out.println("2. Convertir Binario");
            System.out.println("3. Convertir Octal");
            System.out.println("4. Convertir Hexadecimal");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            op =  leer.nextInt();
            switch (op) {
                case 1:
                    int decimalNumber;
                    System.out.print("Ingrese el numero decimal que desea convertir: ");
                    decimalNumber=leer.nextInt();
                    do{
                        System.out.println("Menu Decimal:");
                        System.out.println("1. Binario");
                        System.out.println("2. Octal");
                        System.out.println("3. Hexadecimal");
                        System.out.println("4. Regresar menu principal");
                        System.out.print("Seleccione una opcion: ");
                        op1 =  leer.nextInt();
                        switch (op1) {
                                case 1:                                    
                                    String binaryNumber = decimalToBinary(decimalNumber);
                                    System.out.println("El número binario equivalente de " + decimalNumber + " es: " + binaryNumber);
                                    break;
                                case 2:
                                    String octalNumber = decimalToOctal(decimalNumber);
                                    System.out.println("El número octal equivalente de " + decimalNumber + " es: " + octalNumber);
                                    break;
                                case 3:
                                    String hexadecimalNumber = decimalToHexadecimal(decimalNumber);
                                    System.out.println("El número hexadecimal equivalente de " + decimalNumber + " es: " + hexadecimalNumber);
                                    break;
                                case 4:
                                    System.out.println("Saliendo del programa...");
                                    break;
                                default:
                                    System.out.println("Opción inválida. Intente nuevamente.");
                            }
                            System.out.println();
                        } while (op1 != 4);
                    System.out.println("");
                    break;
                case 2:
                    String binaryNumber;
                    System.out.print("Ingrese el numero binario que desea convertir: ");
                    binaryNumber = leer.next();
                    do{
                        System.out.println("Menu Binario:");
                        System.out.println("1. Convertir Decimal");
                        System.out.println("2. Convertir Octal");
                        System.out.println("3. Convertir Hexadecimal");
                        System.out.println("4. Regresar menu principal");
                        System.out.print("Seleccione una opcion: ");
                        op1 =  leer.nextInt();
                        switch (op1) {
                                case 1:
                                    int decimalNumber1 = binaryToDecimal(binaryNumber);
                                    System.out.println("El número decimal equivalente de " + binaryNumber + " es: " + decimalNumber1);
                                    break;
                                case 2:
                                    String octalNumber = binaryToOctal(binaryNumber);
                                    System.out.println("El número octal equivalente de " + binaryNumber + " es: " + octalNumber);
                                    break;
                                case 3:
                                    String hexadecimalNumber = binaryToHexadecimal(binaryNumber);
                                    System.out.println("El número hexadecimal equivalente de " + binaryNumber + " es: " + hexadecimalNumber);
                                    break;
                                case 4:
                                    System.out.println("Saliendo del programa...");
                                    break;
                                default:
                                    System.out.println("Opción inválida. Intente nuevamente.");
                            }
                            System.out.println();
                        } while (op1 != 4);
                    System.out.println("");
                    break;
                case 3:
                    String octalNumber;
                    System.out.print("Ingrese el numero Octal que desea convertir: ");
                    octalNumber = leer.next();
                    do{
                        System.out.println("Menu:");
                        System.out.println("1. Convertir Binario");
                        System.out.println("2. Convertir Decimal");
                        System.out.println("3. Convertir Hexadecimal");
                        System.out.println("4. Regresar menu principal");
                        System.out.print("Seleccione una opcion: ");
                        op1 =  leer.nextInt();
                        switch (op1) {
                                case 1:
                                    int decimalNumber2 = octalToDecimal(octalNumber);
                                    System.out.println("El número decimal equivalente de " + octalNumber + " es: " + decimalNumber2);
                                    break;
                                case 2:
                                    String binaryNumber1 = octalToBinary(octalNumber);
                                    System.out.println("El número binario equivalente de " + octalNumber + " es: " + binaryNumber1);
                                    break;
                                case 3:
                                    String binaryNumber2 = octalToBinary(octalNumber);
                                    String hexadecimalNumber1 = binaryToHexadecimal(binaryNumber2);
                                    System.out.println("El número binario equivalente de " + octalNumber + " es: " + hexadecimalNumber1);
                                    break;
                                case 4:
                                    System.out.println("Saliendo del programa...");
                                    break;
                                default:
                                    System.out.println("Opción inválida. Intente nuevamente.");
                            }
                            System.out.println();
                        } while (op1 != 4);
                    System.out.println("Seleccione a que desea convertir su numero Decimal");
                    break;
                /*case 4:
                    do{
                        System.out.println("Menu:");
                        System.out.println("1. Convertir Binario");
                        System.out.println("2. Convertir Octal");
                        System.out.println("3. Convertir Decimal");
                        System.out.println("4. Regresar menu principal");
                        System.out.print("Seleccione una opcion: ");
                        op1 =  leer.nextInt();
                        switch (op1) {
                                case 1:
                                    System.out.println("Ha seleccionado la opción 1");
                                    break;
                                case 2:
                                    System.out.println("Ha seleccionado la opción 2");
                                    break;
                                case 3:
                                    System.out.println("Ha seleccionado la opción 3");
                                    break;
                                case 4:
                                    System.out.println("Saliendo del programa...");
                                    break;
                                default:
                                    System.out.println("Opción inválida. Intente nuevamente.");
                            }
                            System.out.println();
                        } while (op1 != 4);
                    System.out.println("Seleccione a que desea convertir su numero Decimal");
                    break;*/
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente...");
            }

            System.out.println();
        } while (op != 5);
    }
    
    //---------------------------------DECIMAL---------------------------------------//
    public static String decimalToBinary(int decimalNumber) {
        StringBuilder binary = new StringBuilder();

        if (decimalNumber == 0) {
            binary.append("0");
        }

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.insert(0, remainder);
            decimalNumber /= 2;
        }

        return binary.toString();
    }
    
     public static String decimalToOctal(int decimalNumber) {
        StringBuilder octal = new StringBuilder();

        if (decimalNumber == 0) {
            octal.append("0");
        }

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 8;
            octal.insert(0, remainder);
            decimalNumber /= 8;
        }

        return octal.toString();
    }
    
    public static String decimalToHexadecimal(int decimalNumber) {
        StringBuilder hexadecimal = new StringBuilder();

        if (decimalNumber == 0) {
            hexadecimal.append("0");
        }

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 16;
            hexadecimal.insert(0, getHexadecimalDigit(remainder));
            decimalNumber /= 16;
        }

        return hexadecimal.toString();
    }

    public static char getHexadecimalDigit(int digit) {
        if (digit < 10) {
            return (char) (digit + '0');
        } else {
            return (char) (digit - 10 + 'A');
        }
    }
    //---------------------------------BINARIO---------------------------------------//
    public static int binaryToDecimal(String binaryNumber) {
        int decimal = 0;
        int power = 0;

        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            if (binaryNumber.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        return decimal;
    }
    
    public static String binaryToOctal(String binaryNumber) {
        // Completar el número binario con ceros a la izquierda si es necesario
        while (binaryNumber.length() % 3 != 0) {
            binaryNumber = "0" + binaryNumber;
        }

        StringBuilder octal = new StringBuilder();
        int startIndex = 0;

        while (startIndex < binaryNumber.length()) {
            String binaryDigit = binaryNumber.substring(startIndex, startIndex + 3);
            int decimalDigit = Integer.parseInt(binaryDigit, 2);
            octal.append(decimalDigit);
            startIndex += 3;
        }

        return octal.toString();
    }
    
    public static String binaryToHexadecimal(String binaryNumber) {
        // Completar el número binario con ceros a la izquierda si es necesario
        while (binaryNumber.length() % 4 != 0) {
            binaryNumber = "0" + binaryNumber;
        }

        StringBuilder hexadecimal = new StringBuilder();
        int startIndex = 0;

        while (startIndex < binaryNumber.length()) {
            String binaryDigit = binaryNumber.substring(startIndex, startIndex + 4);
            int decimalDigit = Integer.parseInt(binaryDigit, 2);
            String hexDigit = Integer.toHexString(decimalDigit).toUpperCase();
            hexadecimal.append(hexDigit);
            startIndex += 4;
        }

        return hexadecimal.toString();
    }
    //---------------------------------OCTAL---------------------------------------//
    public static int octalToDecimal(String octalNumber) {
        int decimal = 0;
        int power = 0;

        for (int i = octalNumber.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(octalNumber.charAt(i));
            decimal += digit * Math.pow(8, power);
            power++;
        }

        return decimal;
    }
    
    public static String octalToBinary(String octalNumber) {
        StringBuilder binary = new StringBuilder();

        for (int i = 0; i < octalNumber.length(); i++) {
            char octalDigit = octalNumber.charAt(i);
            int decimalDigit = Character.getNumericValue(octalDigit);
            String binaryDigit = Integer.toBinaryString(decimalDigit);
            // Agregar ceros a la izquierda si el dígito binario tiene menos de 3 bits
            while (binaryDigit.length() < 3) {
                binaryDigit = "0" + binaryDigit;
            }
            binary.append(binaryDigit);
        }

        return binary.toString();
    }
    
}

