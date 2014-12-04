public class PrimeFactorization
{
  public static void main(String[] args)
  {
      System.out.println(primeFactorization(17));
  }
  
  public static String primeFactorization(int num)
  {
    String prime = "";
    int count = 2;
    int factors = 0;
    while (num > 1)
    {
        if (num % count == 0)
        {
            num /= count;
            prime = prime + count + " x ";
            factors++;
        }
        else
        {
            count++;
        }
    }
    if (factors == 1)
    {
      prime = "1 x " + prime;
      return prime.substring(0, prime.length() - 2);
    }
    return prime.substring(0, prime.length() - 2);
  }
}