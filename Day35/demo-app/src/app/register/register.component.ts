import { Component } from '@angular/core';

import { User } from '../models/User.model';
import { HttpClient } from '@angular/common/http';

import { appConfig } from '../../config/app.config';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css', '../login/login.component.css'],
})
export class RegisterComponent {
  UserModel: User = new User();
  apiUrl: string = appConfig.apiUrl;

  constructor(public http: HttpClient) {}

  registerUser() {
    let userDto: any = {};

    userDto.name = this.UserModel.name;
    userDto.email = this.UserModel.email;
    userDto.password = this.UserModel.password;
    userDto.role = this.UserModel.role;

    this.http
      .post(`${this.apiUrl}/user`, userDto)
      .subscribe((res) => this.registerSuccess(res));
  }

  registerSuccess(res: any) {
    console.log(res);
  }

  registerError(res: any) {
    console.log(res);
  }
}
