import { ComponentFixture, TestBed } from '@angular/core/testing';

import { User158300ComponentComponent } from './user158300-component.component';

describe('User158300ComponentComponent', () => {
  let component: User158300ComponentComponent;
  let fixture: ComponentFixture<User158300ComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [User158300ComponentComponent],
    }).compileComponents();

    fixture = TestBed.createComponent(User158300ComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
