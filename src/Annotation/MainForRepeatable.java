package Annotation;

import ExampleStepAcademy.Main;

@Game(name = "GoT",day = "Monday")
@Game(day = "Wednesday")
@Game(name = "Needforspeed",day = "Thursday")
@Game(name = "RomeTotalWar",day = "Saturday")
public class MainForRepeatable {
    public static void main(String[] args) {
       Games games = MainForRepeatable.class.getAnnotation(Games.class);
        for (Game game:games.value()){
            System.out.println(game.name() + " " + game.day());
        }
    }
}
