import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProjetoCadastrarComponent } from './projeto-cadastrar.component';

describe('ProjetoCadastrarComponent', () => {
  let component: ProjetoCadastrarComponent;
  let fixture: ComponentFixture<ProjetoCadastrarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProjetoCadastrarComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProjetoCadastrarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
