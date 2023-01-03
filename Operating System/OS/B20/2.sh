# Q2 Write script swapping two integer with third variable.
#!/bin/bash

read -p "Enter first integer: " firstNum
read -p "Enter second integer: " secondNum

printf "\nBefore Swapping....\nFirst Num = $firstNum , Second Num = $secondNum \n"

t=$firstNum
firstNum=$secondNum
secondNum=$t

printf "\nAfter Swapping....\nFirst Num = $firstNum , Second Num = $secondNum \n"
