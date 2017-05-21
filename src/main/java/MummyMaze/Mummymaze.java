package MummyMaze;

import processing.core.PApplet;

public class Mummymaze extends PApplet {

    public static void main(String args[]) {
        PApplet.main("Mummymaze");
    }

    public void settings() {
        size(800, 800);
    }

    public void setup() {
        rectMode(CORNERS);
        Utility.dataOfMaps = new String[3][];
        for (int i = 0; i < 3; i++) {
            Utility.dataOfMaps[i] = loadStrings("./square" + i + ".txt");
        }
        Utility.map = new Map(this, 0);
        Utility.human = new Human(this, Utility.map.humanRow, Utility.map.humanCol);
        Utility.mummy = new Mummy(this, Utility.map.mummyRow, Utility.map.mummyCol);
        textFont(loadFont("font.vlw"));
    }

    public void draw() {
        background(255);
        Utility.map.show();
        Utility.human.show();
        Utility.mummy.show();
        showInfo();
    }

    public void keyPressed() {
        if (key == CODED && (Utility.mummy.col != Utility.human.col || Utility.mummy.row != Utility.human.row)) {
            switch (keyCode) {
                case UP:
                    Utility.human.moveUp();
                    break;
                case DOWN:
                    Utility.human.moveDown();
                    break;
                case LEFT:
                    Utility.human.moveLeft();
                    break;
                case RIGHT:
                    Utility.human.moveRight();
                    break;
            }
        }
    }

    private void showInfo() {
        String message = "MAP " + Utility.map.num;

        if (Utility.mummy.col == Utility.human.col && Utility.mummy.row == Utility.human.row)
            message = "You lose!";

        fill(255, 0, 0);
        text(message, 300, 50);
    }
}