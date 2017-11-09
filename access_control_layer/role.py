import argparse

# in final product, will retrieve via SQL
def getRoles():
    return ["admin", "developer", "auditor"]

parser = argparse.ArgumentParser("add, remove, or list Roles")
parser.add_argument('command', metavar='command', nargs=1, help="'add', 'remove' or 'list")

# 2 options for role/user creation:
    # a script 
    # MySQL workbench