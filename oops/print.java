 class pen {  
    String color;
    String type;

    public void write(){
        System.out.println("fruihbfbnfb");
    }
    //important 
    public void printcolor(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}
    public class print {
        public static void main(String[] args) {
            pen pen1 = new pen();
            pen1.color ="blue";
            pen1.type="gel";

            pen1.write();
            pen1.printcolor();
        
    }
}
