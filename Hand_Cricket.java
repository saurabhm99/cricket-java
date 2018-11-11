import java.util.*;
class Hand_Cricket
{
    static double a=0,b=0,c=0,d=0,e=0,g=0,m=0;
    static double x=0;
    static long f=0;
    static String name="",h;
    public static void rules()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is a game of hand cricket");
        System.out.println("1: You first have to enter a number from one to 10");
        System.out.println("Then the computer will enter a number");
        System.out.println("If the number of yours and the computer differs then the number will be added to your runs");
        System.out.println("If the number of the computer and your number matches then you are out and the game is over");
        System.out.println();
        System.out.println("It will be vice versa when you will be bowling");
        System.out.println();
        System.out.println("To play the game press 1");
        System.out.println("To see the example press 3");
        System.out.println("To exit the game press 4");
        int k=sc.nextInt();
        if(k==1)
        {
            game();
        }
        else if(k==3)
        {
            example();
        }
        else if(k==4)
        {
            exit();
        }
    }
    public static void example()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is an example of the game");
        System.out.println("1: Supposing you enter number 6");
        System.out.println("2: Supposing the computer enters number 8");
        System.out.println("3: Then the 6 runs will be added to your score");
        System.out.println();
        System.out.println("4:But supposing you enter a number 4");
        System.out.println("5: And the computer also plays number 4 then you will be out and the game will be over");
        System.out.println();
        System.out.println("It will be vice versa when you will be bowling");
        System.out.println();
        System.out.println("To play the game press 1");
        System.out.println("To see the rules press 2");
        System.out.println("To exit the game press 4");
        int k=sc.nextInt();
        if(k==1)
        {
            game();
        }
        else if(k==2)
        {
            rules();
        }
        else if(k==4)
        {
            exit();
        }
    }
    public static void exit()
    {
        System.out.println("/t/t/t/tThank you");
    }
    public static void game()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\tYou have entered the game now");
        System.out.println("\t\t\t\tEnter your name");
        name=sc.nextLine();
        System.out.println("\t\t\t\tIts toss time!!!!");
        System.out.println("\t\t\t\tEnter head or tail");
        h=sc.nextLine();
        e=Math.random();
        f=Math.round(e);
        if(f>0 && f<=6)
        {
            System.out.println("\t\t\t\tIts "+h+" You have won the toss");
            System.out.println("\t\t\t\tEnter 1 to bat first or enter 2 to bowl first");
            g=sc.nextInt();
            if(g==1)
            game1();
            else
            game2();
        }
        else
        {
            System.out.println("\t\t\t\tYou have loss the toss and computer chooses to bowl first");
            g=1;
            game1();
        }
    }
        public static void game1()
        {
            System.out.println("\t\t\t\tYou are batting now");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<=100000;i++)
        {
            a=Math.random();
            b=a*10;
            x=Math.ceil(b);
            System.out.println();
            System.out.println("\t\t\t\tEnter a number from 1 to 10");
            int n=sc.nextInt();
            System.out.println();
            System.out.println("\t\t\t\tYou play "+n);
            System.out.println("\t\t\t\tComputer plays "+x);
            if(n!=x)
            {
                c=c+n;
            }
            else
            {
                break;
            }
        }
        System.out.println("\t\t\t\t"+name+" Your score = "+c+" runs");
        if(g==1)
        game2();
        else
        {
            if(m>c)
            System.out.println("\t\t\t\tComputer wins the game");
            else
            System.out.println("\t\t\t\t"+name+" You win the game");
    }
    }
    public static void game2()
    {
        System.out.println("\t\t\t\tYou are bowling now");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<=100000;i++)
        {
            a=Math.random();
            b=a*10;
            x=Math.ceil(b);
            System.out.println();
            System.out.println("\t\t\t\tEnter a number from 1 to 10");
            int n=sc.nextInt();
            System.out.println();
            System.out.println("\t\t\t\tYou play "+n);
            System.out.println("\t\t\t\tComputer plays "+x);
            if(n!=x)
            {
                m=m+x;
            }
            else
            {
                break;
            }
        }
        System.out.println("\t\t\t\tComputer score = "+m+" runs");
        if(g==2)
        {
        game1();
    }
        else
        {
            if(m>c)
            System.out.println("\t\t\t\tComputer wins the game");
            else
            System.out.println("\t\t\t\t"+name+" You win the game");
        }
    }
        
    
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to play the game");
        System.out.println("Enter 2 to see the rules");
        System.out.println("Enter 3 to see the example");
        System.out.println("Enter 4 to exit the game");
        int k=sc.nextInt();
        if(k==1)
        {
            game();
        }
        else if(k==2)
        {
            rules();
        }
        else if(k==3)
        {
            example();
        }
        else if(k==4)
        {
            exit();
        }
    }
    public Hand_Cricket()
    {
        a=0.0;
        b=0.0;
        c=0.0;
        d=0.0;
        e=0.0;
        g=0.0;
        x=0;
        f=0;
        name="";
    }
}
//saurabhm
