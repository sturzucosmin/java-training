package clean.code.design_patterns.requirements;
import java.util.Scanner;
//Singleton Design Pattern pentru GameScore
//Composite Pattern pentru Weapon, Bow, Pistol, Gun si Shooting

//Clasele se pot aplica in anumite jocuri indie cu un singur player care are un singur scor/joc (singleton) si in
//functie de arma aleasa pentru a efectua o actiune scorul este modificat corespunzator

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Weapon bow = new Bow();
        Weapon pistol = new Pistol();
        Weapon gun = new Gun();

        Shooting shooting = new Shooting();

        GameScore gameScore =  GameScore.getInstance();
        System.out.println("Your initial score is: " + gameScore.getScore());

        String chooseWeapon;


        label:
        while(true) {
            System.out.println("Choose your weapon by writing 'bow', 'pistol', 'gun' or something else if you want to finish");
            chooseWeapon = console.nextLine();

            switch (chooseWeapon) {
                case "bow":
                    shooting.add(bow);
                    break;
                case "pistol":
                    shooting.add(pistol);
                    break;
                case "gun":
                    shooting.add(gun);
                    break;
                default:
                    break label;
            }

        }

        shooting.shoot();
        System.out.println("Your score is: " + gameScore.getScore());

    }
}

