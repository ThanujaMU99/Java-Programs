class ProjectDTOUtil{

public static void main(String a[]){

ProjectDTO dto = new ProjectDTO();
dto.setProjectId(1976308l);
dto.setTitle("Home Automation using Arduino Uno");
dto.setTeamMembers(4);
dto.setCost(5000);
dto.setDuration("1 month");

System.out.println(dto.getProjectId()+" "+dto.getTitle()+ " "+dto.getTeamMembers()+" "+dto.getCost()+" "+dto.getDuration());

}


}