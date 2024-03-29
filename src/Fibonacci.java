
public class Fibonacci {
                  public static void main(String[] args) {
			int firstTerm=0,secondTerm=1,n=100;
			System.out.println("fibonacci series upto " + n + ":");
			while(firstTerm<=n) {
				System.out.print(firstTerm+",");
				int nextTerm=firstTerm+secondTerm;
				firstTerm=secondTerm;
				secondTerm=nextTerm;
			}
				}
}