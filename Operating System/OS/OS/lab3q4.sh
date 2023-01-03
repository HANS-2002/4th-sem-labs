#! /bin/bash
echo "largest no amoung three no."
echo "enter three name"
read a
read b
read c
if [ $a -gt $b ] && [ $a -gt $c ]
then 
echo "$a is the largest amoung all three"
elif [ $b -gt $a ] && [ $b -gt $c ]
then 
echo "$b is the largest amoung all three"
else
echo "$c is the largest amoung all three"
fi
