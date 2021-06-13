void setup(){
  size(400,400);
  JSONArray complaints = loadJSONArray("https://data.cityofnewyork.us/resource/ck4n-5h6x.json");
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
}
