class Ball {
  final static int MOVING = 0; 
  final static int DEAD = -1;
  float x; float y; float rad; color c; int state; float dx; float dy;
  
  Ball() {
    float r = random(256);
    float g = random(256);
    float b = random(256);
    c = color(r, g, b);
    rad = random(10); 
    x = random((width - rad) + rad/2);
    y = random((height - rad) + rad/2);
    dx = random(10) - 5;
    dy = random(10) - 5;
    state = MOVING;
  }
  
  void move() {x = x + dx; y = y + dy; bounce(); }
  
  void process() { if (state == MOVING) move(); }
  
  void draw() {
    if (state != DEAD) {
      ellipseMode(RADIUS);
      fill(c);
      stroke(c);
      ellipse(x, y, rad, rad);
    }
  }
  
  void bounce() {
    if (x < 0)
      dx = abs(dx);
    if (x > width) 
      dx = -1 * abs(dx);
    if (y < 0)
      dy = abs(dy);
    if (y > height) 
      dy = -1 * abs(dy);
  }
}


Ball[] balls;

void setup() {
  size(600, 600);
  //balls = new Ball[1];
  balls = new Ball[25];
  for (int i = 0; i < balls.length; i++) {
    balls[i] = new Ball();
  }
  balls[0].state = Ball.DEAD;
}

void draw() {
  background(random(100));
  for (int i = 0; i < balls.length; i++) {
    balls[i].draw();
    balls[i].process();
  }
}

void mouseClicked() {
  background(100);
}
