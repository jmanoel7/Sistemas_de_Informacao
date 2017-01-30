package jmanoel.java2.work21;
import java.awt.Point;

/**
 * Describe class SetPoints here.
 *
 *
 * Created: Sun Jul 18 19:13:04 2010
 *
 * @author <a href="mailto:jmanoel@debian">JoÃ£o Manoel Leite Ribeiro Nogueira</a>
 * @version 1.0
 */
class SetPoints
{

   String livroVerso;
   Point location;

   /**
     * Creates a new <code>SetPoints</code> instance.
     *
     */
   SetPoints(int x, int y, String lv)
     {
	location = new Point(x,y);
	livroVerso = lv;
     }

   /**
    * Describe <code>main</code> method here.
    *
    * @param args a <code>String</code> value
    */
   public static void main(String[] arguments)
     {
	SetPoints sp = new SetPoints(4,13,"(Jo 3:16)");
	System.out.println("Starting location:");
	System.out.println("X equals " + sp.location.x);
	System.out.println("Y equals " + sp.location.y);
	
	System.out.println("\nMoving to (7, 6)");
	sp.location.x = 7;
	sp.location.y=6;
	
	System.out.println("\nEnding location:");
	System.out.println("X equals " + sp.location.x);
	System.out.println("Y equals " + sp.location.y);

	System.out.println("\nPorque Deus amou de tal maneira o mundo,");
	System.out.println(  "que  deu  o  Seu  Filho  Unigênito, para");
	System.out.println(  "que   todo  aquele  que  nele  crer  nao");
	System.out.println(  "pereça, mas tenha a vida eterna.");
	System.out.println("\t\t\t\t " + sp.livroVerso);
     }
}