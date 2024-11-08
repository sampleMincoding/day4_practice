

import java.util.Random;

class Player {

}

public class MoveField {

    public static void main(String[] args) {
        int level = 10;
        int hp = 180;
        int mp = 200;
        String name = "hwan";

        hp += 10;
        mp -= 20;
        System.out.println(name + "의 hp가 10 증가 , mp가 20 감소");
        System.out.println(name + "의 status는 " + "HP:" + hp + " " + "MP:" + mp);

        Random rand = new Random();
        int ret = rand.nextInt() % 6;
        if (ret % 2 == 0) {
            System.out.println("축하합니다");
            hp += 100;
        }
        else {
            System.out.println("꽝입니다");
            mp -= 20;
        }
    }
}



