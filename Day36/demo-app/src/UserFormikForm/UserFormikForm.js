/** @format */

import React from 'react';
import { useFormik } from 'formik';
import { Button, FormControl, FormLabel, TextField } from '@mui/material';

function UserFormikForm() {
   const forms = useFormik({
      initialValues: { name: '' },

      onSubmit: (values) => {
         console.log(values);
      },
   });

   return (
      <div>
         <FormControl>
            <FormLabel>Name</FormLabel>
            <TextField
               variant="standard"
               type="text"
               name="name"
               value={forms.values.name}
               onChange={forms.handleChange}
            />
            <Button type="submit" onClick={forms.onSubmit}>
               submit
            </Button>
         </FormControl>
      </div>
   );
}

export default UserFormikForm;
