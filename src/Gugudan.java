public class Gugudan {
    public static void main(String[] args){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(String.format("%02d",j ) + " * " + String.format("%02d", i ) + " = " + String.format("%02d", i * j));
                System.out.print("   ");
            }
            System.out.println();
        }
    }
}