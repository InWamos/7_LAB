public class TestRational
{
    public static void main(String[] args)
    {
        Rational rational = new Rational();
        Rational rational1 = new Rational(16, 2);
        Rational rational2 = new Rational(8, 2);

        rational.intFormat(rational.add(rational1, rational2));
        rational.realFormat(rational.add(rational1, rational2));

        rational.intFormat(rational.sub(rational1, rational2));
        rational.realFormat(rational.sub(rational1, rational2));

        rational.intFormat(rational.mult(rational1, rational2));
        rational.realFormat(rational.mult(rational1, rational2));

        rational.intFormat(rational.div(rational1, rational2));
        rational.realFormat(rational.div(rational1, rational2));

    }
}