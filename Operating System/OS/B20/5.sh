# Q 5 write script convert temperature Fahrenheit to Celsius.
#!/bin/bash

read -p "Enter temperature in Fahrenheit: " far

cel=$((5 * (far - 32) / 9))

printf "Temperature in Celcius: $cel \n"
