#!/bin/bash
for i in 2 4 6 8 10
do
echo "$i^3 = `expr $i '*' $i '*' $i`"
done
for i in `seq 1 5`
do
echo "$i"
done
