class Country1{

static String countryName[]=new String[4];
public static void main(String a[]){

countryName[0]="India";
countryName[1]="sri lanka";
countryName[2]="england";
countryName[3]="pakisthan";

getCountryName();
}
public static void getCountryName(){
System.out.println(countryName.length);
for(int i=0;i<countryName.length;i++){
	System.out.println(countryName[i]);
	}
	}

}