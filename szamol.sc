#!/bin/bash
k=`expr $1 '%' $2`
echo "$1 % $2 = $k"
s=$(($1*$2))
echo "$1 * $2 = $s"
