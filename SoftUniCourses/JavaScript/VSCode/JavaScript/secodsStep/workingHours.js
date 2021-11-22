function workingHours(input) {

   let hours = Number(input[0]); 
   let days = input[1];

     if((hours>= 10) && (hours <= 18)){
      switch (days){
        case "Monday":
        case "Tuesday":
        case "Wednesday":
        case "Thursday":
        case "Friday":
        case "Saturday":
          console.log("open");
            break;
        default:
          console.log("closed");
            break;
       }
     }else if ((time< 10) || (time > 18)){
           console.log("closed"); 
  }

}
workingHours(["11",
"Monday"]);