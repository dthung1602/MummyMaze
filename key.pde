void keyPressed() {
  if (key == CODED && (mummy.col != human.col || mummy.row != human.row)) {
    switch (keyCode) {
      case UP: 
        human.moveUp();
        break;
      case DOWN:
        human.moveDown();
        break;
      case LEFT:
        human.moveLeft();
        break;
      case RIGHT:
        human.moveRight();
        break;
    }
  }
}