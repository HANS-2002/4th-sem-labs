#!/bin/bash

echo -n "Enter first integer: "
read firstNum
echo -n "Enter second integer: "
read secondNum
echo -n "Enter operator: "
read operator

echo "The result is $(($firstNum $operator $secondNum))."