grammar Fsml;
@header {
package org.softlang;
}
fsm : statedecl* EOF ;
statedecl : 'initial'? 'state' stateid '{' transition* '}' ;
transition : event ('/' action)? ('->' stateid)? ';' ;
stateid : NAME ;
event : NAME ;
action : NAME ;
NAME : ('a'..'z'|'A'..'Z')+ ;
WS : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ { skip(); } ;
