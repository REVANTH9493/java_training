public class print_array {

    public static void main(String[] args) {
        int firstarray[][] = {{0,1,2,3,4},{0,1,2,3,4}};
        int secondarray[][] = {{0},{1,2},{3,4,5,6}};

        System.out.println("This is the first array:");
        output(firstarray);
        System.out.println("This is the second array:");
        output(secondarray);

    }
    public static void output(int x[][]){
        for(int row = 0; row < x.length;row++){
            for(int column = 0; column < x[row].length;column++){
                System.out.print(x[row][column]+" ");
            }
            System.out.println();
        }
    }
}
