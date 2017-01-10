#!/usr/bin/python2
# -*- coding: utf-8 -*-

textoCifrado = "(p9p1r7yP" + chr(197) + "#pqt6" + chr(194) + chr(197) + "7pw_"

for i in range(0, 255):
    print "Tentativa %d:" % i
    textoLimpo1 = ""
    textoLimpo2 = ""
    for j in range(0, len(textoCifrado)):
        n1 = ord(textoCifrado[j]) - i
        if n1 < 0:
            n1 = n1 + 256
        elif n1 > 255:
            n1 = n1 - 256
        textoLimpo1 = textoLimpo1 + chr(n1)
        n2 = ord(textoCifrado[j]) + i
        if n2 < 0:
            n2 = n2 + 256
        elif n2 > 255:
            n2 = n2 - 256
        textoLimpo2 = textoLimpo2 + chr(n2)
    print "\tOpcao1 = \"%s\"".encode('ascii') % textoLimpo1
    print "\tOpcao2 = \"%s\"".encode('ascii') % textoLimpo2
