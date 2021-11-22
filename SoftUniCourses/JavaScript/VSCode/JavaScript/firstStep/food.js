function food(input){

    let chicken = 10.35;
    let fish = 12.40;
    let vegeranian = 8.15;

    let chickenMeal = Number(input[0]);
    let fishMeal = Number(input[1]);
    let vegetarianMeal = Number(input[2]);

        let chickenPrice = chickenMeal * chicken;
        let fishPrice = fishMeal * fish;
        let vegetarianPrice = vegetarianMeal * vegeranian;
        let allPrice = chickenPrice + fishPrice + vegetarianPrice;

        let discount = allPrice * 0.20;
        let delivery = 2.50;

        let price = discount + allPrice + delivery;

        console.log(price);

}
food(["9","2","6"]);