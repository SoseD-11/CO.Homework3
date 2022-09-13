public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int ageHuman = 22;
        if (ageHuman <= 6 && ageHuman >= 2) {
            System.out.println("Если возраст человека равен " + ageHuman + " , то ему нужно ходить в детский сад.");
        } else if (ageHuman >= 7 && ageHuman <= 18) {
            System.out.println("Если возраст человека равен " + ageHuman + " , то ему нужно ходить в школу.");
        } else if (ageHuman >= 18 && ageHuman < 24) {
            System.out.println("Если возраст человека равен " + ageHuman + " , то его место в университете.");
        } else if (ageHuman > 24) {
            System.out.println("Если возраст человека равен " + ageHuman + " , то ему пора ходить на работу.");
        }
        System.out.println("Задание 2");
        int ageChild = 13;
        if (ageChild < 5) {
            System.out.println("Вам нельзя кататься на аттракционе.");
        } else if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Вам можно кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (ageChild >= 14) {
            System.out.println("Вам можно кататься без сопровождения");
        }

        System.out.println("Задание 3");
        int one = 500;
        int two = 500;
        int three = 500;

        if (one > two) {
            if (one > three) {
                System.out.println(one + " - это бОльшее число");
            } else if (three > one) {
                System.out.println(three + " - это бОльшее число");
            } else {
                System.out.println("Числа " + one + " и " + three + " равны");
            }

        }else if (two > one) {
            if (two > three) {
                System.out.println(two + " - это бОльшее число");
            } else if (three > two) {
                System.out.println(three + " - это бОльшее число");
            } else {
                System.out.println("Числа " + two + " и " + three + " равны");
            }
        }else if (one > three) {
            System.out.println(one + " - это бОльшее число");
        } else if (three > one) {
            System.out.println(three + " - это бОльшее число");
        } else {
            System.out.println("Все числа равны");
        }













    }

}