echo "enter a number"
read val
x=`expr $val % 2`
if [ $x -eq 0 ]
then
echo "NUMBER is even"
else "number is odd"
fi
