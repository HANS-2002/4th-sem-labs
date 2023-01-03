#! /bin/bash
echo "enter your marks"
read a
if [ $a -gt 89 ]
then 
echo "GRADE : 0"
elif [ $a -gt 79 ] && [ $a -lt 90 ]
then 
echo "GRADE : E"
elif [ $a -gt 69 ] && [ $a -lt 80 ]
then
echo "GRADE : A"
elif [ $a -gt 59 ] && [ $a -lt 70 ]
then
echo "GRADE : B"
elif [ $a -gt 49 ] && [ $a -lt 60 ]
then
echo "GRADE : C"
elif [ $a -gt 39 ] && [ $a -lt 50 ]
then
echo "GRADE : D"
elif [ $a -gt 0 ] && [ $a -lt 40 ]
then
echo "GRADE : F"
fi
