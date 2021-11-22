function cinema(input) {

  let day = input[0];

  switch (day) {
      case "Monday":
      case "Tuesday":
      case "Friday":
         console.log("12");
           break;
      case "Wednesday":
      case "Thersday":
         console.log("14");
        case "Saturday":
        case "Sunday":
          console.log("16");
           break;
   }
}
cinema(["Monday"]);