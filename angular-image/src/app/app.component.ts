import { Component } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent {
  title = 'angular-image';
  imageId: any;
  urlId: any;
  album: any;
  albums: Array<any> = new Array<any>();
  showLoading: boolean = false;
  isValid: boolean = true;

  constructor(private modelService: NgbModal, private http: HttpClient) {
    this.urlId = 'https://jsonplaceholder.typicode.com/photos';
  }

  public open(modal: any): void {
    this.modelService.open(modal);
  }

  getFromServer() {
    this.isValid = true;
    this.albums = new Array<any>();
    this.showLoading = true;

    if (this.imageId === undefined) {
      this.http.get(this.urlId).subscribe((res) => this.onSuccessAll(res));
      return;
    }

    if (!(this.imageId instanceof Number)) {
      console.log('Not a valid input');
      this.showLoading = false;
      this.isValid = false;
      return;
    }

    this.http
      .get(`${this.urlId}/${this.imageId}`)
      .subscribe((res) => this.onSuccessOne(res));
  }

  onSuccessAll(res: any) {
    res.forEach((ele: any) => {
      this.albums.push(ele);
    });
    this.showLoading = false;
  }

  onSuccessOne(res: any) {
    this.albums.push(res);
    this.showLoading = false;
  }
}
