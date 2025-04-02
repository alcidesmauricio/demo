import { Component } from '@angular/core';

@Component({
    selector: 'app-root',
    template: `<h1>Hello World</h1>`
})
export class AppComponent {
    // Senha hardcoded
    password: string = "my_secret_password";

    // Chave de API hardcoded
    apiKey: string = "AIzaSyD4v3ryS3cr3tK3y123456789012345"; 

    apiSecret: string = "sk_test_4eC39HqLyjWDarjtT1zdp7dc";
} 