// public class App {
//     public static void main(String[] args) {
//         int rev[] = {1,2,3,4,5,6,7,8,9};
//         int total = 0;
//         for(int x : rev){
//             total+=x;
//         }
//         System.out.println(total);
//     }
// }


// applying method to the string

// public class App{
//     public static void main(String[] args) {
//         int rev[] = {1,2,3,4,5,6,7,8,9};
//         change(rev);

//         for (int y:rev){
//             System.out.println(y);
//         }
//     }

//     public static void change(int y[]){
//         for(int i=0; i<y.length; i++){
//             y[i] += 10;
//         }
//     }
// }

/**
 * App
 */
// public class App {

//     public static void main(String[] args) {
//         int firstarray[][] = {{0,1,2,3,4},{0,1,2,3,4}};
//         int secondarray[][] = {{0},{1,2},{3,4,5,6}};

//         System.out.println("This is the first array:");
//         output(firstarray);
//         System.out.println("This is the second array:");
//         output(secondarray);

//     }
//     public static void output(int x[][]){
//         for(int row = 0; row < x.length;row++){
//             for(int column = 0; column < x[row].length;column++){
//                 System.out.print(x[row][column]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class rev{
//     public static void main(String[] args) {
//         System.out.println(average(1,2,3,4,5,6,7,8,9,0));
        
//     }
//     public static int average(int...number){
//         int total = 0;
//         for(int x:number)
//             total+=x;

//         return total/number.length;
//     }
// }

public class rev {

    public static void main(String[] args) {
        rev1 rev1object = new rev1();
        System.out.println(rev1object.tomilitary());
        System.out.println(rev1object.tostring());
        rev1object.settime(15, 5, 20);
        System.out.println(rev1object.tomilitary());
        System.out.println(rev1object.tostring());

    }
}

// public class rev {

//     public static void main(String[] args) {
        
//     }
// }
