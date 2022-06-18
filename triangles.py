def triangle(side1,side2,side3):#function to check if the sides form a triangle
    if side1==side2==side3:#if all sides are equal
        print("This is a equilateral triangle")
    elif side1==side2 and side1!= side3 or side1==side3 and side1!= side2 or side2==side3 and side2!= side1:
        print("the triangle is iscoclose")
    elif side1!=side2 and side2!= side3:#if all sides are different
        if side1*side1==side2*side2+side3*side3 or side2*side2==side1*side1+side3*side3 or side3*side3==side1*side1+side2*side2:#if the sides form a right angle
            print("This is a right triangle")
    else:#if all sides are different
        print("the triangle is invalid")

def main():
    side1=int(input("enter the length of side 1"))#inputting the sides of the triangle
    side2=int(input("enter the length of side 2"))
    side3=int(input("enter the length of side 3"))#inputting the sides of the triangle
    triangle(side1,side2,side3)
main()