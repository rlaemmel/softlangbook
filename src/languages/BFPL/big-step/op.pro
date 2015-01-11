opVal(add, intval(I1), intval(I2), intval(I0)) :- I0 is I1 + I2.
opVal(sub, intval(I1), intval(I2), intval(I0)) :- I0 is I1 - I2.
opVal(mult, intval(I1), intval(I2), intval(I0)) :- I0 is I1 * I2.
opVal(eq, intval(I1), intval(I2), boolval(true)) :- I1 == I2.
opVal(eq, intval(I1), intval(I2), boolval(false)) :- I1 \= I2.
