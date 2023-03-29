import {
  FormGroup,
  FormBuilder,
  FormControl,
  Validators,
} from '@angular/forms';

export class User {
  name: String = '';
  email: String = '';
  password: String = '';
  role: String = '';
  userFormGroup: FormGroup;

  constructor() {
    let _builder = new FormBuilder();
    this.userFormGroup = _builder.group({});

    this.userFormGroup.addControl(
      'UserNameControl',
      new FormControl('', Validators.required)
    );

    this.userFormGroup.addControl(
      'UserEmailControl',
      new FormControl(
        '',
        Validators.compose([Validators.required, Validators.email])
      )
    );

    this.userFormGroup.addControl(
      'UserPasswordControl',
      new FormControl(
        '',
        new FormControl(
          Validators.compose([
            Validators.required,
            Validators.pattern('[0-9a-zA-Z]{6-12}$'),
          ])
        )
      )
    );
  }

  hasError(typeofvalidator: string, controlname: string): boolean {
    return this.userFormGroup.controls[controlname].hasError(typeofvalidator);
  }
}
