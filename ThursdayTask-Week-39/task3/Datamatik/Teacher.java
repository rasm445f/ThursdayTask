public class Teacher   {
    String name;
    int age;
    boolean isFemale;

    Teacher(String tmpName,int tmpAge,boolean tmpIsFemale){
        name = tmpName;
        age = tmpAge;
        isFemale = tmpIsFemale;

        String gender;
        if(isFemale==true){
        gender = "Female";
        }
        else{
        gender = "Male";
        }
       
        System.out.println(name+" "+age+" "+gender);
}

}