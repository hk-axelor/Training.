#1/bin/bash
echo "enter the file"
read file
if [[ $file =~ ['!@#$%^&*()_+'] ]]
then
	for file in *.
	do
		mv "$file"
		rename 's/[a-zA-Z0-9//'
	done
else
	echo "special charcter name files are not present"
fi
