package agh.po.lab4.zadania;
import agh.po.lab4.animals.*;

import java.util.Random;

    public class Zoo {
        Animal[] animals = new Animal[100];

        // punkt 5: losowe wypełnienie tablicy
        public void fillRandomly() {
            Random rand = new Random();

            for (int i = 0; i < animals.length; i++) {
                int type = rand.nextInt(3); // 0, 1 lub 2
                switch (type) {
                    case 0:
                        animals[i] = new Parrot("Parrot" + i);
                        break;
                    case 1:
                        animals[i] = new Dog("Dog" + i);
                        break;
                    default:
                        animals[i] = new Snake("Snake" + i);
                        break;
                }
            }
        }
        //int x =  y<5 ? 3 , 2;
        // punkt 6: suma nóg wszystkich zwierząt
        public int countLegs() {
            int sum = 0;

            for (Animal a : animals) {
                sum += a.getLegs();
            }

            return sum;
        }

        // test
        public static void main(String[] args) {
            Zoo zoo = new Zoo();
            zoo.fillRandomly();
            System.out.println("Suma nóg: " + zoo.countLegs());
        }
    }

