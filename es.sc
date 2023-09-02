#!/bin/bash
#if test $1 -ge 0 -a $1 -le 10
if [ $1 -ge 0 ] && [ $1 -le 10 ]
then
echo "0 <= $1 <= 10"
else
echo "$1 nincs 0 és 10 között"
fi 
