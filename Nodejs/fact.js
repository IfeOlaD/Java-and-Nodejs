function factos{
    var x = 6;
    if(x == 0){
	return 1;
    }
    else{
	return factos(x * (x - 1));
    }


    console.log(factos(6));
}
