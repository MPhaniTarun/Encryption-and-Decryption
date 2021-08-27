import java.util.Scanner;
class encryption_cc
{
public static void main(String[] args)
{
  System.out.println("\nEnter Text:-");
  Scanner sc=new Scanner(System.in);
  StringBuffer a= new StringBuffer("");
  a.append(sc.nextLine());
  int l=a.length();
  System.out.println("\nEnter Key:-");
  int key=sc.nextInt();
  key=key%25;
  
  //Encyption
  
  System.out.println();
  System.out.println("Encrypted:-");
  for(int i=0;i<l;i++)
  {
    if(a.charAt(i)!=' ')
    {
      if (Character.isUpperCase(a.charAt(i)))
      {
        if (((int)(a.charAt(i)+key))>90)
        {
          a.append((char)((int)(a.charAt(i)+key)-91+65));
        }
        else
        {
          a.append((char)(a.charAt(i)+key));
        }
      }
      else
      {
        if (((int)(a.charAt(i)+key))>122)
        {
          a.append((char)((int)(a.charAt(i)+key)-123+97));
        }
        else
        {
          a.append((char)(a.charAt(i)+key));
        }
      }
    }
    else
    {
      a.append(' ');
    }
  }
  a.delete(0,l);
  System.out.println(a);
  System.out.println();

  // Decryption

  System.out.println("Decrypted:-");
  for(int i=0;i<l;i++)
  {
    if(a.charAt(i)!=' ')
    {
      if (Character.isUpperCase(a.charAt(i)))
      {
        if (((int)(a.charAt(i)-key))<65)
        {
          a.append((char)((int)(a.charAt(i)-key)+91-65));
        }
        else
        {
          a.append((char)(a.charAt(i)-key));
        }
      }
      else
      {
        if (((int)(a.charAt(i)-key))<97)
        {
          a.append((char)((int)(a.charAt(i)-key)+123-97));
        }
        else
        {
          a.append((char)(a.charAt(i)-key));
        }
      }
    }
    else
    {
      a.append(' ');
    }
  }
  a.delete(0,l);
  System.out.println(a);
}
}