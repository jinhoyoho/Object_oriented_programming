public class HollePrinter
{
   public static void main(String[] args)
   {
      String str = "Hello, World!";
      String tmp = "z";
      
      str = str.replace("e", tmp); // e를 tmp로 바꾸기
      str = str.replace("o", "e"); // o를 e로 바꾸기
      str = str.replace(tmp, "o"); // tmp를 o로 바꾸기
      
      System.out.println(str);
    }    
}