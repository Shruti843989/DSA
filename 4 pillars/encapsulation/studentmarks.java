 class student {
    private final int rollno;
    private String name;
    private int[] arr = new int[5];
    public student(int rollno, String name,int[] arr){
        this.name = name;
        this.rollno=rollno;
        setarr(arr);
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public int getrollno(){
        return rollno;
    }
    // public void setrollno(int roll){
    //     this.rollno = roll;
    // }
    public void setarr(int[] arr){
        if(arr.length==5){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>0 && arr[i]<=100){
                    this.arr[i]=arr[i];
                }else{
                    this.arr[i]=0;
                    System.out.println("Invalid mark at subject " + (i + 1) + ". Set to 0.");
                }
            }
        }else{
            System.out.println("Marks array must have 5 subjects!");
        }
    }
    public int[] getarr(){
        return arr.clone();
    }
       public double calculateAverage() {
        int sum = 0;
        for (int mark : arr) {
            sum += mark;
        }
        return sum / 5.0;
    }
}
public class studentmarks {
    public static void main(String[] args) {
        int[] marks = {85, 92, 76, 101, 88}; // 101 is invalid
        student std = new student(58, "shruti", marks);
        System.out.println("Roll Number: " + student.getrollno());
        System.out.println("Name: " + student.getname());
        System.out.print("Marks: ");
        // for (int m : student.getarr()) {
        //     System.out.print(m + " ");
        // }
        for(int m : student.setarr()){
            System.out.println(m+" ");
        }
        System.out.println("\nAverage Marks: " + student.calculateAverage());

        // Update name
        student.setname("John Smith");
        System.out.println("Updated Name: " + student.getname());
    }
}
    

