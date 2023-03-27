import { Component } from '@angular/core';

import { Customer } from './customer.model';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css'],
})
export class CustomerComponent {
  CustomerModel: Customer = new Customer();
  Customers: Array<Customer> = new Array<Customer>();
  disable: boolean = false;

  constructor(public http: HttpClient) {}

  postToServer() {
    //   http://localhost:3000/Customers
    let customerDto: any = {};
    customerDto.code = this.CustomerModel.code;
    customerDto.name = this.CustomerModel.name;
    customerDto.amount = this.CustomerModel.amount;
    this.disable = true;
    this.http.post('http://localhost:3000/Customers', customerDto).subscribe(
      (res) => this.success(res),
      (res) => this.error(res)
    );
  }

  getFromServer() {
    this.disable = true;
    this.http
      .get('http://localhost:3000/Customers')
      .subscribe((res) => this.successGet(res));
  }

  error(res: any) {
    console.debug(res);
  }

  success(res: any) {
    this.getFromServer();
    this.disable = false;
    this.CustomerModel = new Customer();
  }

  successGet(res: any) {
    console.log(res);
    this.Customers = new Array();
    res.forEach((ele: any) => {
      this.Customers.push(ele);
    });

    this.disable = false;
    // this.CustomerModel = res;
  }

  selectCustomers(_selected: any) {
    this.CustomerModel = _selected;
  }

  addCustomer() {
    this.Customers.push(this.CustomerModel);
    this.CustomerModel = new Customer();
  }

  hasError(typeofvalidator: string, controlname: string): boolean {
    return this.CustomerModel.customerFormGroup.controls[controlname].hasError(
      typeofvalidator
    );
  }
}
