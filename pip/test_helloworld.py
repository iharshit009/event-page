from helloworld import say_hello

def test_helloworld_no_params():
	assert say_hello() == "Hello, Wrld"

def test_helloworld_with_param():
	assert say_hello("Everyone") == "hello, Everyone"