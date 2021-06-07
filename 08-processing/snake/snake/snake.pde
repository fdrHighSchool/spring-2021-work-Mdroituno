ArrayList<Integer> x = new ArrayList<Integer>();
ArrayList<Integer> y = new ArrayList<Integer>();
int width = 30;
int height = 30;
int blocks = 20;
int direction = 0;
int foodx = 10;
int foody = 10;
int[] x_direction = {0,0,1,-1};
int[] y_direction = {1,-1,0,0};
boolean gameover = false;
int speed = 8;
void setup(){
   size(600,600);
   x.add(0);
   y.add(15);
}

void draw(){
   background(0);
   fill(56,168,50);
   for(int i = 0; i<x.size(); i++)
     rect(x.get(i)*blocks, y.get(i)*blocks,blocks,blocks);
   if(!gameover){
     fill(252, 3, 3);
     rect(foodx*blocks, foody*blocks, blocks, blocks);
     if(frameCount%speed==0){
       x.add(0, x.get(0) + x_direction[direction]);
       y.add(0, y.get(0) + y_direction[direction]);
     if (x.get(0) < 0 || y.get(0) < 0 || x.get(0) >= width || y.get(0) >= height)
       gameover = true; 
     
     for (int i=1; i<x.size(); i++) 
       if (x.get(0)==x.get(i)&&y.get(0)==y.get(i)) 
         gameover=true; 
        
     if(x.get(0) == foodx && y.get(0) == foody){
     if(x.size()%5==0 && speed >=2)
       speed-=1;
 
       foodx = (int)random(0,width);
       foody = (int)random(0,height);
   }else{
       x.remove(x.size()-1);
       y.remove(y.size()-1);
    }
       }
   }else{
      x.clear(); 
      y.clear(); 
      x.add(0);  
      y.add(15);
      direction = 2;
      speed = 8;
      gameover = false;
   }
}

void keyPressed(){
 int newdirec = keyCode == DOWN? 0:(keyCode==UP?1:(keyCode==RIGHT?2:(keyCode==LEFT?3:-1)));
 if(newdirec != -1)
   direction = newdirec; 
}
