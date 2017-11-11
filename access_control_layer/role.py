import argparse

# in final product, this should be stored in SQL
import pickle
rolesFile = open("roles", "rb")
roles = pickle.load(rolesFile)

# unfinished; in final product, will retrieve via SQL
def getRoles():
	return roles
    return ["admin", "developer", "auditor"]

parser = argparse.ArgumentParser("add, remove, or list Roles")
parser.add_argument('command', metavar='command', help="'add', 'remove' or 'list'")

args = parger.parse_args()

if args.command == "--list":
	print getRoles()
elif args.command == "--remove":


# 2 options for role/user creation:
    # a script 
    # MySQL workbench
