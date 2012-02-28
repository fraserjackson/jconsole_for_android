NB. solid    - solid objects
NB.
NB. return:  vertices;edges;faces
NB.
NB. vertices are centered at origin, with maximum vertex radius of 1:
NB.   cube
NB.   dodecahedron
NB.   icosahedron
NB.   octahedron
NB.   tetrahedron
NB.
NB. scale can be given as a left argument (default 1)

NB. =========================================================
cube=: 1&$: : (4 : 0)
v=. normalize _1 ^ #: i.8
n=. _2 [\ 0 1 0 2 0 4 1 3 1 5 2 3 2 6 3 7 4 5 4 6 5 7 6 7
e=. ,"2 n { v
n=. 4 6 7 5, 2 3 7 6, 0 2 6 4, 0 4 5 1, 0 1 3 2,: 1 5 7 3
f=. ,"2 n { v
x *each v;e;f
)

NB. =========================================================
NB. dodecahedron (12 faces)
dodecahedron=: 1&$: : (4 : 0)
x=. 2 o. 1r5p1
y=. % <: +: x
a=. |: 2 1 o./ o. (+:i.5)%5
b=. |: 2 1 o./ o. (>:+:i.5)%5
v=. normalize (a,.0),((+:a*x),.1),((+:b*x),.y),b,.>:y
n=. 0 1 0 4 0 5 1 2 1 6 2 3 2 7 3 4 3 8 4 9 5 10 5 14 6 10 6 11
n=. n, 7 11 7 12 8 12 8 13 9 13 9 14 10 15 11 16 12 17 13 18
n=. _2 [\ n,14 19 15 16 15 19 16 17 17 18 18 19
e=. ,"2 n { v
n=. 0 4 3 2 1, 0 1 6 10 5, 1 2 7 11 6, 2 3 8 12 7, 3 4 9 13 8
n=. n, 4 0 5 14 9, 5 10 15 19 14, 6 11 16 15 10, 7 12 17 16 11
n=. _5 [\ n, 8 13 18 17 12, 9 14 19 18 13, 15 16 17 18 19
f=. ,"2 n { v
x *each v;e;f
)

NB. =========================================================
NB. icosahedron (20 faces)
icosahedron=: 1&$: : (4 : 0)
's c'=. 1 2 o. 1r5p1
x=. %: -. % 4 * *: s
y=. %: (1++:c) % 2++:c
a=. |: (2 1 o./ o. (+:i.5)%5) % +:s
b=. - 3 |. a
v=. normalize 0,(a,.x),(b,.x+y),0 0,y++:x
n=. 0 1 0 2 0 3 0 4 0 5 1 2 1 5 1 6 1 10 2 3 2 6 2
n=. n, 7 3 4 3 7 3 8 4 5 4 8 4 9 5 9 5 10 6 7 6 10 6 11
n=. _2 [\ n, 7 8 7 11 8 9 8 11 9 10 9 11 10 11
e=. ,"2 n { v
n=. 0 2 1, 0 3 2, 0 4 3, 0 5 4, 0 1 5, 1 2 6, 2 3 7, 3 4 8
n=. n, 4 5 9, 5 1 10, 1 6 10, 2 7 6, 3 8 7, 4 9 8, 5 10 9
n=. _3[\n, 11 6 7, 11 7 8, 11 8 9, 11 9 10, 11 10 6
f=. ,"2 n { v
x *each v;e;f
)


NB. =========================================================
NB. octahedron (8 faces)
octahedron=: 1&$: : (4 : 0)
v=. normalize 0 0 1, 1 0 0, 0 1 0, _1 0 0, 0 _1 0 ,: 0 0 _1
n=. _2 [\ 0 1 0 2 0 3 0 4 1 2 1 4 1 5 2 3 2 5 3 4 3 5 4 5
e=. ,"2 n { v
n=. 0 1 2, 0 2 3, 0 3 4, 0 4 1, 5 2 1, 5 3 2, 5 4 3,: 5 1 4
f=. ,"2 n { v
x *each v;e;f
)

NB. =========================================================
NB. tetrahedron
tetrahedron=: 1&$: : (4 : 0)
r3=. -%%:3
r2=. %:2
r23=. %:2r3
v=. normalize (0,0,%:3), (0, (+:r23),r3), ((-r2),(-r23),r3),: r2,(-r23),r3
n=. _2 [\ 0 1 0 2 0 3 1 2 1 3 2 3
e=. ,"2 n { v
n=. 0 1 2, 0 2 3, 0 3 1,: 1 3 2
f=. ,"2 n { v
x *each v;e;f
)
