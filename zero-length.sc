[ -z "sor" ] && echo "üres sor" || echo "nem üres sor"
[ ! -z "sor" ] && echo "nem üres sor" || echo "üres sor"
[ -z "" ] && echo "üres sor" || echo "nem üres sor"
[ ! -z "" ] && echo "nem üres sor" || echo "üres sor"
[ -n "sor" ] && echo "nem üres sor" || echo "üres sor"
[ ! -n "sor" ] && echo "üres sor" || echo "nem üres sor"
[ -n "" ] && echo "non zero length" || echo "üres sor"
[ ! -n "" ] && echo "üres sor" || echo "nem üres sor"