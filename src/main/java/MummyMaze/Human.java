package MummyMaze;

import processing.core.PApplet;

class Human {
    public int row, col;
    private PApplet applet;

    Human(PApplet applet, int row, int col) {
        this.applet = applet;
        this.row = row;
        this.col = col;
    }

    public void show() {
        applet.strokeWeight(5);
        applet.fill(255);
        Square s = Utility.map.squareList[row][col];
        applet.ellipse(s.x + s.side / 2, s.y + s.side / 2, 80, 80);
    }

    void moveUp() {
        if (Utility.map.squareList[row][col].moveUp)
            row--;
        if (row < 0) {
            newMap();
        } else {
            Utility.mummy.move();
        }
    }

    void moveDown() {
        if (Utility.map.squareList[row][col].moveDown)
            row++;
        if (row == Utility.map.row) {
            newMap();
        } else {
            Utility.mummy.move();
        }
    }

    void moveLeft() {
        if (Utility.map.squareList[row][col].moveLeft)
            col--;
        if (col < 0) {
            newMap();
        } else {
            Utility.mummy.move();
        }
    }

    void moveRight() {
        if (Utility.map.squareList[row][col].moveRight)
            col++;
        if (col == Utility.map.col) {
            newMap();
        } else {
            Utility.mummy.move();
        }
    }

    private void newMap() {
        Utility.map = new Map(applet, Utility.map.num + 1);
        Utility.human = new Human(applet, Utility.map.humanRow, Utility.map.humanCol);
        Utility.mummy = new Mummy(applet, Utility.map.mummyRow, Utility.map.mummyCol);
    }
}