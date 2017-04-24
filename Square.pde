class Square {
  int side = 100;
  int row, col; 
  int x, y;
  color cl;
  boolean moveUp, moveDown, moveLeft, moveRight;
  
  Square (int row, int col, boolean mu, boolean md, boolean ml, boolean mr) {
    this.row = row;
    this.col = col;
    if (row % 2 == col % 2)
      cl = color(255);
    else 
      cl = color(200,200,200);
    moveUp = mu;
    moveDown = md;
    moveLeft = ml;
    moveRight = mr;    
    x = 100 + 100 * col;
    y = 100 + 100 * row;
  }
  
  void show() {   
    fill(cl);
    strokeWeight(0);
    rect(x, y, x + side, y + side);
    strokeWeight(8);
    fill(0);
    if (!moveUp)
      line(x, y, x + side, y);
    if (!moveDown)
      line(x, y + side, x + side, y + side);
    if (!moveLeft)
      line(x, y, x , y + side);
    if (!moveRight)
      line(x + side, y, x + side, y + side);
  } 
}