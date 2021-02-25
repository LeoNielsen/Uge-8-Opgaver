class Main{
  public static boolean happy = true;

  public static int answerOfLife = sumOfTwoNumbers(21, 21);

public static void main(String [] args) {
   if (iAmHappy())
   {
     System.out.println("I clap my hands");
   }
   else
   {
     System.out.println("I don't clap my hands"); 
   }

   System.out.println(answerOfLife);
   System.out.println(caps("uppercase"));

   System.out.println(firstCharIsCaps("ja"));

}


public static boolean iAmHappy()
{
  if (happy)
  {
    return true;
  } else{
    return false;
  }
}

static int sumOfTwoNumbers(int a, int b)
{
  return a + b;
}

static String caps(String str)
{
  str = str.toUpperCase();
return str;
}

static boolean firstCharIsCaps(String str)
{
  if (Character.isUpperCase(str.charAt(0)))
  {
    return true;
  } else {
    return false;
  }

}
}