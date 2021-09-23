public class Student {
    String name;
    int age;
    boolean isFemale;
    char datamatikerTeam;

    Student(String tmpName,int tmpAge,boolean tmpIsFemale,char tmpDatamatikerTeam){
        name = tmpName;
        age = tmpAge;
        isFemale = tmpIsFemale;
        datamatikerTeam = tmpDatamatikerTeam;

        String gender;
        if(isFemale==true){
        gender = "Female";
        }
        else{
        gender = "Male";
        }

        System.out.println(name+" "+age+" "+gender+" "+"team"+" "+datamatikerTeam);
    }
}
