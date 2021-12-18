

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class CarQueue {
    private Random randInt;
    private Queue<Integer> directions;
    public CarQueue() {
        directions = new ArrayDeque<>();
        randInt = new Random();
        directions.add(randInt.nextInt(4));
        directions.add(randInt.nextInt(4));
        directions.add(randInt.nextInt(4));
        directions.add(randInt.nextInt(4));
        directions.add(randInt.nextInt(4));
        directions.add(randInt.nextInt(4));
        directions.add(randInt.nextInt(4));
        directions.add(randInt.nextInt(4));
        directions.add(randInt.nextInt(4));

    }

    public void addToQueue() {

        class Queue implements Runnable{

            @Override
            public void run() {

              {
                    try {
                        for(int i = 0; i<30; i++) {
                            directions.add(randInt.nextInt(4));
                            Thread.sleep(200);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

        }
        Queue car = new Queue();
        Thread thread = new Thread(car);
        thread.start();
    }

    public int deleteQueue() {

        return directions.remove();
    }

}