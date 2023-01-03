# Q6 write script find out area and perimeter of circle.
#!/bin/bash

read -p "Enter radius of circle: " r

pi=3.141
per=$( echo "2 * $pi * $r" | bc )
area=$( echo "$pi * $r * $r" | bc )

printf "Area = %.3f , Perimter = %.3f \n" $area $per
