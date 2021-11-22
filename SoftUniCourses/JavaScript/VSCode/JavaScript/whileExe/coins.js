function coins(input) {
    let change = Number(input[0]);
    let coins = Math.floor(change * 100);
    let counterCoins = 0;//br na monetite


    while (coins > 0) {
        if (coins >= 200) {
            counterCoins++;
            coins = coins - 200;

        } else if (coins >= 100) {
            counterCoins++;
            coins = coins - 100;

        } else if (coins >= 50) {
            counterCoins++;
            coins = coins - 50;

        } else if (coins >= 20) {
            counterCoins++;
            coins = coins - 20;

        } else if (coins >= 10) {
            counterCoins++;
            coins = coins - 10;

        } else if (coins >= 5) {
            counterCoins++;
            coins = coins - 5;

        } else if (coins >= 2) {
            counterCoins++;
            coins = coins - 2;

        } else if (coins >= 1) {
            counterCoins++;
            coins = coins - 1;
        }
    }
    console.log(counterCoins);
}
coins(["1.23"]);