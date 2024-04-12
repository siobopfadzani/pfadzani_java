function main():
    
    array = new Integer[10][50]

   
    for i = 0 to 9:
        for j = 0 to 49:
          
            array[i][j] = generateRandomNumber()


    for i = 0 to 9:
        for j = 0 to 49:
         
            print array[i][j]

  
    for i = 0 to 9:
        sort(array[i])

   
    for i = 0 to 9:
        for j = 0 to 49:
            
            print array[i][j]

main()

