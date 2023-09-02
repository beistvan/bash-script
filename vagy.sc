#!/bin/bash
#if test $1 -lt 0 -o $1 -gt 10
if [ $1 -lt 0 ] || [ $1 -gt 10 ]
then
echo "$1 < 0 vagy $1 > 10"
else
echo "$1 0 és 10 között van"
fi 
