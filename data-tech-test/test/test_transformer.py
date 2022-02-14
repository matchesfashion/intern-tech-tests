import pandas as pd
import pytest
from pytest import mark
import numpy as np

from src.transformer import Transformer


@pytest.fixture
def order_data_instance():
    return pd.DataFrame({
        'orderId': ['M1', 'M2', 'M3', 'M4', 'M5', 'M6', 'M7', 'M8'],
        'amount': ['10', '2000', '30', '40', '5000', '60', '70', '80'],
        'customer': ['Harpal', 'Kelcey',  'Augustus', 'Callum', 'Yulia', 'Brandon', 'Sam', 'Umit'],
        'date': ['2022-01-01', '2022-01-02', '2022-01-04', '2022-01-04', '2022-01-05', '2022-01-06', '2022-01-07', '2022-01-08'],
    })


@pytest.fixture
def order_countries():
    return ['GBR', 'AUS', 'USA', 'GBR', 'RUS', 'GBR', 'KOR', 'NZ']


class TestTransformer:

    # Task 1
    def test__enrich_orders(self, order_data_instance):
        df = order_data_instance
        transformer = Transformer()

        enriched_orders = transformer.enrich_orders(df, 'testCol', 'testValue')

        assert np.all(enriched_orders['testCol'] == ['testValue', 'testValue', 'testValue', 'testValue', 'testValue', 'testValue', 'testValue', 'testValue'])

    # TODO: Task 2
    @mark.notimplemented
    def test__split_customers(self, order_data_instance, order_countries):
        df = order_data_instance
