#!/bin/bash
#if test $1 -lt 0 -o $1 -gt 10
if [ ! $1 -eq 5 ]
then
echo "$1 az nem 5"
else
echo "$1 az 5"
fi
