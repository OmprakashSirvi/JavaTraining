import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { User } from '../models/user.model';

@Injectable({
  providedIn: 'root',
})
export class User158300ComponentService {
  apiUrl: any = 'https://api.github.com/users';
  user: User = new User();
  users: Array<User> = new Array();

  constructor(private http: HttpClient, private modelService: NgbModal) {}

  public open(modal: any): void {
    this.modelService.open(modal);
  }

  getAllUser() {
    this.http.get(this.apiUrl).subscribe((res) => this.onSuccessGet(res));

    return this.users;
  }

  onSuccessGet(res: any) {
    res.forEach((ele: any) => {
      this.user.id = ele.id;
      this.user.login = ele.login;
      this.user.avatar_url = ele.avatar_url;
      this.users.push(this.user);

      this.user = new User();
    });
  }
}
