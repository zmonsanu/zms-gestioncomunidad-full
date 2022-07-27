import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PropietarioDataComponent } from './propietario-data.component';

describe('PropietarioDataComponent', () => {
  let component: PropietarioDataComponent;
  let fixture: ComponentFixture<PropietarioDataComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PropietarioDataComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PropietarioDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
