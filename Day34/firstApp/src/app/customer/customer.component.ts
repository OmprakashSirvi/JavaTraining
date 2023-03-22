import { Component } from '@angular/core';

import { Customer } from './customer.model';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css'],
})
export class CustomerComponent {
  CustomerModel: Customer = new Customer();
  Customers: Array<Customer> = new Array<Customer>();
  addCustomer() {
    this.Customers.push(this.CustomerModel);
    this.CustomerModel = new Customer();
  }
}
