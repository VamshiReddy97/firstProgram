/*
 Java Break Statement
When a break statement is encountered inside a loop, the loop is immediately terminated and the program
 control resumes at the next statement following the loop.

The Java break statement is used to break loop or switch statement. It breaks the current flow of the program 
at specified condition. In case of inner loop, it breaks only inner loop.

We can use Java break statement in all types of loops such as for loop, while loop and do-while loop.

Syntax:

jump-statement;    
break;   
 */
  
package praticesPrograms;

public class BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// outer loop
		for (int i = 1; i <= 3; i++) {
			// inner loop
			for (int j = 1; j <= 3; j++) {
				if (i == 2 && j == 2) {
					// using break statement inside the inner loop
					break;
				}
				System.out.println(i + " " + j);
			}
		}
	}
}
