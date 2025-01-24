applying method to the string

public class add_string{
    public static void main(String[] args) {
        int rev[] = {1,2,3,4,5,6,7,8,9};
        change(rev);

        for (int y:rev){
            System.out.println(y);
        }
    }

    public static void change(int y[]){
        for(int i=0; i<y.length; i++){
            y[i] += 10;
        }
    }
}
