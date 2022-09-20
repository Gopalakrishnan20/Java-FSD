import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormtemplateComponent } from './formtemplate.component';

describe('FormtemplateComponent', () => {
  let component: FormtemplateComponent;
  let fixture: ComponentFixture<FormtemplateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormtemplateComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FormtemplateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
