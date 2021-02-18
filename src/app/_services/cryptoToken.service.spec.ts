/* tslint:disable:no-unused-variable */

import { TestBed, async, inject } from '@angular/core/testing';
import { CryptoTokenService } from './cryptoToken.service';

describe('Service: CryptoToken', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [CryptoTokenService]
    });
  });

  it('should ...', inject([CryptoTokenService], (service: CryptoTokenService) => {
    expect(service).toBeTruthy();
  }));
});
