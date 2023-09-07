#!/bin/bash
#if test ! $1 -eq 5
if [ ! $1 -eq 5 ]
then
echo "$1 az nem öt"
else
echo "$1 az öt"
fi
