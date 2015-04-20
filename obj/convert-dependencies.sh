#!/bin/sh
# AUTO-GENERATED FILE, DO NOT EDIT!
if [ -f $1.org ]; then
  sed -e 's!^D:/homework/cygwin/lib!/usr/lib!ig;s! D:/homework/cygwin/lib! /usr/lib!ig;s!^D:/homework/cygwin/bin!/usr/bin!ig;s! D:/homework/cygwin/bin! /usr/bin!ig;s!^D:/homework/cygwin/!/!ig;s! D:/homework/cygwin/! /!ig;s!^D:!/cygdrive/d!ig;s! D:! /cygdrive/d!ig;s!^C:!/cygdrive/c!ig;s! C:! /cygdrive/c!ig;' $1.org > $1 && rm -f $1.org
fi
