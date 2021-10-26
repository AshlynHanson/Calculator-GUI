# Calculator-GUI

https://user-images.githubusercontent.com/44590338/138946931-3521aa48-8e43-49aa-a6c4-26ce8b3ecb1f.mov

## Calculate (=)
The calculator should be able to run the calculation whenever the user hits the ‘=’ button. Everything the user entered should be calculated and the result should be displayed to the screen on the calculator.
Example: 4-1=3; 5+7=12; 9/3=3; 8*8=64; 16sqrt=4

## AC (reset)
<img width="519" alt="Screen Shot 2021-10-26 at 2 26 00 PM" src="https://user-images.githubusercontent.com/44590338/138947492-06c18369-0502-4def-94d4-df235705f0a6.png">

The calculator should be able to reset the text whenever the AC button is pressed. This will cause everything that has been entered or calculated to disappear from the display screen so that the text field is now blank.

## Addition (+)
<img width="521" alt="Screen Shot 2021-10-26 at 2 25 36 PM" src="https://user-images.githubusercontent.com/44590338/138947431-68f63e56-b85f-46bc-adc6-3cf6d855479e.png">

The Calculator should be able to take two numbers and add them together. Example: 3+4 = 7
1. A number should be entered that could be as long as the user wants it to be.
2. Then the plus (‘+’) button should be entered
3. Followed by another number that can be as long as the user wants it to be.
4. The ‘=’ button is hit.
5. The two numbers should be added together.
6. The resulting text should be the first number, ‘+’, the second number, ‘=’, and the
sum of those two numbers.
     
     
## Subtraction (-)
<img width="506" alt="Screen Shot 2021-10-26 at 2 25 17 PM" src="https://user-images.githubusercontent.com/44590338/138947355-a2891bd1-b842-4829-80dd-f7b6937942a0.png">

The Calculator should also be able to run the subtraction function which works similarly to the addition function but with a different operator.
Example: 7-3 = 4
1. One number is entered first, as long as the user wants it to be.
2. Then the ‘-’ operator would be entered by the user hitting the button.
3. Another number would be entered.
4. The whole operation is run as soon as the user hits the ‘=’ button.
5. The second number is then subtracted from the first.
6. The resulting text displayed on the calculator is the first number, ‘-’, the second
number, ‘=’, and the resulting subtracted number.


## Multiplication (*)
<img width="514" alt="Screen Shot 2021-10-26 at 2 24 14 PM" src="https://user-images.githubusercontent.com/44590338/138947216-acc372f8-efcd-400e-aa3c-ff43cee9add2.png">

The calculator should be able to multiply two numbers together. Example: 4*3=12
1. First, the user enters a number of any length into the text field.
2. Then the user hits the multiplication button, which enters in the ‘*’ operator.
3. Another number is then entered.
4. Once the user hits the ‘=’ button, the text field will display the first number, the ‘+’
operator, the second number, the ‘=’ button, and the sum of the two numbers.
  
## Division (/)
<img width="522" alt="Screen Shot 2021-10-26 at 2 24 37 PM" src="https://user-images.githubusercontent.com/44590338/138947259-2bbce37c-51e0-4644-84c6-bb5e2e416b06.png">

The calculator should also be able to divide two numbers. Example: 9/3=3
 
1. The user enters the first number.
2. The ‘-’ operator is entered.
3. The second number is entered.
4. In order to calculate the quotient, the user hits the ‘=’ button. The display text field
will then display the first number, the ‘-’ operator, the second number, the ‘=’ number, and the resulting quotient.
 
## Square root
<img width="517" alt="Screen Shot 2021-10-26 at 2 24 59 PM" src="https://user-images.githubusercontent.com/44590338/138947318-d3da9c2e-0e3d-4d10-88a2-7a9f99c5c93b.png">

The calculator should be able to calculate the square root of a number. Example: 64sqrt=8
1. First, the user types in a number of any length.
2. Then the sqrt button is hit.
3. Once the user hits the ‘=’ button, the text field will be updated to display the first
number, the sqrt operator, the ‘=’ operator, and the resulting square root of the number.
  Backspace
The calculator should also be able to perform the backspace functionality. When the ‘<-” operator button is clicked, the last character or number in the text field is deleted.
 

UML Diagram
The Calculator class has an aggregation of the Logic class. The Calculator class takes the text inputted into the text field and parses through the text to separate the numbers and the operator. The Calculator class takes those values and passes them to the Logic class in order to calculate the math. There are different functions in the Logic class that represent the different calculator mathematical functions. The Logic class calls the respective function for the math needed and returns the new output text to the Calculator class, which then displays that output in the text field,
