package sec11.exam01_final_field;

public class PeopleExample {

	public static void main(String[] args) {
People prsn = new People("920120-1203329", "lee jinho");

//prsn.nation = "USA";
// keyword 'final' makes this one cannot be modified

System.out.println("nation: " +prsn.nation);
System.out.println("name: "+ prsn.name);
System.out.println("ssn: " + prsn.ssn);
	
	}

}
