people_num = int(input("How many people?: " ))
day_odds = 366
prob = day_odds - people_num

odds = 1-(prob/365)

print(odds)
