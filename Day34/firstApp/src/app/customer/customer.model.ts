import {
  FormGroup,
  FormBuilder,
  FormControl,
  Validators,
} from '@angular/forms';

export class Customer {
  code: String;
  name: String;
  amount: number;
  customerFormGroup: FormGroup;

  constructor() {
    this.code = '';
    this.name = '';
    this.amount = 0;
    let _builer = new FormBuilder();
    this.customerFormGroup = _builer.group({});

    this.customerFormGroup.addControl(
      'CustomerNameControl',
      new FormControl('', Validators.required)
    );

    const validators = [];
    validators.push(Validators.required);
    validators.push(Validators.pattern('^[0-9]{4,4}$'));

    this.customerFormGroup.addControl(
      'CustomerCodeControl',
      new FormControl('', Validators.compose(validators))
    );
  }
  //   constructor(code: String, name: String, amount: number) {
  //     this.code = code;
  //     this.name = name;
  //     this.amount = amount;
  //   }
}
