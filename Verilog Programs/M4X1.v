module m4X1(out ,a ,b ,c ,d,s0 ,s1);
  output out;
  input a, b, c, d, s0, s1;
  wire not_wire, not_wire2, T1, T2, T3, T4;
  
  
  not n1(not_wire, s0), n2(not_wire2, s1);
  
  and (T1, not_wire, not_wire2, a), (T2, s0, not_wire2, b), (T3, not_wire, s1, c), (T4, s0, s1, d);
  
  or(out, T1, T2, T3, T4);


endmodule //4X1M

