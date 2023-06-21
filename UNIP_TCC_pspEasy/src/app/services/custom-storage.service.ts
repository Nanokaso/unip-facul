import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CustomStorageService {

  private storage: Storage;

  constructor() {
    this.storage = window.localStorage;
  }

  set(key: string, value: any): boolean {
    if (this.storage) {
      this.storage.setItem(key, JSON.stringify(value));
      return true;
    }
    return false;
  }

  get(key: string): any {
    if (this.storage) {
      try {
        let resul = this.storage.getItem(key);
        if (resul)
          return JSON.parse(resul);
        else
          return null;
      } catch (error) {
      }
    }
    return null;
  }

  clear(): boolean {
    if (this.storage) {
      this.storage.clear();
      return true;
    }
    return false;
  }

}
