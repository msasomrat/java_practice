n = 3


def search(n):
    if n == 0:
        return 0
    print(n)
    search(n - 1)
    search(n - 1)
