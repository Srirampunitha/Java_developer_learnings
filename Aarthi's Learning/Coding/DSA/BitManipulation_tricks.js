//USE of n&(n-1)
//point1: whenever we do and operation of n and (n-1),the rightmost set bit will become unset
//point2: All the bits left to rightmost set bit will remain the same(unchanged)
//point3: All the bits right to the rightmost set bit will become 0;

//point4: number xor with same number will become zero. eg: 5^5 = 0
//point5: number xor with 0 will be number itself. eg:5^0 = 5;