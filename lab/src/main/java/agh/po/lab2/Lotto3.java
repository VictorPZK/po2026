package agh.po.lab2;

import agh.Project.Wiktor.Skan;

import java.util.ArrayList;
import java.util.Random;

//Aż do pełnego 6/6
public class Lotto3 {
    public static void main(String[] args) {
        ArrayList<Integer> guess = new ArrayList<>();
        ArrayList<Integer> lottery = new ArrayList<>();
        //int losy =0;
        Random r = new Random();
        for (int a = 0; a < 6; a++) {
            guess.add(Skan.readNumber());
        }
        do{
            for (int i = 0; i < 6; i++) {
                int randomNum;
                do// Here, code checks if same random number generated before.
                {
                    randomNum = r.nextInt(50);//If random number is same, another number generated.
                } while (lottery.contains(randomNum));
                //System.out.println("jeszcze nie");
                lottery.add(randomNum);
                lottery.retainAll(guess);
            }
            //losy=losy+1;
        }while (lottery.isEmpty());

        lottery.sort(null);
        guess.sort(null);
        //System.out.println(lottery);
        System.out.println(guess);
        //System.out.println(lottery);
        System.out.print("trafiono:wszystkie");
        //System.out.println("po"+losy);

    }
}
