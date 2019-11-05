grammar Json;

@header {
package com.optran.languageref.testlanguages.json;
}

start
:
	(
		jsonRecord
		(
			',' jsonRecord
		)?
	)? EOF
;

jsonRecord
:
	object
	| array
;

object
:
	'{'
	(
		entry
		(
			',' entry
		)*
	)? '}'
;

entry
:
	STRING ':' value
;

array
:
	'['
	(
		value
		(
			',' value
		)*
	)? ']'
;

value
:
	STRING # STR_VALUE
	| NUMBER # NUM_VALUE
	| 'true' # TRUE_VALUE
	| 'false' # FALSE_VALUE
	| object # OBJ_VALUE
	| array # ARRAY_VALUE
	| 'null' # NULL_VALUE
;

TRUE
:
	'true'
;

FALSE
:
	'false'
;

STRING
:
	'"' STRINGCHARACTER* '"'
;

fragment
STRINGCHARACTER
:
	~["\\]
	| ESCAPE_SEQ
;

fragment
ESCAPE_SEQ
:
	'\\'
	(
		'"'
		| 't'
		| 'n'
		| 'r'
		| 'f'
		| STR_UNICODE
	)
;

fragment
STR_UNICODE
:
	'u' [0-9] [0-9] [0-9] [0-9]
;

NUMBER
:
	(
		'-'
		| '+'
	)? [0-9]+
	(
		'.' [0-9]+
	)?
	(
		(
			'e'
			| 'E'
		)
		(
			'+'
			| '-'
		) [0-9]+
	)
;

O_CURL
:
	'{'
;

C_CURL
:
	'}'
;

O_SQUARE
:
	'['
;

C_SQUARE
:
	']'
;

WS
:
	[ \r\n\t]+ -> skip
;
