
def replace_negative_numbers(numbers):
    new_numbers = []

    for num in numbers:
        if num > 0:
            new_numbers.append(num)

        else:
            new_numbers.append(0)

    return new_numbers


def rearrange_array(numbers):
    new_numbers = []
    zero_count = 0

    for num in numbers:
        if num != 0:
            new_numbers.append(num)

        else:
            zero_count += 1
   
    for index in range(zero_count):
        new_numbers.append(0)

    return new_numbers


def even_array(numbers):
    even_numbers = []

    for num in numbers:
        if num % 2 == 0:
            even_numbers.append(num)

    return even_numbers


def odd_array(numbers):
    odd_numbers = []
    for num in numbers:

        if num % 2 == 1:
            odd_numbers.append(num)

    return odd_numbers
              
