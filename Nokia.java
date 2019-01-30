import java.util.Scanner;

class Nokia
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scan.nextInt();
        System.out.print("Converted: ");
        System.out.println(convert(input));
        System.out.print("Enter a string: ");
        Scanner scan2 = new Scanner(System.in).useDelimiter("\n");
        String inputs = scan2.next();
        int u=inputs.length();
        String[] array = inputs.split("\\W+");
        for(int i=0; i<array.length; i++)
        {
            System.out.print(convert(Integer.parseInt(array[i])));
        }
    }
    static char convert(int x)
    {
        switch(x)
        {
            case 1:
                return(',');
            case 11:
                return('.');
            case 111:
                return('?');
            case 2:
                return('a');
            case(22):
                return('b');
            case(222):
                return('c');
            case(3):
                return('d');
            case(33):
                return('e');
            case(333):
                return('f');
            case(4):
                return('g');
            case(44):
                return('h');
            case(444):
                return('i');
            case(5):
                return('j');
            case(55):
                return('k');
            case(555):
                return('l');
            case(6):
                return('m');
            case(66):
                return('n');
            case(666):
                return('o');
            case(7):
                return('p');
            case(77):
                return('q');
            case(777):
                return('r');
            case(7777):
                return('s');
            case(8):
                return('t');
            case(88):
                return('u');
            case(888):
                return('v');
            case(9):
                return('w');
            case(99):
                return('x');
            case(999):
                return('y'); 
            case(9999):
                return('z'); 
            case(0):
                return(' ');          
            default:
                return('I');
        }
    }
}