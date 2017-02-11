// 1. Find a really hard Where’s Waldo puzzle, save it, and drop it onto this sketch.
  
void setup() {
  PImage waldo = loadImage("waldo.jpg"); // 2. Change this to match your file name.
  size(waldo.width, waldo.height);
  image(waldo, 0, 0);
}

void draw() {

   println("X: " + mouseX + " Y: " + mouseY); 


  if(mouseX>=604 && mouseX<=676 && mouseY>=394 && mouseY<=457 && mousePressed){
    println("You found the unicorn!!");
    playWoohoo();
  }else if(mouseX>=461 && mouseX<=825 && mouseY>=295 && mouseY<=543){
 println("Getting hotter...");
  }else if(mousePressed){
    playDoh(); 
  }
  
  
}

void playWoohoo() {
  woohoo.stop();
  woohoo.trigger();
}

void playDoh() {
  doh.stop();
  doh.trigger();
}


import ddf.minim.*;
Minim minim = new Minim(this);   
AudioSample doh = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-doh.wav");
AudioSample woohoo = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-woohoo.wav");




