const inventory = 
{
  sunglasses: 1900,
  pants: 1088,
  bags: 1344
};
  
let myExecutor = (resolve,reject) => 
{
  if(inventory.sunglasses > 0)
  {
    resolve('Sunglasses order processed.');
  }else
  {
    reject('That item is sold out.')
  }
}

let orderSunglasses = () => 
{
  return new Promise(myExecutor);
}

let orderPromise = orderSunglasses();
console.log(orderPromise);


//__________
const prom = new Promise((resolve, reject) => 
{
  resolve('Yay!');
});
 
const handleSuccess = (resolvedValue) => {

  console.log(resolvedValue);
};
 
prom.then(handleSuccess); // Prints: 'Yay!'

//___________

let prom_2 = new Promise((resolve, reject) => {
  let num = Math.random();
  if (num < .5 ){
    resolve('Yay!');
  } else {
    reject('Ohhh noooo!');
  }
});
 
const handleSuccess_2 = (resolvedValue) => {
  console.log(resolvedValue);
};
 
const handleFailure = (rejectionReason) => {
  console.log(rejectionReason);
};
 
prom_2.then(handleSuccess_2, handleFailure);
