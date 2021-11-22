function repainting(input){

    let quantityNylon = Number(input[0]);
    let quantityPaint = Number(input[1]);
    let thinner = Number(input[2]);
    let hours = Number(input[3]);
    
    let priceNylon = 1.50;
    let pricePaint = 14.50;
    let priceThinner = 5.00;
    let bag = 0.40;

    let totalSumNylon = ((quantityNylon + 2) * priceNylon);//18
    let totalSumPaint = (((quantityPaint * 0.1)+quantityPaint) * pricePaint);//
    let totalSumPaintThinner = (thinner * priceThinner);
    let totalMaterials= (totalSumNylon + totalSumPaint + totalSumPaintThinner + bag);
     
    let total = totalMaterials + ((totalMaterials * 0.3) * hours);

    console.log(total);
}
repainting(["10","11","4","8"])
