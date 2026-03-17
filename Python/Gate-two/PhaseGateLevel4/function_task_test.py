import unittest
import function_task


class Test_Function_Task(unittest.TestCase):

	def test_to_calculate_total(self):
		expected_result = 8
		actual_result = function_task.task1(4, 4)

		self.assertEqual(expected_result, actual_result)

	def test_to_calculate_sun(self):
		expected_result = 10
		actual_result = function_task.task1(5,5)

		self.assertEqual(expected_result, actual_result)
