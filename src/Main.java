import java.util.Scanner;

    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);

        System.out.println("Digite a distancia até o cliente: ");
        int km = scan.nextInt();

     scan.nextLine();

        System.out.println("Está chovendo? (true/false): ");
     boolean isRain = scan.nextBoolean();


        int valorEntrega = 0;

        if (km <= 5 ) {
            valorEntrega = 5;
        }else if(km > 5) {
            valorEntrega = 8;
        }
        if (km > 10) {
            valorEntrega = 10;
        }

        if (isRain) {
            valorEntrega += 2;
        }


        System.out.println("Distancia(KM): " + km);
        System.out.println("Está chovendo? " + isRain);
        System.out.println("Valor final da entrega: R$ " + valorEntrega);
    }
