 int x = 379;
  int y = 156;

void setup () {
  size (1000, 750);
  PImage catPic;
  catPic = loadImage("Cat.jpg");
  catPic.resize(1000, 750);
  background(catPic);
  
}
void draw () {
 
   if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
fill (#FA0000);
noStroke ();
ellipse( x, y, 35, 41);
ellipse(x-100, y+18, 41, 44);
if ( keyPressed) {
  x--;
  y--;
  
  
}
  
}