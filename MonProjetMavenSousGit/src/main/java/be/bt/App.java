package be.bt;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * 
     * Commentaire ajouter sur la main du programme principal
     */
	
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        showLoggingFrameworks();
        showPoolingFrameworks();
    }

	private static void showPoolingFrameworks() {
		// TODO Auto-generated method stub
		System.out.println("=======  HickariCP  ========");
		System.out.println("=======  C3PO  ========");
	}

	private static void showLoggingFrameworks() {
		// TODO Auto-generated method stub
		System.out.println("======= LOG4J ===============");
		System.out.println("======= SLF4J Facade ===============");
	}
}
