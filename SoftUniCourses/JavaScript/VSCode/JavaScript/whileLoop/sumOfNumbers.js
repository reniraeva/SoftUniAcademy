function sum(input) {
    let index = 0;
    let target = Number(input[index]);
    index++;
    let sum = 0 ;
    while (target > sum) {
        let num = Number(input[index]);
        index++;
        sum = sum + num;
    }
    console.log(sum);
}
sum(["100","10",
"20","30","40"]);
