import java.util.Scanner;

/**
 * triangles
 */
public class triangles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side one: ");
        int side1=input.nextInt();
        System.out.println("Enter side two: ");
        int side2=input.nextInt();
        System.out.println("Enter side three: ");
        int side3=input.nextInt();
        if (side1==side2 && side2==side3 && side1==side3){
            System.out.println("It is an Equilateral Triangle");
        }
        else if (side1==side2 && side2 != side3 || side2==side3 && side1 != side3 || side1==side3  && side2 != side3){
            System.out.println("It is an Isosceles Triangle");
        }
        else if (side1!=side2 && side2!=side3){
            if (side1*side1==side2*side2+side3*side3 || side2*side2==side1*side1+side3*side3 || side3*side3==side1*side1+side2*side2){
                System.out.println(" It is a Right Triangle");
        }
        } 
        else{
            System.out.println("It is a scalene Triangle");
        }
    }
}