class Human {
  int row, col;
  
  Human (int row, int col) {
   this.row = row;
   this.col = col;
  }
  
  void show () {
    strokeWeight(5);
    fill(255);
    Square s = map.squareList[row][col];
    ellipse(s.x + s.side/2, s.y + s.side/2, 80, 80); 
  }
  
  void moveUp () {
    if (map.squareList[row][col].moveUp)
      row--;
    if (row < 0) {
      map = new Map(map.num + 1);
      human = new Human(map.hrow, map.hcol);
      mummy = new Mummy(map.mrow, map.mcol);  
    } else {      
      mummy.move();
    }
  }
  
  void moveDown () {
    if (map.squareList[row][col].moveDown)
      row++;
    if (row == map.row) {
      map = new Map(map.num + 1);
      human = new Human(map.hrow, map.hcol);
      mummy = new Mummy(map.mrow, map.mcol);
    } else {
      mummy.move();
    }
  }
  
  void moveLeft () {
    if (map.squareList[row][col].moveLeft)
      col--;
    if (col < 0) {
      map = new Map(map.num + 1);
      human = new Human(map.hrow, map.hcol);
      mummy = new Mummy(map.mrow, map.mcol);
    } else {
      mummy.move();
    }
  }
  
  void moveRight () {
    if (map.squareList[row][col].moveRight)
      col++;
    if (col == map.col) {
      map = new Map(map.num + 1);
      human = new Human(map.hrow, map.hcol);
      mummy = new Mummy(map.mrow, map.mcol);
    } else {      
      mummy.move();
    }
  }
}