package homework.week1;

public class FibbonacciSeries {
	public static void main(String[] args) {
		    int n = 8, firstnum = 0, secondnum = 1;
		    for (int i = 1; i <= n; ++i) {
		      System.out.print(firstnum + ", ");

		      // compute the next num
		      int nextnum = firstnum + secondnum;
		      firstnum = secondnum;
		      secondnum = nextnum;
		    }
					


	}}
