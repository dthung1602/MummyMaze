package MummyMaze;

import processing.core.PApplet;

class Map {
    int num;                                                   // map0, map1, or map2, ...
    int col, row;                                              // total row and col of map
    int humanCol, humanRow;
    int mummyCol, mummyRow;
    Square squareList[][];                                    // a table contains all square objects of map
    PApplet applet;

    Map(PApplet applet, int number) {
        this.applet = applet;
        num = number;
        String tmp[] = PApplet.split(Utility.dataOfMaps[num][0], ' ');
        row = Integer.parseInt(tmp[0]);
        col = Integer.parseInt(tmp[1]);
        humanRow = Integer.parseInt(tmp[2]);
        humanCol = Integer.parseInt(tmp[3]);
        mummyRow = Integer.parseInt(tmp[4]);
        mummyCol = Integer.parseInt(tmp[5]);

        int k = 1;
        squareList = new Square[row][col];

        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                tmp = PApplet.split(Utility.dataOfMaps[num][k], ' ');
                squareList[i][j] = new Square(applet, i, j, Boolean.parseBoolean(tmp[0]), Boolean.parseBoolean(tmp[1]),
                        Boolean.parseBoolean(tmp[2]), Boolean.parseBoolean(tmp[3]));
                k++;
            }
    }

    void show() {
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                squareList[i][j].show();
    }
}