public class Main {

    public static void main(String[] args) {

        int x = 1;
        System.out.print("First 10 Square Numbers:");
        while(x<=10){
           int z = x * x;
           System.out.print(z + " ");
           x = x +1;

        }
        System.out.println(" ");


        int y = 1;
        System.out.print("First 10 Cube Numbers:");
        while(y<=10) {
            int q = y * y * y;

            System.out.print(q + " ");
            y = y + 1;
        }
        System.out.println(" ");


        int numb1= 0;
        int numb2= 1;
        int numb3 = 0;
        System.out.print("First 10 Fibonacci Numbers:");
        while (numb3<80){

            numb3= numb1 + numb2;
            System.out.print(numb3 + " ");
            numb1 = numb2;
            numb2 = numb3;

        }
        System.out.println(" ");

        int firstNum;
        int secondNum = 1;
        int num;
        System.out.print("First 10 Prime Numbers:");

        while (secondNum <= 29) {
            num = 0;
            firstNum = 2;
            while (firstNum <= secondNum / 2) {
                if (secondNum % firstNum == 0) {
                    num++;
                    break;
                }
                firstNum++;
            }
            if (num == 0 && secondNum != 1) {
                System.out.print(secondNum + " ");
            }
            secondNum++;
        }

        System.out.println(" ");
            int tri1 = 0;
            int tri2 = 1;
            int tri3 = 1;
            System.out.print("First 10 Triangle Numbers:");
            while (tri3 != 55){
                tri3 = tri1 + tri2;
                System.out.print(tri3 + " ");
                tri1 = tri3;
                tri2 = tri2 + 1;

            }








    }
}
