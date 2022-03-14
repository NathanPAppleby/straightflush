import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from 'src/app/types/Product';

@Injectable({
    providedIn: 'root',
})
export class InventoryService {
    constructor(private httpClient: HttpClient) {}

    getItems(): Observable<Product[]> {
        return this.httpClient.get<Product[]>('/api/inventory');
    }

    searchItems(query: string): Observable<Product[]> {
        return this.httpClient.get<Product[]>(`/api/inventory?q=${query}`);
    }

    createProduct(product: Product): Observable<Product> {
        return this.httpClient.post<Product>('/api/inventory', product);
    }
}
