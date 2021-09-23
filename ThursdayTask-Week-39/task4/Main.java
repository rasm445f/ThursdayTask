class Main  {

public static void main(String[]args){
    int[] intArray = {2,4,6};
    String[] stringArray = {"hej","med","dig"};
    boolean[] booleanArray = {true,true,false};
    print(stringArray);
    int sum = addition(intArray);
    System.out.print(sum);
    int avg = averege(intArray);
    System.out.print(" "+avg);
}

static void print(String [] array){
    for(int i =0;i<array.length;i++){
    System.out.print(array[i]+" ");
    }
}
static int addition(int [] array)  {
    int sum=0;
    for(int i =0;i<array.length;i++){
        sum=array[i]+sum;

    }

return sum;
}
static int averege(int[]array){
    int sum = addition(array);
    int avg =0;
    avg=sum/array.length;
    return avg;
}
}