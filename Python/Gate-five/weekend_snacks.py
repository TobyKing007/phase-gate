def counting_even_numbers(numbers):
    even_count = 0

    for num in numbers:
        if num % 2 == 0:
            even_count += 1

    return even_count


def return_target_index(numbers, target):
    for index in range(len(numbers)):
        if numbers[index] == target:
            return index

    return -1


def square_numbers(numbers):
    square_array = []

    for num in numbers:
        square_array.append(num * num)

    return square_array


def compare_length_and_value(numbers_one, numbers_two):
    if len(numbers_one) != len(numbers_two):
        return False

    for i in range(len(numbers_one)):
        if numbers_one[i] != numbers_two[i]:
            return False

    return True


def convert_array(numbers):
    new_array = []

    for row in numbers:
        for num in row:
            new_array.append(num)

    return new_array
