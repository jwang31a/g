/*
Big Bird: Jun Hong Wang, Raven (Ruiwen) Tang, Michael Kamela
APCS pd6
HW105: 'Tis Hard to Search for 'Processing' -- familiarizing selves with Proces$
2022-05-23
time spent: 1.0 hr
*/

PFont font;
int counter = 0;

void setup(){
  size(600,600);
  font = loadFont("Baskerville-BoldItalic-48.vlw");
  textFont(font, 20);
  text("Click to change the background color!",100,100);
}

void draw(){
  textAlign(CENTER);
  text("You have clicked", 299, 280);
  text(counter, 299, 310);
  text("times", 299, 330);
  text("View your color palette above. \n The center color is the average shade of its two randomly \n colored neighbors", 299, 520);
}

void mouseClicked(){
  background(random(256), random(256), random(256));
  text("Click to change the background color, \n and I will follow you around!",mouseX,mouseY);
  counter += 1;
  color c1 = color(random(256), random(256), random(256));
  color c2 = color(random(256), random(256), random(256));
  fill(c1);
  ellipse(150, 450, 50, 50);
  fill(c2);
  ellipse(300, 450, 50, 50);
  fill((c1+c2)/2);
  ellipse(450, 450, 50, 50);
}

/*
- color
- size(width, height)
- background(color)
- random(low, high) OR random(0, high)
- mouseX
- mouseY
- fill(color)
- stroke(color)
- lerpColor(color1, color2, moment)
- rotate(radians)
- ellipse(posx, posy, width, height)
- rect(posx, posy, width, height)
- line(posx1, posy1, posx2, posy2)
- bezier(x1, y1, x2, y2, x3, y3, x4, y4)
- display an image 
    img = loadImage("filename.jpg");
    image(img, 0, 0);
- display text
    font = loadFont("Helvetica-32.vlw");
    textFont(font, 32);
    text("Hello",0,0);
*/
