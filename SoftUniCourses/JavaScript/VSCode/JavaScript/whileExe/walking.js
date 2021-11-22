function walking(input) {

    let target = 10000;
    let sum = 0;
    let i = 0;
    let command = input[i];
    let differenceSteps =0;
    
    while (command!== "Going home") {
        let steps = Number(command);
        sum = sum + steps;

        if (sum >= target) {
            console.log("Goal reached! Good job!");
             differenceSteps = sum - target;
            console.log(`${differenceSteps} steps over the goal!`);
        }
        i++;
        command = input[i];
    }
    if (command === "Going home") {
        let stepsToHome = Number(input[i + 1]);
        sum = sum + stepsToHome;

        if (sum >= target) {
            console.log("Goal reached! Good job!");
             differenceSteps = sum - target;
            console.log(`${differenceSteps} steps over the goal!`);
        } else {
            differenceSteps = target - sum;
            console.log(`${differenceSteps} more steps to reach goal.`);
        }
    }
}
walking(["1500","3000","250","1548","2000","Going home","2000"]);

