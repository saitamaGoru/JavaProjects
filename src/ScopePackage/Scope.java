package ScopePackage;

public class Scope {
	private static int x =1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
		System.out.printf("local x in main is %d%n",x);
		
		useLocalVariable();
		useField();
		useLocalVariable();
		useField();
		
		System.out.printf("%nlocal x in main is %d%n",x);
	}
	
	public static void useLocalVariable()
	{
		int x =25;
		System.out.printf("%nlocal x on entering method useLoacalVariable is %d%n",x);
		++x;
		System.out.printf("%nlocal x before exiting method useLoacalVariable is %d%n",x);
	}
	public static void useField()
	{
		
		System.out.printf("%nfield x on entering method useField is %d%n",x);
		x*=10;
		System.out.printf("%nfield x before exiting method useField is %d%n",x);
	}
}
