public class PrimeFactorization
{
  public static void main(String[] args)
  {
    System.out.println(primeFactorization(140));
  }
  
  public static String primeFactorization(int num)
  {
    String prime;
    int count = 2;
    while (num > 1)
    {
        if (num % count == 0)
        {
            num /= count;
            prime = prime + count + "x ";
        }
        else
        {
            count++;
        }
    }
    return prime;
  }
}