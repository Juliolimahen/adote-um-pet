import axios from 'axios';

const BASE_URL = process.env.REACT_APP_BACKEND_URL;

export const ApiService = axios.create({
    baseURL:'https://adote-um-pet-production-131a.up.railway.app/api',
    headers: {
        'Content-Type': 'application/json'
    }
})

