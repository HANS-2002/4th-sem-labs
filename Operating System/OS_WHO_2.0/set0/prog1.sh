function checkPrime() {
    local n=$1
    local i=2
    for ((i = 2; i * i <= n; i++)); do
        if ((n % i == 0)); then
            echo 0
            return
        fi
    done
    echo 1
}

function checkArmstrong() {
    local n=$1
    local i=2
    local d1=$(($n % 10))
    n=$(($n / 10))
    local d2=$(($n % 10))
    n=$(($n / 10))
    local d3=$(($n % 10))
    n=$1
    local sum=$(($d1 * $d1 * $d1 + $d2 * $d2 * $d2 + $d3 * $d3 * $d3))
    if ((sum == n)); then
        echo 1
    else
        echo 0
    fi
}

echo -n "Enter 3 digit number: "
read num

if ((num < 100 || num > 999)); then
    echo "Number is not 3 digits long!"
    exit 1
fi

isPrime=$(checkPrime $num)
isArmStrong=$(checkArmstrong $num)

if ((isPrime == 1)); then
    echo "$num is a prime!"
else
    echo "$num is not a prime!"
fi

if ((isArmStrong == 1)); then
    echo "$num is an armstrong number!"
else
    echo "$num is not an armstrong number!"
fi
