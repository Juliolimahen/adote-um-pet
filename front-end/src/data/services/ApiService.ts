import axios from 'axios';
import { BASE_URL } from './Resquest';

export const ApiService = axios.create({
    baseURL: BASE_URL,
    headers: {
        'Content-Type': 'application/json'
    }
})

