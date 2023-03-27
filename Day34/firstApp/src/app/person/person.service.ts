import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class PersonService {
  users: any;
  private apiUrl: string = 'http://localhost:8080/api/v1/person';

  constructor(public http: HttpClient) {}

  public getPersons() {
    this.users = this.http
      .get(this.apiUrl)
      .subscribe((data) => (this.users = data));
    console.log(this.users);
    return this.users;
  }
}
