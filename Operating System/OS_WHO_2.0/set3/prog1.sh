arr=()
buc=()
mx=0
mn=0
sum=0

echo -n "Enter numbers: "
read nums

for i in $nums; do
    arr+=($i)
done

for i in {1..10}; do
    buc+=(0)
done

mx=${arr[0]}
mn=${arr[1]}

for i in ${arr[@]}; do
    if ((mx < i)); then
        mx=$i
    fi
    if ((mn > i)); then
        mn=$i
    fi
    sum=$(($i + $sum))
    t=$(($i / 10))
    if ((t * 10 != i)); then
        buc[t]=$((${buc[t]} + 1))
    else
        buc[$(($t - 1))]=$((${buc[t]} + 1))
    fi
done

avg=$(echo "scale=2; $sum / ${#arr[@]}" | bc)
echo "Average = $avg"
echo "Smallest number = $mn"
echo "Largest number = $mx"

for i in {0..9}; do
    echo "Count of bucket $(($i * 10 + 1)) - $(($i * 10 + 10)) = ${buc[$i]}"
done