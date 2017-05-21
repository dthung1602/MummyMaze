package MummyMaze;

import processing.core.PApplet;

class Mummy {
    int row, col;
    private PApplet applet;

    Mummy(PApplet applet, int row, int col) {
        this.applet = applet;
        this.row = row;
        this.col = col;
    }

    void show() {
        applet.strokeWeight(5);
        applet.fill(0);
        Square s = Utility.map.squareList[row][col];
        applet.ellipse(s.x + s.side / 2, s.y + s.side / 2, 80, 80);
    }

    void move() {
        int step = 2;
        for (int i = 0; i < step; i++) {
            if (Utility.human.row < row && Utility.map.squareList[row][col].moveUp)
                row--;
            else if (Utility.human.row > row && Utility.map.squareList[row][col].moveDown)
                row++;
            else if (Utility.human.col < col && Utility.map.squareList[row][col].moveLeft)
                col--;
            else if (Utility.human.col > col && Utility.map.squareList[row][col].moveRight)
                col++;
        }
    }
}