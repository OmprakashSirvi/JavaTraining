/** @format */
import React, { Component } from 'react';

export class RegistrationForm extends Component {
   constructor(props) {
      super(props);
      this.state = { uname: 'Hello', lang: 'React' };
   }

   render() {
      return (
         <div>
            <h1>Registration Form</h1>
         </div>
      );
   }
}

// function RegisterationForm() {
//    const changeName = () => {
//       console.log('Change function called');
//    };

//    const getData = () => {};

//    return (
//       <div>
//          <h1>Registration Form</h1>
//          <form>
//             <input type="text" name="name" onChange={changeName} /> <br />
//             <input type="submit" value="Register" onClick={getData} />
//          </form>
//       </div>
//    );
// }

// export default RegisterationForm;
