public class Casting {
    public static void main(String[] args){
        byte b = 127;
        int i = (int) b;

        System.out.println(b);

        double d = 35.25;
        double dd = 35.99;

        // casting the double d into a int
        int i1 = (int) d;

        // casting the double dd into a int
        int ii1 = (int) dd;
        System.out.println(i1);
        System.out.println(ii1)

        int i2 = 35;
        float f = i2;
        System.out.println("The number is: " + f);
    }

}

/*
TYPE CASTING

Type	Size in Bytes	Range
byte	1 byte	-128 to 127
short	2 bytes	-32,768 to 32,767
int	4 bytes	-2,147,483,648 to 2,147,483, 647
long	8 bytes	-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	4 bytes	approximately ±3.40282347E+38F
double	8 bytes	approximately ±1.79769313486231570E+308
char	2 bytes	0 to 65,536
boolean	n/a	true of false
*/