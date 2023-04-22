n, k = map(int, input().split())
coins = list(reversed([int(input()) for _ in range(n)]))

count = 0
for i in range(n):
    count += k // coins[i]
    k %= coins[i]

print(count)