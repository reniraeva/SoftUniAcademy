function graduation(input) {

    let studentName = input[0];
    let grade = 1;
    let sum = 0;
    let repetitions = 0;//i

    let isExcluded = false;
    while (grade <= 12) {

        let currentMark = Number(input[grade]);
        if (grade < 4.00) {
            repetitions++;

            if (repetitions == 2) {

                console.log(`${studentName} has been excluded at ${repetitions} grade`);

                isExcluded = true;
                break;
            }
            continue;
        }
        sum = sum + currentMark;
        grade++;
    }
    if (!isExcluded) {
        let averge = sum / 12;
        console.log(`${studentName} graduated. Average grade: ${sum}`);
    }
}
graduation(["Gosho",
    "5", "5.5", "6", "5.43",
    "5.5", "6", "5.55", "5",
    "6", "6", "5.43", "5"]);
