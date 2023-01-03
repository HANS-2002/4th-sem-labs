#!/bin/bash
# echo "Bash Version: ${BASH_VERSION}"

################################## Basic I/O Code Start ##################################

# echo -n "Enter first number: "
# read firstNum
# SUM=$firstNum
# echo "$(($SUM + $firstNum))"
# echo -n "Enter second number: "
# read secondNum
# SUM=$(($SUM+$secondNum))
# echo "SUM = $SUM"
# echo "$firstNum + $secondNum = `expr $firstNum + $secondNum`"
#echo "$1 + $2 = `expr $1 + $2`"

################################## Basic I/O Code End ##################################



################################## If Else Code Start ##################################

# a="abc"
# b="abc" 
# if [ $a = $b ] 
# then 
# 	echo "a is equal to b"
# elif [ $a != $b ] 
# then 
# 	echo "a is not equal to b"
# fi

################################## If Else Code End ##################################



################################## Switch Case Code Start ##################################

# VEHICLE="AUDI"
# case "$VEHICLE" in
#     "BMW") echo "Its a BMW!";;
#     "AUDI") echo "Its an AUDI";;
# esac

################################## Switch Case Code End ##################################



################################## Loops Code Start ##################################

# y=1
# until [ $y -gt 5 ]
# do
#     echo $y
#     y=$(($y + 1))
# done

# x=1
# while [ $x -le 5 ]
# do
#     echo "Hello $x"
#     x=$(($x + 1))
# done

# for i in {0..10..2} #init..final..step
# do
#     echo "Hello $i"
# done

# for i in {0..10} #init..final
# do
#     echo "Hello $i"
# done

# for ((i=1;i<=5;i++))
# do
#     echo "Hello $i"
# done

################################## Loops Code End ##################################



################################## Function Code Start ##################################

# function fac() {
#     local fac=1
#     local x=1
#     while [ $x -le $1 ]
#     do
#         fac=$(($fac * $x))
#         x=$(($x + 1))
#     done
#     echo "$fac"
# }
# res=$(fac 7)
# echo $res

# function myfunc()
# {
#     local  myresult='some value'
#     echo "$myresult"
# }
# result=$(myfunc)   # or result=`myfunc`
# echo $result

# loopPrint () {
#     x=1
#     while [ $x -le $1 ]
#     do
#         echo $x
#         x=$(($x + 1))
#     done
# }

# loopPrint 5

################################## Function Code End ##################################



################################## Array Code Start ##################################

# arr=()
# echo -n "Enter n: "
# read n
# i=1
# while [ $i -le $n ]
# do
#     echo -n "Enter element $i: "
#     read k
#     arr+=($k)
#     i=$(($i+1))
# done

# echo "Array -> ${arr[@]}"

# sum_array=0
# for idx in ${!arr[@]}
# do
#     sum_array=$(($sum_array + ${arr[$idx]}))
# done

# echo "Sum of array elements = $sum_array"

# mul_array=1
# for ((i=0;i<$n;i++))
# do
#     mul_array=$(($mul_array * ${arr[$i]}))
# done

# echo "Product of array elements = $mul_array"


# myArray=(1 2 3 4 5)
# sum=0
# for num in ${myArray[@]}
# do
#     sum=$(( $sum + $num))
# done

# echo "The sum is $sum."

################################## Array Code End ##################################
