#!/bin/bash
if [ $1 -gt $2 ]
then
echo "Nagyobb"
else
    	if [ $1 -lt $2 ]
	then
	echo "Kisebb"
	else
	echo "Egyenlő"
	fi
fi
