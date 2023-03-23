import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'firstApp';
  rate = 230;
  quantity = 0;
  amount = 0;
  calcAmount() {
    this.amount = this.quantity * this.rate;
  }
  increament() {
    this.quantity += 1;
    this.calcAmount();
  }
  decreament() {
    this.quantity -= 1;
    this.calcAmount();
  }
}
