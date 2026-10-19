package agh.po.lab2;



import java.util.ArrayList;
import java.util.Random;

//Aż do pełnego 6/6
public class Lotto3 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long iteracja = 0;
        ArrayList<Integer> guess = new ArrayList<>();
        ArrayList<Integer> lottery = new ArrayList<>();
        Random r = new Random();
        for (int a = 0; a < 6; a++) {
            guess.add(Integer.parseInt(args[a]));
        }
        do{
            lottery.clear();
            do  {
                int randomNum;
                do// Here, code checks if same random number generated before.
                {
                    randomNum = r.nextInt(50);//If random number is same, another number generated.
                } while (lottery.contains(randomNum));
                lottery.add(randomNum);

            } while (lottery.size() < 6);
            lottery.retainAll(guess);
            /*System.out.println("jeszcze nie");
            System.out.println(lottery.size());*/
            iteracja += 1;
        }while (lottery.size()!=6);

        lottery.sort(null);
        guess.sort(null);
        //System.out.println(lottery);
        System.out.println(guess);
        //System.out.println(lottery);
        System.out.println("trafiono:wszystkie");
        System.out.println(iteracja);
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.print("time: " + time + " ms");
    }
}
