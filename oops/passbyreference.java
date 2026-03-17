public class passbyreference {
        String name;
        int rno;
        double percent;
        public static void fun(passbyreference x){
            System.out.println(x.name);
        }
        public static void change(passbyreference s){
            s.name="Rohan";
        }
        public static void main(String[] args) {
            passbyreference s1 = new passbyreference();
            s1.name="shruti";
            s1.rno=24;
            s1.percent=54.4;
            System.out.println(s1.name);
            change(s1);
            System.out.println(s1.name);

        }
    }

