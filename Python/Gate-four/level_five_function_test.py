import unittest
from level_five_function import *

class TestLevelFiveFunction(unittest.TestCase):

    def test_negative_numbers_replacement(self):
        input_list = [5, -9, 3, -6, 2, -11]
        expected = [5, 0, 3, 0, 2, 0]
        actual = replace_negative_numbers(input_list)
        self.assertEqual(expected, actual)

    def test_rearrange_array(self):
        input_list = [5, 0, 3, 0, 2, 0]
        expected = [5, 3, 2, 0, 0, 0]
        actual = rearrange_array(input_list)
        self.assertEqual(expected, actual)

    def test_find_even_numbers(self):
        input_list = [45, 60, 3, 10, 9, 22]
        expected = [60, 10, 22]
        actual = even_array(input_list)
        self.assertEqual(expected, actual)

    def test_find_odd_numbers(self):
        input_list = [45, 60, 3, 10, 9, 22]
        expected = [45, 3, 9]
        actual = odd_array(input_list)
        self.assertEqual(expected, actual)
