import java.util.Scanner;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        int x = 0;
        int i = 0;
        int min, max;
        transformer[] your_transformer = new transformer[10];
        transformer[][] your_transformer_2 = new transformer[10][10];
        while (x != 6) {
            System.out.println("Введите:");
            System.out.println("1 - для создания вашего трансформера");
            System.out.println("2 - для вывода всех трансформеров");
            System.out.println("3 - вывода случайного числа через вспомогательный класс");
            System.out.println("4 - создания трансформера в двумерном массиве");
            System.out.println("5 - вывода трансформера в двумерном массиве");
            System.out.println("6 - выхода");
            Scanner vvod = new Scanner(System.in);
            /////TRY БЛОК/////
            try {
                x = vvod.nextInt();
                if (x > 6 || x < 1)
                    throw new OptionException("invalid range");
            } catch (InputMismatchException e) {
                System.err.println("Нужно вводить цифру");
            } catch (OptionException e) {
                System.err.println("Диапазон 1-6");
            }
            switch (x) {
                case 1:
                    melee your_melee = new melee();
                    weapon your_weapon = new weapon();
                    kind your_kind = new kind();
                    form your_form = new form();

                    your_transformer[i] = new transformer(your_melee, your_weapon, your_kind, your_form);
                    your_transformer[i].input();
                    your_transformer[i].output();
                    your_transformer[i].color();
                    your_transformer[i].speed_type();
                    i++;
                    transformer.counter_1++;
                    break;
                case 2:
                    for (int j = 0; j < transformer.counter_1; j++) {
                        your_transformer[j].output();
                        your_transformer[j].color();
                        your_transformer[j].speed_type();
                        System.out.println("\n");
                    }
                    break;

                case 3:
                    System.out.println("Введите нижнюю границу:");
                    min = vvod.nextInt();
                    System.out.println("Введите верхнюю границу:");
                    max = vvod.nextInt();
                    System.out.println("Случайное число: "+ generateRandomInt.generateRandomIntRange(min, max));
                    break;
                case 4:
                    //ДВУМЕРНЫЙ МАССИВ ОБЪЕКТОВ//
                    for (int k = 0; k < 1; k++){
                        for (int j = 0; j < 1; j++){
                            your_melee = new melee();
                            your_weapon = new weapon();
                            your_kind = new kind();
                            your_form = new form();

                            your_transformer_2[i][j] = new transformer(your_melee, your_weapon, your_kind, your_form);
                            your_transformer_2[i][j].input();
                            your_transformer_2[i][j].output();
                            your_transformer_2[i][j].color();
                            your_transformer_2[i][j].speed_type();
                            transformer.counter_2++;
                        }
                    }
                    break;
                case 5:
                    //ДВУМЕРНЫЙ МАССИВ ОБЪЕКТОВ - ВЫВОД//
                    for (int k = 0; k < transformer.counter_2; k++)
                        for (int j = 0; j < transformer.counter_2; j++) {
                            your_transformer_2[i][j].output();
                            your_transformer_2[i][j].color();
                            your_transformer_2[i][j].speed_type();
                            System.out.println("\n");
                        }
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}