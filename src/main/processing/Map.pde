class Map {
  int num;                                                   // map0, map1, or map2, ...
  int col, row;                                              // total row and col of map
  int hcol, hrow;
  int mcol, mrow;
  Square squareList [][];                                    // a table contains all square objects of map
  
  Map (int number) {       
    num = number;
    
    String data [] = loadStrings("square" + num + ".txt");               
    String tmp [] = split(data[0], ' '); 
    row = int(tmp[0]);
    col = int(tmp[1]);
    hrow = int(tmp[2]);
    hcol = int(tmp[3]);
    mrow = int(tmp[4]);
    mcol = int(tmp[5]);    
    
    int k = 1;
    squareList = new Square [row][col];
    
    for (int i=0; i<row; i++)
      for (int j=0; j<col; j++) {
        tmp = split(data[k], ' ');
        squareList[i][j] = new Square(i, j, boolean(tmp[0]), boolean(tmp[1]), boolean(tmp[2]), boolean(tmp[3]));
        k++;
      } 
  }
  
  void show() {
    for (int i=0; i<row; i++) 
      for (int j=0; j<col; j++)
        squareList[i][j].show();
  }
}