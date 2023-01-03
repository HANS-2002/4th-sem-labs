#! /bin/bash
echo "enter a number:"
read n
i=1
count=0
while [ $i -le $n ]
do
	if [ `expr $n % $i` -eq 0  ]
	then
		count=`expr $count + 1`
	fi
	i=`expr $i + 1`
done

if [ $count -eq 2 ]
then 
	echo "$n is a prime number"
else 
	echo "$n is not a prime number"
fi
