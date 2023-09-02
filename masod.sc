#!/bin/bash
echo "Az ax^2+bc+c=0 egyenlet megoldása"
A=$1; B=$2; C=$3
DR=`echo "scale=4; $B^2-4*$A*$C" | bc`
echo "Diszkrimináns: $DR"
if test $DR -eq 0
then
echo "A másodfokú egyenletnek egy valós (kettős) gyöke van:"
X12=`echo "scale=4; -$B/(2*$A)" | bc`
echo $X12
exit 0
fi
if test $DR -lt 0
then
echo "A másodfokú egyenletnek nincsenek valós gyökei"
exit 0
fi
echo "A másodfokú egyenlet gyökei:"
X1=`echo "scale=4; (-$B+sqrt($DR))/(2*$A)" | bc`
X2=`echo "scale=4; (-$B-sqrt($DR))/(2*$A)" | bc`
echo "X1=$X1"
echo "X2=$X2"
