import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AnotacaoFaseComponent } from './anotacao-fase.component';

describe('AnotacaoFaseComponent', () => {
  let component: AnotacaoFaseComponent;
  let fixture: ComponentFixture<AnotacaoFaseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AnotacaoFaseComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AnotacaoFaseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
