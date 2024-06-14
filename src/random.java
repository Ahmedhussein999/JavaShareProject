//module of the random genrator 
import java.util.Random;

//the class of the random genrtor 
public class random {
    private Random random;
//this instialses the random function
    public random() {
        this.random = new Random();
    }
    //make the var min and max and adds and misunus number till it is random
 public int generateRandomInt(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
    public static void main(String[] args) {
        random generator = new random();

        // this will gentorate 3 numbers that will be displayed with Jframe later on.
        for (int i = 0; i < 3; i++) {
            int randomInt = generator.generateRandomInt(1, 100);
            System.out.println("Random Integer " + (i + 1) + ": " + randomInt);
        }
    }
}
