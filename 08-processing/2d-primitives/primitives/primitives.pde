void setup() {
  size(340, 340);
  background(184,216,211);
}

void draw() {
  stroke(1);
  //body
  fill(255,255,255);
  rect(135, 75, 60, 40);
  arc(165, 75, 60, 50, PI, 2*PI);
  fill(58,78,105);
  circle(165, 85, 54);
  fill(224,178,100);
  square(135, 115, 60); 
  fill(225,239,224);
  rect(135, 175, 60, 40);
  //legs
  fill(224,178,100);
  triangle(136, 215, 194, 215, 165, 245);
  fill(255,255,255);
  triangle(194, 215, 165, 245, 254, 245);
  triangle(136, 215, 165, 245, 76, 245);
  fill(228,109,69);
  arc(254, 260, 30, 30, -HALF_PI, HALF_PI);
  fill(255,255,255);
  triangle(254, 245, 254, 275, 170, 275);
  fill(225,239,224);
  arc(254, 260, 30, 30, HALF_PI, PI+HALF_PI);
  fill(228,109,69);
  arc(76, 260, 30, 30, HALF_PI, PI+HALF_PI);
  fill(255,255,255);
  triangle(76, 245, 76, 275, 160, 275);
  fill(225,239,224);
  arc(76, 260, 30, 30, -HALF_PI, HALF_PI);
  fill(224,178,100);
  arc(170, 295, 30, 40, -HALF_PI, HALF_PI);
  arc(160, 295, 30, 40, HALF_PI, PI+HALF_PI);
  //left arm
  fill(228,109,69);
  triangle(196,115,236,115,235,175);
  fill(225,239,224);
  arc(235,190,25,25,-HALF_PI,HALF_PI);
   fill(255,255,255);
  triangle(229,180,230,200,120,205);
  //right arm
  fill(225,239,224);
  triangle(133,174,133,115,93,115);
  fill(228,109,69);
  triangle(133,115,93,115,93,60);
    fill(225,239,224);
  arc(93,47,25,25,HALF_PI, PI+HALF_PI);
  fill(255,255,255);
  triangle(99,35,103,55,206,35);
  //hands
  fill(255,255,255);
  triangle(206,35,226,35,226,55);
  fill(224,178,100);
  triangle(206,35,206,55,226,55);
  fill(224,178,100);
  triangle(120,205,120,185,100,185);
  fill(255,255,255);
  triangle(120,205,100,205,100,185);
  
 
  star(155,85);
  star(55,105);
  star(285,145);
}

void star(float centerX, float centerY){
  stroke(255);
  line(centerX,centerY+8,centerX,centerY-8);  
  line(centerX-4,centerY-4,centerX+4,centerY+4);
  line(centerX-4,centerY+4,centerX+4,centerY-4);
  line(centerX-5,centerY,centerX+5,centerY);
}
