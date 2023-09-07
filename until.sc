#!/bin/bash
i=$1
until test $i -lt 1
do
echo -n "$i "
i=`expr $i '-' 1`
done
echo
