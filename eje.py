from math import sin 
x=[]
for i in range(1,1000):
	x.append(i)
print(x)
print('--------------------------__--------------___---')

y=[]
for i in range(len(x)):
	y.append(sin(x[i]))

print(y)