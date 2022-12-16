import java.util.Scanner;

public class transformer {
    private melee your_melee;
    private weapon your_weapon;
    private kind your_kind;
    private form your_form;
    public static int counter_1 = 0; //одномерный массив
    public static int counter_2 = 0; //двумерный массив
    public transformer(melee your_melee, weapon your_weapon, kind your_kind, form your_form) {
        this.your_melee = your_melee;
        this.your_weapon = your_weapon;
        this.your_kind = your_kind;
        this.your_form = your_form;
    }

    public void input() {
        your_kind.input();
        your_melee.input();
        your_weapon.input();
        your_form.input();
    }

    public void output() {
        your_kind.output();
        your_melee.output();
        your_weapon.output();
        your_form.output();
    }

    public void color() {
        if ((your_melee.color_of_melee.equals(your_weapon.color_of_weapon)) && (your_melee.color_of_melee.equals(your_kind.color_of_transformer)))
            System.out.println("Ваш трансформер одноцветный");
        else
            System.out.println("Ваш трансформер разноцветный");
    }

    public void speed_type() {
        if ((your_form.speed >= 120) && (your_form.speed < 200))
            System.out.println("У вашего трансформера маленькая скорость");
        if ((your_form.speed >= 200) && (your_form.speed < 300))
            System.out.println("У вашего трансформера средняя скорость");
        if ((your_form.speed >= 300) && (your_form.speed <= 400))
            System.out.println("У вашего трансформера большая скорость");
    }
}
