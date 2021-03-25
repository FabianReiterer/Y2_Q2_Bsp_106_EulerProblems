/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.math.BigInteger;

/**
 *
 * @author Fabian
 */
public class EulerBL
{
  public static int multy()
  {
    int sum = 0;
    
    for (int i = 1; i < 1000; i++)
    {
      if(i % 3 == 0 || i % 5 == 0)
      {
        sum += i;
      }
    }
    return sum;
  }
  
  public static int triplet()
  {

    for (int i = 1; i < 1000; i++)
    {
      for (int j = i+1; j < 1000; j++)
      {
        for (int k = j+1; k < 1000; k++)
        {
          if((Math.pow(i, 2) + Math.pow(j,2) == Math.pow(k, 2)) && (i + j + k) == 1000)
          {
            return i*j*k;
          }
        }
      }
    }
    return 0;
  }
  
  public static int factorial()
  {
    BigInteger factorial = new BigInteger("1");
    BigInteger ziffer;
    int quersumme = 0;
    int value;
    for (int i = 1; i < 100; i++) 
    {
      factorial = factorial.multiply(BigInteger.valueOf(i));
    }
    
    while(!factorial.equals(BigInteger.valueOf(0)))
    {
      ziffer = factorial.mod(BigInteger.valueOf(10));
      factorial = factorial.divide(BigInteger.valueOf(10));
      value = ziffer.intValue();
      quersumme += value;
    }
    
    return quersumme;
  }
  
  public static String permutations()
  {
    int[] numbers = {0,1,2,3,4,5,6,7,8,9};
    for (int i = 0; i < 999999; i++)
    {
      int j = numbers.length - 1;
      while(numbers[j-1] >= numbers[j])
      {
        j --;
      }
      int k = numbers.length;
      while(numbers[k-1] <= numbers[j-1])
      {
        k --;
      }
      int help = numbers[j-1];
      numbers[j-1] = numbers[k-1];
      numbers[k-1] = help;
      j ++;
      k = numbers.length;
      while(j<k)
      {
        help = numbers[j-1];
        numbers[j-1] = numbers[k-1];
        numbers[k-1] = help;
        j ++;
        k --;
      }
    }
    StringBuilder number = new StringBuilder();
    for (int j : numbers) {
      number.append(j);
    }
    return number.toString();
  }
  public static String powerDigitSum()
  {
    BigInteger sum = new BigInteger("0");
    BigInteger square = new BigInteger("2");
    long ergeb;
    
    for (int i = 1; i < 1000; i++)
    {
      square = square.multiply(BigInteger.valueOf(2));
    }

    while(!square.equals(BigInteger.valueOf(0)))
    {
      sum = sum.add(square.mod(BigInteger.valueOf(10)));
      square = square.divide(BigInteger.valueOf(10));
    }
    ergeb = sum.intValue();
    
    return ergeb+"";
  }
}
