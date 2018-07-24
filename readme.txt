WRITE A FUNCTION THAT ACCEPTS A USER INPUT PHONE NUMBER AS A STRING AND RETURNS A NORMALIZED UNITED STATES PHONE NUMBER IN E.164 FORMAT. RETURN NULL (OR AN EQUIVALENT VALUE) IF THE USER INPUT IS INVALID.

------------------------------------------------------------  SOLUTION  -------------------------------------------------------------------

GENERAL DOCUMENTATION:

- I have used Java language for this program and developed it in eclipse IDE.
- No third party libraries are used for the solution.
- There are no assumption for providing the input. Users can input anything they want. Program will print the result according the input. If 	the input is valid and has all 10 digit numbers, then it will print the United states phone number in E.164 format. 

- If the input is invalid, then it will return null. 
- Java.util.* package is used in the program.
- Program has main class NUMBER_FORMAT which has function MAIN that is responsible to take the input from users. It then make a function call to function FORMAT by passing the user input to it.

- The class NUMBER_FORMAT also has the function FORMAT which (accepts the string and returns string) is responsible to convert the input (provided by function main) into US number E.164 format (if the input is valid).

------------------------------------------------------------------------------------------------------------------------------------------

SAMPLE INPUT AND OUTPUT:

Run the number_format.java file in order to test it.

1) Input: 		Please enter 10 digit number
			3617593514
Output: 		+1(361)759-3514


2) Input: 		Please enter 10 digit number
			1234567890
Output: 		+1(123)456-7890


3) Input: 		Please enter 10 digit number
			12345
Output: 		null


4) Input: 		Please enter 10 digit number

Output: 		null


5) Input: 		Please enter 10 digit number
			12345abcde
Output: 		null


6) Input: 		Please enter 10 digit number
			abcde12345
Output: 		null


7) Input: 		Please enter 10 digit number
			abcdefg
Output: 		null


8) Input: 		Please enter 10 digit number
			!@#$%12345
Output: 		null


