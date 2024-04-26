
    import java.util.Random;
import java.util.Scanner;

    public class BazikonVaComp {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            System.out.println("Bitte wälen: (Schere / Stein / Papier)");
            String entekhab = scanner.nextLine().toLowerCase();

            int randomNum = random.nextInt(3);
            String compEntekhab;
            switch (randomNum) {
                case 0:
                    compEntekhab = "bazi";
                    break;
                case 1:
                    compEntekhab = "sang";
                    break;
                case 2:
                    compEntekhab = "kaghaz";
                    break;
                default:
                    compEntekhab = "sang"; // Default, agar kodam ra entekhab nakard.
                    break;
            }

            System.out.println("Entekhab shoma: " + entekhab);
            System.out.println("Entekhab computer: " + compEntekhab);

            if (entekhab.equals(compEntekhab)) {
                System.out.println("Mosavi shodid!");
            } else if ((entekhab.equals("bazi") && compEntekhab.equals("sang")) ||
                    (entekhab.equals("sang") && compEntekhab.equals("kaghaz")) ||
                    (entekhab.equals("kaghaz") && compEntekhab.equals("bazi"))) {
                System.out.println("Shoma bordid!");
            } else {
                System.out.println("Computer bord!");
            }
        }
    }


