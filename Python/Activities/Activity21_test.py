import pytest

# Additon test
def test_addition():
	
    # Initialize two numbers
	num1 = 1
	num2 = 5
    
	# Add them
	sum = num1 + num2

	# Assertion
	assert sum == 6

# Subtraction test
def test_subtraction():
  
	# Initialize two numbers
	num1 = 100
	num2 = 25
    
	# Subtract them
	diff = num1 - num2

	# Assertion
	assert diff == 75

# Multiplication test
def test_multiplication():
  
	# Initialize two numbers
	num1 = 30
	num2 = 20
    
	# Multiply them
	prod = num1 * num2

	# Assertion
	assert prod == 600

# Division test
def test_division():
  
	# Initialize two numbers
	num1 = 10
	num2 = 5
    
	# Divide them
	quot = num1 / num2

	# Assertion
	assert quot == 2