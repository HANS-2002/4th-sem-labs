# Q3 Write script swapping two integer without using third variable.
#!/bin/bash

read -p "Enter first integer: " firstNum
read -p "Enter second integer: " secondNum

printf "\nBefore Swapping....\nFirst Num = $firstNum , Second Num = $secondNum \n"

firstNum=$(($firstNum+$secondNum))
secondNum=$(($firstNum-$secondNum))
firstNum=$(($firstNum-$secondNum))

printf "\nAfter Swapping....\nFirst Num = $firstNum , Second Num = $secondNum \n"