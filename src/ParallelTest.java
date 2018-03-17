import org.testng.annotations.Test;

public class ParallelTest {
  @Test
  public void a() {
	  System.out.println("print a");
  }
   @Test
   public void c()
   {
	   System.out.println("print c");
   }
   @Test
   public void b()
   {
	   System.out.println("print b");
   }
}
