import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // Practical Quiz 1

        // 1- Write a Java program that accept three numbers from the user and print the largest number .

//        System.out.println("Enter three numbers to find the largest:");
//
//        System.out.println("Enter first number:");
//        int num1 = in.nextInt();
//
//        System.out.println("Enter Second number :");
//        int num2 = in.nextInt();
//
//        System.out.println("Enter Third number:");
//        int num3 = in.nextInt();
//
//        int lageest = 0;
//        if(num1 > num2 && num1 > num3){
//            lageest =num1;
//            System.out.println(" The Largest is :"+ num1);
//        } else if(num2 > num1 && num2 > num3){
//            lageest = num2;
//            System.out.println("The largest is :"+num2);
//        } else System.out.println("The largest is :"+num3);
//--------------------------------------------------------
        //2- Write a Java program that accept a String and a number from the user,then print the character in the given index .

        System.out.println("Enter a String : ");
        String userString = in.nextLine();

        int index = in.nextInt();

            while (true) {
                if (index > userString.length()) break;
                else if(index <= userString.length() -1){
                    System.out.println("Enter a index number to print the character in that index");
                    index = in.nextInt();
                    System.out.println(userString.charAt(index));
                }
            }
//-------------------------------------------------------
//3- Write a program to enter the numbers till the user wants and at the end it should display the sum entered .
//        System.out.println("Enter new number or 0 to quit the program:");
//        int numbers = in.nextInt();
//
//        int sum = 0;
//        do{
//            System.out.println("Enter new number or 0 to quit the program:");
//            numbers = in.nextInt();
//                sum = sum+numbers;
//        }while (numbers !=0);
//        System.out.println("The sum of all entered numbers = " + sum);
//--------------------------------------------------------
//4- Write a Java program to find positive and negative numbers of a given array:
//       int[] arr = {10, -21 , 30, 31, -25};
//
//       for(int a : arr){
//           if(a >= 0){
//               System.out.println(a + " is a positive number" );
//           }else System.out.println(a + " is a negative number");
//       }

//------------------------------------------------------
//5-Write a Java program to find a shortest word of a given array
// [“Tuwaiq”, “Bootcamp” , “Student”,”JAVA”]
//
// String[] array = {"Tuwaiq","Bootcamp","Student","JAVA"};
//
// String shortest = array[0];
//
// for (String s : array){
//     if(shortest.length() < array[1].length() && shortest.length()< array[2].length() && shortest.length() <array[3].length() ){
//         System.out.println(shortest);
//         break;
//     }else if(array[1].length() < array[0].length() && array[1].length() < array[2].length() && array[1].length()<array[3].length()){
//         shortest = array[1];
//         System.out.println(shortest);
//         break;
//     }else if(array[2].length() < array[0].length() && array[2].length() < array[1].length() && array[2].length()<array[3].length()){
//         shortest = array[2];
//         System.out.println(shortest);
//         break;
//     } else {
//         shortest = array[3];
//         System.out.println(shortest);
//         break;
//}
// }



     }
 }


