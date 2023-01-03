#!/bin/bash

read -p "Enter n: " n

sum=0

for ((i = 1; i <= n; i++)); do
    read -p "Enter number $i: " num
    sum=$(($sum + $num))
done

echo "Average = $(echo "scale=2;$sum / $n" | bc)"
