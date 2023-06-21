import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProjetoHomeComponent } from './projeto-home.component';

describe('ProjetoHomeComponent', () => {
  let component: ProjetoHomeComponent;
  let fixture: ComponentFixture<ProjetoHomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProjetoHomeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProjetoHomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
