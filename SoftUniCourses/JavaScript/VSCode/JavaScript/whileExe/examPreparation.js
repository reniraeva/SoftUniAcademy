function exam(input) {
    let i = 0;
    let failedGrade = Number(input[i]);
    i++;

    let command = input[i];
    i++;

    let badGrades = 0;//бр.нa nezodovolitelni otsenki
    let sumScore = 0;
    let problemCount = 0;//бр.нa всички задачи
    let lastTask = " ";//името на последната задача

    while (command !== "Enough") {
        let task = command;
        let grade = Number(input[i]);
        i++;

        sumScore = sumScore + grade;
        problemCount++;
        lastTask = task;

        if (grade <= 4) {
            badGrades++;
        }

        if (badGrades === failedGrade) {
          console.log(`You need a break, ${badGrades} poor grades.`);
           break;
        }
         command = input[i];
         i++;
      }
      if (command === "Enough") {
        let averageScore = sumScore / problemCount;
        console.log(`Average score: ${averageScore.toFixed(2)}`);
        console.log(`Number of problems: ${problemCount}`);
        console.log(`Last problem: ${lastTask}`);
    }
}
exam(["3", "Money", "6", "Story", "4", "Spring Time", "5", "Bus", "6", "Enough"]);
