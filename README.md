#Drinking Fountain
####Here at Codecool we have cool Drinking Distributors. Students can use the Distributor to get different kinds of Drinks. To use the Distributor a Student needs to attach a Cup to the Distributor.
- Students can create 3 types of Drinks with the Drinking Distributor. Cold Fizzy Drink,
Cold Normal Drink, Hot Normal Drink.
- Each Drink contains 3dl of liquid.
- Cups have their volume, which should be specified at creation time
- Cups can contain 0 or more dls of liquid- the current level of water in the bottle can be
specified at creation time.
- If a Student wants to create a drink when there’s no Cup attached to the Distributor or if
the Cup isn’t big enough or too full to contain the specified drink then signal this to the
student.
####If this goes well, and it should, then we want an upgraded version - the Drinking Fountain:
- From now on, a Student can specify the size of the Drink they want: small (1dl), medium
(3dl) or large (5dl).
- Each Drink should encapsulate this information.
- When requesting certain Drinks the Fountain’s overall temperature changes by a few
degrees celsius depending on the type and size of Drink requested:
  - Cold Fizzy Drink: -1
  - Cold Normal Drink: -2
  - Hot Regular Water: +3
- The size modifies the temperature decrease or increase by the amount of dls associated
with the size: 3dl of Cold Fizzy Drink raises the temperature by 3 (3 * -1)
- As such from now on we should keep track of the Drinking Fountain’s operating
temperature.
- If the operating temperature rises above 90 degrees celsius don’t allow Students to drink
hot Drinks - the operating temperature
