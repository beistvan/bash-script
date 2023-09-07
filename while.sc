#!/bin/bash
I=1
while test $I -le $1
do
echo "$I"
I=`expr $I '+' 1`
done
