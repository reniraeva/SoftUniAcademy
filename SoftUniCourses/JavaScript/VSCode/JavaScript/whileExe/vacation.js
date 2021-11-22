function vacation(input) {

    let i = 0;
    let needMoney = Number(input[i]);
    i++;
    let money = Number(input[i]);
    i++;

    let counterDay = 0;// изминали дни само харчи
    let days = 0;// total брой изминали дни

    while (money < needMoney) {
        days++;
        let action = input[i];
        i++;
        let moneySpend = Number(input[i]);// харчи част от парите 
        i++;

        if (action === "spend") {
            money = money - moneySpend;
            if (money < 0) {
                money = 0;
            }
            counterDay++;
        } else {
            money = money + moneySpend;
            counterDay = 0;
        }

        if (counterDay === 5) {
            console.log("You can't save the money.");
            console.log(days);
            break
        }

    }
    if (money >= needMoney) {
        console.log(`You saved the money for ${days} days.`);

    }

}
//vacation(["110","60","spend","10","spend","10","spend","10","spend","10","spend","10"])
//vacation(["250","150","spend","50","spend","50","save","100","save","100"])

//vacation(["2000", "1000", "spend", "1200", "save", "2000"]);