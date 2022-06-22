#!bin/bash
echo "please provide path to dir"
read dir
if [ -d $dir ]
then
	echo "list of files in the dir"
	ls -l $dir|egrep '^d'
else
	echo "enter proper dir name"
fi
