# Q1 Write a script perform all arithmetic operation.(addition,substraction,multiplication and division)
#!/bin/bash

read -p "Enter first integer: " firstNum
read -p "Enter second integer: " secondNum
read -p "Enter operator: " operator

echo "The result is $(($firstNum $operator $secondNum))."
