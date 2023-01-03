#! /bin/bash
echo "ENTER total numbers :"
read n
echo "enter numbers: "
i=0
while [ $i -lt $n ]
do
read a[$i]
i=`expr $i + 1`
done
echo "the numbers are "
for i in "${a[*]}"
do
echo $i
done
