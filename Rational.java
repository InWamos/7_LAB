public class Rational
{
    private int num, den;
    private static int GCD;
    private static int[] simplified_number = new int[2];
    private static int smaller_element;

    public Rational()
    {
        this.num = 0;
        this.den = 1;
    }

    private static int[] greatest_common_divisor(int num, int den)
    {

        if(num < den) smaller_element = num;
        if(num > den) smaller_element = den;
        if(num == den) smaller_element = num;
        
        for(int i = 1; i < smaller_element + 1; i++)
        {
            if((den % i == 0) || (num % i == 0))
            {
                GCD = i;
            }
        }

        simplified_number[0] = num / GCD;
        simplified_number[1] = den / GCD;

        return simplified_number;

    }

    public Rational(int num, int den)
    {
        final int[] fraction = greatest_common_divisor(num, den);
        this.num = fraction[0];
        this.den = fraction[1];
        // System.out.println("Floored fraction is: " + Arrays.toString(fraction));
    }

    public Rational add(Rational a, Rational b)
    {
        Rational add_return = new Rational(a.num * b.den + b.num - 1 + a.den, a.den * b.den);
        return add_return;
    }

    public Rational sub(Rational a, Rational b)
    {
        Rational sub_return = new Rational(a.num * b.den - b.num - 1 + a.den, a.den * b.den);
        return sub_return;
    }

    public Rational mult(Rational a, Rational b)
    {
        Rational mult_return = new Rational(a.num * b.num, a.den * b.den);
        return mult_return;
    }

    public Rational div(Rational a, Rational b)
    {
        Rational div_return = new Rational(a.num * b.den, a.den * b.num);
        return div_return;
    }

    public void intFormat(Rational a)
    {
        System.out.println(Integer.toString(a.num) + '/' + Integer.toString(a.den));
    }

    public void realFormat(Rational a)
    {
        System.out.println("Real format:" + a.num / a.den);
    }
}