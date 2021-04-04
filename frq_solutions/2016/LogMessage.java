import java.util.*;
public class LogMessage {
    private String machineId;
    private String description;

/** Precondition: message isa valid log message. */
    public LogMessage(String message){ 
        machineId = message.substring(0, message.indexOf(':'));
        description = message.substring(message.indexOf(':')+1); 
    }

    /** Returns true if the description in this log message properly contains keyword;
    * false otherwise.
    */

    public boolean containsWord(String keyword){ 
       int slength = keyword.length();
       int index = description.indexOf(keyword);
       
       if( index >= 0){
            if(index == 0 || description.substring(index-1,index).equals(" ")){
                
                if(description.length() == index+slength || description.substring(index+slength,index+slength+1).equals(" ") ){
                    return true; 
                }
            }
       }
       return false;
    }

    public String getMachineId(){
        return machineId; 
    }

    public String getDescription(){
        return description; 
    }

    public static void main(String[] args) {
        String message = "SERVER1:error on disk3";
        LogMessage lMessage = new LogMessage(message);
        System.out.println(lMessage.getMachineId() + " " + lMessage.getDescription());
        System.out.println(lMessage.containsWord("disk"));

        LogMessage lMessage1 = new LogMessage("CLIENT3:security alert - repeated login failures");
        LogMessage lMessage2 = new LogMessage("Webserver:disk offline");
        LogMessage lMessage3 = new LogMessage("SERVER1:file not found");
        LogMessage lMessage4 = new LogMessage("SERVER2:read error on disk DSK1");
        LogMessage lMessage5 = new LogMessage( "SERVER1:write error on disk DSK2");
        LogMessage lMessage6 = new LogMessage(  "Webserver:error on /dev/disk");
        ArrayList<LogMessage> messages = new ArrayList<LogMessage>(
            Arrays.asList(lMessage1,lMessage2,lMessage3,lMessage4,lMessage5,lMessage6)
        );

        SystemLog sLog = new SystemLog(messages);
        System.out.println(sLog.removeMessages("disk"));
    }
}

class SystemLog{
private ArrayList<LogMessage> messageList;
private ArrayList<LogMessage> containList;
public SystemLog(ArrayList<LogMessage> messages){
    this.messageList = new ArrayList<LogMessage>();
    this.messageList = messages;
}
public ArrayList<LogMessage> removeMessages (String keyword){ 
    this.containList = new ArrayList<LogMessage>();
    for(LogMessage message : this.messageList){
        if(message.containsWord(keyword)){
            containList.add(message);
            
        }
    }
    return containList;
}


}
