package Review9;

public class Sport {
    //static variable
    boolean fun;
    String type, teamName;
    int numberOfPlayers;
    String location;
    String coach;
    Sport(String type, String teamName){
        this.type=type;
        this.teamName=teamName;
    }
    Sport (String type,String teamName, int numberOfPlayers, String location, String coach){
     this(type,teamName);
      this.type=type;
       this.teamName=teamName;
        this.numberOfPlayers=numberOfPlayers;
        this.location=location;
        this.coach=coach;
    }
    public void play(){
        System.out.println("We play "+type);
    }
    void watch(String stream){
        System.out.println("I am watvhing "+type);
    }

}
