Map map;
Human human;
Mummy mummy;

void setup() {
  size(800, 800);
  rectMode(CORNERS);
  map = new Map(1);
  human = new Human(map.hrow, map.hcol);
  mummy = new Mummy(map.mrow, map.mcol);
  textFont(loadFont("font.vlw"));
}

void draw() {
  background(255);
  map.show();
  human.show();
  mummy.show();
  showInfo();
}

void showInfo () {
  String message = "MAP " + map.num;
  
  if (mummy.col == human.col && mummy.row == human.row)
    message = "You lose!";
  
  fill(255, 0, 0);
  text(message, 300, 50);
}