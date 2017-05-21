class Mummy {  
  int radius;
  int row, col;
  int step = 2;
  
  Mummy (int row, int col) {
    this.row = row;
    this.col = col;
  }    
  
  void show() {
    strokeWeight(5);
    fill(0);
    Square s = map.squareList[row][col];
    ellipse(s.x + s.side/2, s.y + s.side/2, 80, 80);
  }
  
  void move() {
    for (int i=0; i<step; i++) {
      if (human.row < row && map.squareList[row][col].moveUp) 
        row--;
      else if (human.row > row && map.squareList[row][col].moveDown) 
        row++;
      else if (human.col < col && map.squareList[row][col].moveLeft)
        col--;
      else if (human.col > col && map.squareList[row][col].moveRight)
        col++;
    }
  }
}