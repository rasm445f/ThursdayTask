class Main  {
   
    public static void main(String[]args){
        String word = "Sut";
        firsChar(word);
    }
    static boolean firsChar (String word){

    if (Character.isUpperCase(word.charAt(0)) == true){
        System.out.println("upper Case Start");
        return true;
    }
    else{
        System.out.println("no Upper Case Start");
        return false;
        
    }
}
}

   
    




