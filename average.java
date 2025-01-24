public class average{
    public static void main(String[] args) {
        System.out.println(average(1,2,3,4,5,6,7,8,9,0));
        
    }
    public static int average(int...number){
        int total = 0;
        for(int x:number)
            total+=x;

        return total/number.length;
    }
}
