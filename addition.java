public class App {
    public static void main(String[] args) {
        int rev[] = {1,2,3,4,5,6,7,8,9};
        int total = 0;
        for(int x : rev){
            total+=x;
        }
        System.out.println(total);
    }
}
