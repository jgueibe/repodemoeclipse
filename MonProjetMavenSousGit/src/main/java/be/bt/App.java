package be.bt;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        showLoggingFrameworks();
        showPoolingFrameworks();
    }

	private static void showPoolingFrameworks() {
		// TODO Auto-generated method stub
		System.out.println("=======  HickariCP  ========");
	}

	private static void showLoggingFrameworks() {
		// TODO Auto-generated method stub
		System.out.println("======= LOG4J ===============");
		System.out.println("======= SLF4J Facade ===============");
	}
}
