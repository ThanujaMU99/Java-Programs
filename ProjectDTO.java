public class ProjectDTO{

public ProjectDTO(){
System.out.println("ProjectDTO object is crested");
}

private long projectId;
private String title;
private int teamMembers;
private int cost;
private String duration;

public long getProjectId(){
return projectId;
} 
public void setProjectId(long projectId){
this.projectId=projectId;
}
public String getTitle(){
return title;
} 
public void setTitle(String title){
this.title=title;
}
public int getTeamMembers(){
return teamMembers;
} 
public void setTeamMembers(int teamMembers){
this.teamMembers=teamMembers;
}
public int getCost(){
return cost;
} 
public void setCost(int cost){
this.cost=cost;
}
public String getDuration(){
return duration;
} 
public void setDuration(String duration){
this.duration=duration;
}


}