PImage mapimg = loadImage("https://api.mapbox.com/styles/v1/mapbox/streets-v11/static/-73.9709,40.6703,8.36,0/300x200?access_token=pk.eyJ1IjoibWRyb2l0dW5vIiwiYSI6ImNrcHZwdmlhbzEzZzgyb3F2cDU4ZWtyczYifQ.ELz5f_RcBmWx3q33lAAvAw", "png");
float clon = -73.9709; 
float clat = 40.6703;
float zoom = 8.36;

float mercX(float lon){
  lon = radians(lon);
  float a = (256 / PI) * pow(2.0,zoom);
  float b = lon + PI;
  return a * b;
}

float mercY(float lat){
  lat = radians(lat);
  float a = (256 / PI) * pow(2.0,zoom);
  float b = tan(PI/4 + lat/2);
  float c = PI - log(b);
  return a * c;
}
void setup(){
  size(300,200);
  translate(width/2, height/2);
  imageMode(CENTER);
  image(mapimg,0,0);
  
  float cx = mercX(clon);
  float cy = mercY(clat);
  
  JSONArray complaints = loadJSONArray("https://data.cityofnewyork.us/resource/ck4n-5h6x.json");
  for(int i = 0; i< complaints.size(); i++){
    JSONObject complaint = complaints.getJSONObject(i);
    //since not all complaints have coordinates
    if(complaint.getString("longitude") != null){
      float lon = Float.parseFloat(complaint.getString("longitude"));
      float lat = Float.parseFloat(complaint.getString("latitude"));
      float x = mercX(lon) - cx;
      float y = mercY(lat) - cy;
    
      fill(255,0,255, 200);
      ellipse(x,y,5,5);
    }
  }
  
  
  /*
  int brooklynComplaints = 0;
  int manhattanComplaints = 0;
  int queensComplaints = 0; 
  int statenIslandComplaints = 0;
  int bronxComplaints = 0;
  for(int i = 0; i< complaints.size(); i++){
    JSONObject complaint = complaints.getJSONObject(i);
    String borough = complaint.getString("borough");
    
    if(borough.equals("Brooklyn"))
      brooklynComplaints++;
    else if(borough.equals("Manhattan"))
      manhattanComplaints++;
    else if(borough.equals("Queens"))
      queensComplaints++;
    else if(borough.equals("Staten Island"))
      statenIslandComplaints++;
    else if(borough.equals("bronx"))
      bronxComplaints++;
  }
  
  textSize(16);
  text("There were " + brooklynComplaints + " landmark complaints in Brooklyn", 0, 80);
  text("There were " + manhattanComplaints + " landmark complaints in Manhattan", 0, 140);
  text("There were " + queensComplaints + " landmark complaints in Queens", 0, 200);
  text("There were " + statenIslandComplaints + " landmark complaints in Staten Island", 0, 260);
  text("There were " + bronxComplaints + " landmark complaints in Bronx", 0, 320);
*/
}
