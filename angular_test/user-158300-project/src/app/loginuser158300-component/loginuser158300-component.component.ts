import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { User } from '../models/user.model';
import { Loginuser158300ComponentService } from './loginuser158300-component.service';

@Component({
  selector: 'app-loginuser158300-component',
  templateUrl: './loginuser158300-component.component.html',
  styleUrls: ['./loginuser158300-component.component.css'],
})
export class Loginuser158300ComponentComponent {
  ifUser: boolean = true;
  login: any;
  user: User = new User();
  hideTable: boolean;

  constructor(private service: Loginuser158300ComponentService) {
    this.hideTable = true;
  }

  getUser() {
    this.user = this.service.getUser(this.login);
    this.hideTable = false;
    console.log(this.user);
    if (this.user.id == 0) {
      this.ifUser = false;
      this.hideTable = true;
    }
  }
}
