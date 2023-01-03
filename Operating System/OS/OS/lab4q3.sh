#!/bin/bash
array=(21 22 23 24 25 26 27)
f(){ array=("${BASH_ARGV[@]}");}
shopt -s extdebug
f "${array[@]}"
shopt -u extdebug
echo "${array[@]}"
