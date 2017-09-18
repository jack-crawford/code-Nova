sum = 0.0
iterate = 0 
add = 1.0
goal = input("What number do you want? ")
while sum != goal and sum < goal : 
	sum = sum + 1/add
	add = add + 1 
	iterate = iterate + 1
	print iterate
	print sum	
print "Total is " + str(iterate)
