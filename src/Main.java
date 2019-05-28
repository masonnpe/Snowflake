public class Main {
    public static void main(String[] args) {
        int node = 1;
        Snowflake s = new Snowflake(node);
        while (true){
            System.out.println(s.next());
        }
    }
}
