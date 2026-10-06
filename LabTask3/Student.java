public class Student {
    private String name;
    private int[] result_array = new int[5] ;

    Student (String name, int[] marks){
        this.name=name;
        this.result_array=marks;
    }
    public String getName() {
        return name;
    }
    public int[] getResult_array() {
        return result_array;
    }
    public void setResult_array(int[] result_array) {
        this.result_array = result_array;
    }
    public void setName(String name) {
        this.name = name;
    }


    public void Average(){
        int average=0;
        for (int i = 0; i < result_array.length; i++) {
            average  += result_array[i];
            average /= result_array.length;

        }
        System.out.println("The Average of marks is: "+ average);
    }



}
