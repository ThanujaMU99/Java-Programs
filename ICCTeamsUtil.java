class ICCTeamsUtil{

public static void main(String a[]){

	ICCTeams teams = new ICCTeams();
	teams.teamName = "India";
	teams.noOfMatches= 39;
	teams.rating = 266;	
	teams.points = 7456;
	System.out.println(teams.teamName+" " +teams.noOfMatches+" " +teams.rating+ " "+teams.points);
teams.cricket();
	
	ICCTeams teams1 = new ICCTeams();
	teams1.teamName = "Australia";
	teams1.noOfMatches= 33;
	teams1.rating = 241;	
	teams1.points = 7923;
	System.out.println(teams1.teamName+" " +teams1.noOfMatches+" " +teams1.rating+ " "+teams1.points);
teams1.cricket();

	
	ICCTeams teams2 = new ICCTeams();
	teams2.teamName = "New Zealand";
	teams2.noOfMatches= 24;
	teams2.rating = 257;	
	teams2.points = 7192;
	System.out.println(teams2.teamName+" " +teams2.noOfMatches+" " +teams2.rating+ " "+teams2.points);
teams2.cricket();
}

}