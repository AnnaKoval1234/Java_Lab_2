class Fraction
{
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator()
    {
        return numerator;
    }
    public int getDenominator()
    {
        return denominator;
    }
    public void setNumerator(int numerator)
    {
        this.numerator = numerator;
    }
    public void setDenominator(int denominator)
    {
        this.denominator = denominator;
    }

    private int GCD(int a, int b)
    {
        while (a != b)
        {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }
    private int LCM(int a, int b)
    {
        return a * b / GCD(a, b);
    }
    private Fraction reduce(Fraction f)
    {
        int nod = GCD(Math.abs(f.getNumerator()), f.getDenominator());
        f.setNumerator(f.getNumerator() / nod);
        f.setDenominator(f.getDenominator() / nod);
        return f;
    }
    
    public Fraction sum(Fraction f)
    {
        if (f.denominator == denominator)
            return reduce(new Fraction(numerator + f.numerator, denominator));
        else
        {
            int nok = LCM(denominator, f.denominator);
            int k1 = nok / denominator;
            int k2 = nok / f.denominator;
            int num = k1 * numerator + k2 * f.numerator;
            return reduce(new Fraction(num, nok));
        }
    }
    public Fraction minus(Fraction f)
    {
        if (f.denominator == denominator)
            return reduce(new Fraction(numerator - f.numerator, denominator));
        else
        {
            int nok = LCM(denominator, f.denominator);
            int k1 = nok / denominator;
            int k2 = nok / f.denominator;
            int num = k1 * numerator - k2 * f.numerator;
            return reduce(new Fraction(num, nok));
        }
    }
    public Fraction mult(Fraction f)
    {
        return reduce(new Fraction(numerator * f.numerator, denominator * f.denominator));
    }
    public Fraction div(Fraction f)
    {
        return mult(new Fraction(f.denominator, f.numerator));
    }
    public Fraction sum(int number)
    {
        Fraction f = new Fraction(number, 1);
        return sum(f);
    }
    public Fraction minus(int number)
    {
        Fraction f = new Fraction(number, 1);
        return minus(f);
    }
    public Fraction mult(int number)
    {
        Fraction f = new Fraction(number, 1);
        return mult(f);
    }
    public Fraction div(int number)
    {
        Fraction f = new Fraction(number, 1);
        return div(f);
    }

    @Override
    public String toString()
    {
        return numerator + " / " + denominator;
    }
}