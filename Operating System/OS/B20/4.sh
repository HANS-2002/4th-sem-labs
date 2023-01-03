# Q4 Write script input time and convert hour ,minutes and second.
#!/bin/bash

read -p "Enter time in seconds: " s

hour=$((s / 3600))
min=$(((s - hour * 3600) / 60))
sec=$((s - hour * 3600 - min * 60))

[[ $hour -lt 10 ]] && hour="0$hour" || hour=$hour
[[ $min -lt 10 ]] && min="0$min" || min=$min
[[ $sec -lt 10 ]] && sec="0$sec" || hour=$sec

printf "Time: $hour:$min:$sec \n"
