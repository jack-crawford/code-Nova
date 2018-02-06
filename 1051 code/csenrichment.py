import math



#mx+b = y

def getptonline(pointx, pointy, m, b):
    dist = abs(m*pointx - pointy + b)/math.sqrt(m*m + 1)
    
    xpt = -1*((-pointx - m*pointy) - (m * b))/(m*m + 1)
    ypt = m*xpt + b
    
    print "distance is " , dist
    
    print "point on line is (",xpt,",",ypt,")"
    

getptonline(math.sqrt(2), 3/2, 1, 2)
#getptonline(-math.sqrt(6), -math.sqrt(13), 4, -3)
def circlething(pointx, pointy, radius):
    #find line between pointx,pointy and (0,0)
    distance = math.sqrt((pointx - 0)**2 + (pointy - 0)**2)
    slope = pointy/pointx
    circleptx = radius * math.cos(math.atan(pointy/pointx))
    circlepty = radius * math.sin(math.atan(pointy/pointx))
    print "circle point is ", circleptx, ",", circlepty
    print "distance from circle is " ,abs(distance - radius)

#circlething(math.sqrt(2)/2, math.sqrt(2)/2, 1)
circlething(math.sqrt(2), 3/2, 4)
circlething(-math.sqrt(6), -math.sqrt(13), 8)

