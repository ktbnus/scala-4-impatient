for( i<-1 to 3; j<- 1 to 3) print(f"${10*i+j}%3d")


for ( i <-1 to 3; j <-1 to 3 if i!= j)  print(f"${10*i+j}%3d")

for ( i <- 1 to 3; from = 4 -i; j <- from to 3)  print(f"${10*i+j}%3d")


for ( i <- 1 to 10 ) yield i % 3

for ( c <- "hello"; i <- 0 to 1 ) yield ( c + i).toChar

for ( i <- 0 to 1; c <- "hello" ) yield  ( c + i ).toChar


for { i <- 1 to 3
    from = 4 - i
    j <- from to 3 } print(f"${10*i+j}%3d")

  