  function vacationBooksList(input) {
   
    let numberOflist = Number(input[0]);
    let listInOneHours = Number(input[1]);
    let days = Number(input[2]);
    
    let numberHours = (numberOflist / listInOneHours)/days ;
    
   console.log(numberHours);
    
}
vacationBooksList(["212","20","2"]);


