const util = require('util');

function getUser (id, callback) {
  return setTimeout(() => {
    if (id === 5) {
      callback(null, { nickname: 'Teddy' })
    } else {
      callback(new Error('User not found'))
    }
  }, 1000)
}
 
const getUserPromise = util.promisify(getUser);
      
getUserPromise(5).then((user) => {
  console.log(user);
  console.log(`User found! Their nickname is: ${user.nickname}`);
})
.catch((error) => {
  console.log('User not found', error);
});