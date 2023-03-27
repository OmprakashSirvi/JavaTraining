import { Component } from '@angular/core';
import { PersonService } from './person.service';

@Component({
  selector: 'app-person',
  templateUrl: './person.component.html',
  styleUrls: ['./person.component.css'],
})
export class PersonComponent {
  users: any;
  constructor(private ps: PersonService) {
    this.users = ps.getPersons();
  }
}
