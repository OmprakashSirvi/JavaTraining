/** @format */

import { BrowserRouter, Link, Route, Router, Routes } from 'react-router-dom';

import './App.css';

import { RegistrationForm } from './Registration/RegistrationForm';
import UserFormikForm from './UserFormikForm/UserFormikForm';

function App() {
   return (
      <div className="App">
         Home
         <RegistrationForm />
         <Link to="/formik">form</Link>
         <br />
         <br />
         <Routes>
            <Route path="/" element={<App />}></Route>
            <Route path="/formik" element={<UserFormikForm />}></Route>
         </Routes>
      </div>
   );
}

export default App;
