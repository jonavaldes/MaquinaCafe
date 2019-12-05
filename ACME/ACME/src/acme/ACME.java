
package acme;

import java.util.Scanner;


public class ACME {

    public static void main(String[] args) {
        Bebidas[] menu = new Bebidas[30];
        
        boolean otroMenu = true;
        int next = 0;
                
        while (otroMenu){
         
            System.out.println("¿Qué vas a tomar, ñeri?\n"
                    + "1)Café\n"
                    + "2)Té\n");
            Scanner sc = new Scanner(System.in);
            int clase = sc.nextInt();

            if (clase == 1) {
                
                System.out.println(""
                        + "1-Expresso\n"
                        + "2-Ristretto\n"
                        + "3-Capuccino\n");
                Scanner scanCafe = new Scanner(System.in);
                int tipoCafe = scanCafe.nextInt();           
                switch (tipoCafe) {
                    case 1:
                        menu[next] = new Expresso();
                        break;
                    case 2:
                        menu[next] = new Ristretto();
                        break;
                    case 3:
                        menu[next] = new Capuccino();
                        break;
                }

                System.out.println("¿Cuantas cucharadas de azúcar?0-3");
                Scanner scanAzucar = new Scanner(System.in);
                int azucar = scanAzucar.nextInt();
                menu[next].setCantAzucar(azucar);

                System.out.println("¿Cuanta leche?0-3");
                Scanner scanLeche = new Scanner(System.in);
                int leche = scanLeche.nextInt();
                menu[next].setCantLeche(leche);
            }

            if (clase == 2) {
               
                System.out.println(""
                        + "1-Negro\n"
                        + "2-Rojo\n"
                        + "3-Verde\n");
                Scanner scanTe = new Scanner(System.in);
                int tipoTe = scanTe.nextInt();           
                switch (tipoTe) {
                    case 1:
                        menu[next] = new TeNegro();
                        break;
                    case 2:
                        menu[next] = new TeRojo();
                        break;
                    case 3:
                        menu[next] = new TeVerde();
                        break;
                }

                System.out.println("¿Cuantas cucharadas de azúcar?0-3");
                Scanner scanAzucar = new Scanner(System.in);
                int azucar = scanAzucar.nextInt();
                menu[next].setCantAzucar(azucar);

                System.out.println("¿Cuanta leche?0-3");
                Scanner scanLeche = new Scanner(System.in);
                int leche = scanLeche.nextInt();
                menu[next].setCantLeche(leche);
            }

            System.out.println("¿Desea ordenar algo más?\n"
                    + "1-Sí\n"
                    + "2-No\n");
            Scanner scanOtroMenu = new Scanner(System.in);
            int otro = scanOtroMenu.nextInt();
            if (otro == 1) {
                next++;
            } else {
                otroMenu = false;
            }

        }

       
        double subtotal = 0, total = 0;

        for (int i = 0; i < menu.length; i++) {
            //Verifico que no sean nulos
            if (menu[i] != null) {
                System.out.println("Aca tenés la cuentita, deja propina o sos boleta");
                System.out.println(menu[i]);
                subtotal = subtotal + menu[i].getPrecio()
                        + menu[i].getCantAzucar() * 5
                        + menu[i].getCantLeche() * 5;
                
            }

        }
        total = subtotal * 1.21;
        System.out.println("Subtotal:" + subtotal);
        System.out.println("Total:" + total);
        

    }

    
}
