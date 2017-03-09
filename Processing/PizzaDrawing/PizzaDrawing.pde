void setup(){
  
  size(400,400);
    PImage box = loadImage("pizzabox.png");
   image(box,47,65);
  drawThePizza();  
}


void draw(){
  
print(mouseX, mouseY);
  PImage olive = loadImage("olive.gif");
  PImage pepperoni = loadImage("pepperoni.gif");
  
  
 
   if(mousePressed && mouseButton == RIGHT){
  image(olive, mouseX,mouseY);
  } else
  if(mousePressed){
  image(pepperoni, mouseX,mouseY);
  }
  
  
    
  
  
  
}

void drawThePizza(){
    //pizza

  //base
  fill(255,187,119);
  ellipse(196,264,140,140);
  //sauce
  fill(238,0,34);
  ellipse(196,264,120,120);
  //queso
  fill(255,255,187);
  ellipse(196,264,110,110);
}