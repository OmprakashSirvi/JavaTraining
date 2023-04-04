import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { User158300ComponentComponent } from './user158300-component/user158300-component.component';
import { Loginuser158300ComponentComponent } from './loginuser158300-component/loginuser158300-component.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { Loginuser158300ComponentService } from './loginuser158300-component/loginuser158300-component.service';
import { User158300ComponentService } from './user158300-component/user158300-component.service';

@NgModule({
  declarations: [
    AppComponent,
    User158300ComponentComponent,
    Loginuser158300ComponentComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    NgbModule,
  ],
  providers: [
    Loginuser158300ComponentService,
    User158300ComponentService,
    NgbModule,
  ],
  bootstrap: [AppComponent],
})
export class AppModule {}
