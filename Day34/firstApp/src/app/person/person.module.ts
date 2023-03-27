import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { PersonRoutingModule } from './person-routing.module';
import { PersonComponent } from './person.component';
import { PersonService } from './person.service';

@NgModule({
  declarations: [PersonComponent],
  imports: [HttpClientModule, PersonRoutingModule],
  providers: [PersonService],
  bootstrap: [PersonComponent],
})
export class PersonModule {}
