function cinema(input) {

    let progectsiya = input[0];
    let redove = Number(input[1]);
    let coloni = Number(input[2]);

     let totalPrice = 0;
     switch (progectsiya) {
        case "Premiere":
            totalPrice = redove * coloni * 12.00;
            break;
        case "Normal":
            totalPrice = redove * coloni * 7.50;
            break;
        case "Discount":
            totalPrice = redove * coloni * 5.00;
          break;
     }
     console.log(`${totalPrice.toFixed(2)} leva`);
   
}
cinema([]);