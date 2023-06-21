import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProjetoFaseComponent } from './projeto-fase.component';

describe('ProjetoFaseComponent', () => {
  let component: ProjetoFaseComponent;
  let fixture: ComponentFixture<ProjetoFaseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProjetoFaseComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProjetoFaseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
