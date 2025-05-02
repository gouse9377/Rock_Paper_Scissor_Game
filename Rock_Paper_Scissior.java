import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter 0 for Rack \n Enter 1 for Paper \n Enter 2 for Scissior \n");
        int UserInput = sc.nextInt();

        Random random = new Random();
        int BotInput = random.nextInt(3);

        try{

            if(UserInput==BotInput){
                System.out.println(" Draw ");
            } else if (UserInput==0 && BotInput==2 || UserInput==1 && BotInput==0 || UserInput==2 && BotInput==1) {
                System.out.println(" User Win ");
            }else {
                System.out.println(" Bot Win ");
            }

            if(BotInput==0){
                System.out.println(" Bot Choices : Rock ");
            } else if (BotInput==1) {
                System.out.println(" Bot Choices : Paper ");
            }else {
                System.out.println(" Bot Choices : Scissior ");
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }
}
