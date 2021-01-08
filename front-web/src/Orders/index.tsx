import { useEffect, useState } from 'react';
import { fetchProducts } from '../api';
import ProductList from './ProductsList';
import StepHeader from './StepsHeader';
import './styles.css';
import { Product } from './types';

function Orders() {
const [products, setProducts] = useState<Product[]>([]);
    console.log(products);
    useEffect(() => {
       // console.log('componente orders iniciado')
        fetchProducts()
        .then(response => setProducts(response.data))
        .catch(error => console.log(error))

    }, []);
    return (
        <div className="orders-container">
            <StepHeader />
            <ProductList products={products}/>
        </div>
    )
}

export default Orders;