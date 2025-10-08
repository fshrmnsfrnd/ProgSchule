class ClassName:

    def __init__(self, param) -> None:
        self._attributName = param

    def getMethod(self) -> str:
        return self._attributName + "Methode"

    def setMethod(self, param: str) -> None:
        self._attributName = param

    propertyName = property(getMethod,setMethod)

object = ClassName("value")
print(object.propertyName)
object.propertyName = "val"
print(object.propertyName)