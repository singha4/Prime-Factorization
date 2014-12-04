public class PrimeFactorization
{
  public static void main(String[] args)
  {
    if (isPrime(17) == true)
    {
      System.out.println("1 x " + 17);
    }
    else
    {
      System.out.println(primeFactorization(17));
    }
  }
  
  public static String primeFactorization(int num)
  {
    String prime = "";
    int count = 2;
    while (num > 1)
    {
        if (num % count == 0)
        {
            num /= count;
            prime = prime + count + " x ";
        }
        else
        {
            count++;
        }
    }
    return prime.substring(0, prime.length() - 2);
  }
  public static boolean isPrime(int num)
  {
    for (int i = 2; i < num; i++)
    {
      if (num % i == 0)
      {
        return false;
      }
    }
    return true;
  }
}