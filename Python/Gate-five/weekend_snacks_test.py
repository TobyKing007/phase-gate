import unittest
from weekend_snacks import *

class TestWeekendSnacks(unittest.TestCase):

    def test_counting_even_numbers(self):
        self.assertEqual(counting_even_numbers([1, 2, 3, 4]), 2)

    def test_return_target_index(self):
        self.assertEqual(return_target_index([10, 20, 30], 20), 1)

    def test_square_numbers(self):
        self.assertEqual(square_numbers([1, 2, 3]), [1, 4, 9])

    def test_compare_length_and_value(self):
        self.assertTrue(compare_length_and_value([1, 2], [1, 2]))

    def test_convert_array(self):
        self.assertEqual(convert_array([[1, 2], [3, 4]]), [1, 2, 3, 4])



