public class dia {
    public static void main(String[] args) {
        int  dia= 3;
        String nomeDia = "";

        switch (dia) {
            case 1:
                nomeDia= "Domingo";
                break;
            case 2:
                nomeDia= "Segunda-feira";
                break;
            case 3: 
                nomeDia= "Terça-feira";
                break;
            default:
                break;

            }
            System.out.println("O dia " + dia + " é " + nomeDia);
    }
}
