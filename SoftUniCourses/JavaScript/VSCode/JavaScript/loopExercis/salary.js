function fine(input) {

    let browser = Number(input[0]);
    let salary = Number(input[1]);
    let websiteCount = input.length;
    let facebookFine = 150;
    let instagramFine = 100;
    let redditFine = 50;

    for (let i = 2; i < websiteCount; i++) {
        let elementTab = input[i];

        switch (elementTab) {
            case "Facebook":
                salary = salary - facebookFine;
                break;
            case "Instagram":
                salary = salary - instagramFine;
                break;
            case "Reddit":
                salary = salary - redditFine;
                break;
        }
    }
    if (salary <= 0) {
        console.log("You have lost your salary.");
    } else {
        console.log(salary);
    }
}
fine(["10",
    "750",
    "Facebook",
    "Dev.bg",
    "Instagram",
    "Facebook",
    "Reddit",
    "Facebook",
    "Facebook"]);

