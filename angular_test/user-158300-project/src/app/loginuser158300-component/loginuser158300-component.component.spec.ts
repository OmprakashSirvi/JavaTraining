import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Loginuser158300ComponentComponent } from './loginuser158300-component.component';

describe('Loginuser158300ComponentComponent', () => {
  let component: Loginuser158300ComponentComponent;
  let fixture: ComponentFixture<Loginuser158300ComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Loginuser158300ComponentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Loginuser158300ComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
