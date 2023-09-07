#!/bin/bash
K=0
for i in `ls ./`
do
echo "$i"
K=`expr $K '+' 1`
done
echo "Itt $K fájl van."
