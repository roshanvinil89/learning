package com.codeskittles.learning.groovy.basics

class A05_Strings {

    static void main(String[] args) {
        String name = "Bhagat"

        // Interpolation is the act of replacing a placeholder in the
        // string with its value upon evaluation of the string.
        // The placeholder expressions are surrounded by ${}.

        // In single quoted strings these placeholders are not evaluated.
        def singleQuotedString = '$name : I am a Single Quoted String'
        println singleQuotedString

        // Double Quoted Strings are interpolated.
        def doubleQuotedString = "$name : I am a Single Quoted String"
        println doubleQuotedString

        // Triple Single Quotes marks that the string can be multiple lined
        def multilineSingleQuotedString = '''$name 
multiline
single quoted
string'''
        println multilineSingleQuotedString

        // Triple Double Quotes marks that the string is interpolated multiple lined.
        def multilineDoubleQuotedString = """$name
multiline
double quoted string
"""
        println multilineDoubleQuotedString

    }
}
