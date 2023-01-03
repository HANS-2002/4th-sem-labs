#1. Write a shell script to accept 10 numbers into an array. Sort the array using bubble sort. Print the elements of the array.

#!/bin/bash

arr=()

echo "Enter 10 numbers....."
# for ((i = 1; i <= 10; i++)); do
#     echo -n "Enter number $i : "
#     read k
#     arr+=($k)
# done

i=1
while [ $i -lt 11 ];do
    read k
    arr+=($k)
    i=$(($i+1))
done

echo "UnSorted Array -> ${arr[@]}"

for i in {0..9}; do
    for j in {0..9}; do
        if [ ${arr[$i]} -lt ${arr[$j]} ]; then
            t=${arr[$i]}
            arr[$i]=${arr[$j]}
            arr[$j]=$t
        fi
    done
done

echo "Sorted Array -> ${arr[@]}"

