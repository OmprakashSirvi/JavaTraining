import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { User } from '../models/user.model';

@Injectable({
  providedIn: 'root',
})
export class Loginuser158300ComponentService {
  apiUrl: any = 'https://api.github.com/users';
  user: User = new User();

  constructor(private http: HttpClient, private modelService: NgbModal) {}

  public open(modal: any): void {
    this.modelService.open(modal);
  }

  getUser(login: any) {
    this.http
      .get(`${this.apiUrl}/${login}`)
      .subscribe((res) => this.onSuccessGet(res));

    return this.user;
  }

  onSuccessGet(res: any) {
    this.user.id = res.id;
    this.user.login = res.name;
    this.user.avatar_url = res.avatar_url;
  }
}
