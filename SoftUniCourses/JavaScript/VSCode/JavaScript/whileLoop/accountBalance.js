function account(input) {

    let balans = 0;
    let i = 0;

    let command = input[i];// chetem whod
    i++;
    while (command !== "NoMoreMoney") {
        let money = Number(command);

        if (money <= 0) {
            console.log("Invalid operation!");
            break;
        }
        balans = balans + money;
        console.log(`Increase: ${money.toFixed(2)}`);
        command = input[i];
        i++;
    }
    console.log(`Total: ${balans.toFixed(2)}`);
}
account(["5.51",
    "69.42", "100",
    "NoMoreMoney"]);
