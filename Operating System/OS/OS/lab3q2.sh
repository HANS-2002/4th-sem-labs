a=88
b=78
echo a is $a
echo b is $b
c=`expr $a + $b`
s=`expr $a - $b`
r=`expr $a \* $b`
d=`expr $a / $b`

echo add : $c
echo sub : $s
echo mul: $r
echo div : $d
