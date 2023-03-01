/** @format */

import MongoCleint from 'mongodb';
const url =
   'mongodb://localhost:27017/?readPreference=primary&appname=MongoDB%20Compass&directConnection=true&ssl=false';
console.log(url);
const client = new MongoCleint(url);

client.connect(async function (err, database) {
   if (err) {
      throw err;
      console.log('There was some error');
   }
   console.log('database connected successfully');
});
