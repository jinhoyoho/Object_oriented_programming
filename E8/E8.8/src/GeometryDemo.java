import java.util.Scanner;

public class GeometryDemo
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter radius: ");
      double radius = in.nextDouble();
      System.out.println("Enter height: ");
      double height = in.nextDouble();

      System.out.printf("Sphere volume: %.2f", Sphere.sphereVolume(radius));
      System.out.println();
      System.out.printf("Sphere surface: %.2f" , Sphere.sphereSurface(radius));
      System.out.println();
      System.out.printf("Cylinder volume: %.2f"
            , Cylinder.cylinderVolume(radius, height));
      System.out.println();
      System.out.printf("Cylinder surface: %.2f"
            , Cylinder.cylinderSurface(radius, height));
      System.out.println();
      System.out.printf("Cone volume: %.2f" , Cone.coneVolume(radius, height));
      System.out.println();
      System.out.printf("Cone surface: %.2f"
            , Cone.coneSurface(radius, height));
   }
}