void setup(){
   size(500,500); 
   drawFlower(370,100);
}


void draw() {
  int  moveex=450;
  int movewhy=450;
  for(int i=1;i<=15;i++){
    if(i%2==0){
      fill(0,0,0);
      ellipse(moveex,movewhy,50,50);
  } else
    fill(255,221,85);
    ellipse(moveex,movewhy,50,50);
    moveex= moveex-20;
    movewhy=movewhy-20;
  }

   drawBeeFace(400,250);
 }

  /*Use A loop to make a body for the Bee!
   Then put his head on using drawBeeFace(x,y)
   Use Modulo to make the colors alternate 
   */




void drawFlower(int x, int y) {
  noStroke();
  translate(x, y);
  // draw 5 petals, rotating after each one
  fill(#c6ff89); // green
  for (int i = 0; i < 5; i++) {
    ellipse(0, -40, 50, 50);
    rotate(radians(72));
  }
  fill(#fff9bb); // light yellow
  ellipse(0, 0, 50, 50);
}

void drawBeeFace(int BeeFaceX, int BeeFaceY) {
  noStroke();
  fill(0, 0, 0);
  stroke(10);
}