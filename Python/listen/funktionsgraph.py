import matplotlib.pyplot as plt
import numpy as np

xCoords = []
yCoords = []

start = 0
end = 10
step = 1

for x in range(start,end,step):
    xCoords.append(x)
    yCoords.append(x**2 + 2 * x + 1)

xpoints = np.array(xCoords)
ypoints = np.array(yCoords)
plt.plot(xpoints, ypoints)
plt.show()