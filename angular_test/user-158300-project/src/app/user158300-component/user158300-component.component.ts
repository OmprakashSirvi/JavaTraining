import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User158300ComponentService } from './user158300-component.service';
import { User } from '../models/user.model';

@Component({
  selector: 'app-user158300-component',
  templateUrl: './user158300-component.component.html',
  styleUrls: ['./user158300-component.component.css'],
})
export class User158300ComponentComponent {
  users: Array<User> = new Array<any>();
  apiUrl: any = 'https://api.github.com/users';

  constructor(private service: User158300ComponentService) {
    this.users = service.getAllUser();
  }
}
