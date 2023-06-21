import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProjetoEditarComponent } from './projeto-editar.component';

describe('ProjetoEditarComponent', () => {
  let component: ProjetoEditarComponent;
  let fixture: ComponentFixture<ProjetoEditarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProjetoEditarComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProjetoEditarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
