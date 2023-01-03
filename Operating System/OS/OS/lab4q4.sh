#!/bin/bash
echo -n "Enter the Total numbers :"
read n
echo "Enter numbers :"
i=0

while [ $i -lt $n ]
do
    read a[$i]
    i=`expr $i + 1`
done

counter=0

for (( i=0;i<n;i++ ))
do
    temp=${a[$i]}
    c=`expr $i + 1`
    for (( j=c;j<n;j++ ))
    do
        if [ $temp -eq ${a[$j]} ]
        then
            counter=`expr $counter + 1`
        fi
    done
done

if [ $counter -gt 0 ]
then
    echo "Duplicates Found"
else
    echo "No duplicates"
fi
