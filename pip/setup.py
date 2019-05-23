from setuptools import setup

with open("README.md" ,"r") as fh:
	long_description = fh.read()
setup(
	name = 'helloworld',
	version = '0.0.1',
	description= 'say hello//',
	py_modules = ['helloworld'],
	package_dir= {'':'src'},
	classifers = [
		"Programming Language :: Python :: 3",
		"Programming Language :: Python :: 3.6",
		"Programming Language :: Python :: 3.7",
		"License :: OSI Approved :: GNU General Public License v2 or later (GPLv2+)",
		"Operating System  :: OS Independent",
		],
	long_description=long_description, 
	long_description_content_type="text/markdown",
	url = "https:github.com/iharshit009/helloworld",
	author = "Harshit Jain",
	author_email = "harshitjain1309@gmail.com",
)