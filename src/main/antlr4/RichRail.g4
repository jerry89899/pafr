
grammar RichRail;

command 	: newcommand | addcommand | getcommand | delcommand | remcommand;

newcommand	: 'new' TYPE ID ('numseats' NUMBER)?;
addcommand 	: 'add' ID 'to' ID;
getcommand 	: 'getnumseats' TYPE ID;
delcommand 	: 'delete' TYPE ID;
remcommand	: 'remove' ID 'from' ID;

TYPE		: ('train') | ('wagon') | ('firstclasswagon');

ID		: ('a'..'z')('a'..'z'|'0'..'9')*;
NUMBER		: ('0'..'9')+;
Ignore :  (' ' | '\t' | '\n' | '\r')+ {skip();};