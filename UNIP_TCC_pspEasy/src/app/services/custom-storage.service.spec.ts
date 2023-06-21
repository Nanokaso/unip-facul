import { TestBed } from '@angular/core/testing';

import { CustomStorageService } from './custom-storage.service';

describe('CustomStorageService', () => {
  let service: CustomStorageService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CustomStorageService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
