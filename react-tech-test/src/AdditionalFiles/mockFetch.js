import { products } from './mockData';

export const mockFetch = async (...args) => {
  if(!args[0].includes('page=')) {
    throw new Error('API requires query parameter of page, please see README for more information');
  }

  const page = args[0].split('page=')[1];

  const pages = new Map([
    ['0', products.slice(0, 10)],
    ['1', products.slice(10, 20)],
    ['2', products.slice(20, 30)],
    ['3', products.slice(30, 40)],
    ['4', products.slice(40, 50)],
    ['5', products.slice(50, products.length)],
  ]);

  return {
    ok: true,
    status: 200,
    json: () => Promise.resolve({
      products: pages.get(page),
      count: products.length,
    }),
  };
};
