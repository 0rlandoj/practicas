for (i in 1..100){

    if(i%3 == 0){
        println("$i fizz")
    }
    if(i%5 == 0){
        println("$i buzz")
    }
    if((i%3 == 0) && (i%5 == 0)){
        println("$i fizzbuzz")
    }
    else{
        println(i)
    }

}