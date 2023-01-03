# Q7 write a program to find the length of string ,find a substring from string and compare two string.
#!/bin/bash
read -p "enter a string and subtring: " s str

printf "The length of the string is ${#s}.\n"

if [[ $s =~ $str ]] 
then
    printf "Substring is present.\n"
else
    printf "Substring is not present.\n"
fi

if [[ $s = $str ]] 
then
    printf "Strings are equal.\n"
else
    printf "Strings are not equal.\n"
fi
