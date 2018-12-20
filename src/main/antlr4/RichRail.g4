grammar RichRail;

// Rules
command         : newcommand | addcommand | getcommand | delcommand | remcommand;
newcommand      : newtraincommand | newwagoncommand;
newtraincommand : 'new' 'train' ID 'with' ID;
newwagoncommand : 'new' type ID ('numseats' NUMBER)?;
addcommand      : 'add' ID 'to' ID; // wagon to train
getcommand      : 'getnumseats' deletetype id=ID;
delcommand      : 'delete' deletetype ID;
remcommand      : 'remove' ID 'from' ID;
type            : ('locomotive') | ('firstclasswagon') | ('secondclasswagon') | ('cargowagon');
deletetype      : 'train' | 'wagon';
// Tokens
ID          : ('a'..'z')('a'..'z'|'0'..'9')*;
NUMBER      : ('0'..'9')+;
WHITESPACE  : [ \t\r\n\u000C] -> skip;

