package MummyMaze;

import processing.core.PApplet;

class Square {
    int side = 100;
    int x, y;
    boolean moveUp, moveDown, moveLeft, moveRight;
    private int cl;
    private PApplet applet;

    Square(PApplet applet, int row, int col, boolean mu, boolean md, boolean ml, boolean mr) {
        this.applet = applet;
        if (row % 2 == col % 2)
            cl = applet.color(255);
        else
            cl = applet.color(200, 200, 200);
        moveUp = mu;
        moveDown = md;
        moveLeft = ml;
        moveRight = mr;
        x = 100 + 100 * col;
        y = 100 + 100 * row;
    }

    void show() {
        applet.fill(cl);
        applet.strokeWeight(0);
        applet.rect(x, y, x + side, y + side);
        applet.strokeWeight(8);
        applet.fill(0);
        if (!moveUp)
            applet.line(x, y, x + side, y);
        if (!moveDown)
            applet.line(x, y + side, x + side, y + side);
        if (!moveLeft)
            applet.line(x, y, x, y + side);
        if (!moveRight)
            applet.line(x + side, y, x + side, y + side);
    }
}