### Tracked Boxes

You are starting a shipping company and are creating a class, `TrackedBox`. Each `TrackedBox` has a
`boxId` and a `trackingId` . Create the following in the `TrackedBox` class:

- A getter called `getBoxId()` that returns the `boxId`
- A getter called `getTrackingId()` that returns the `trackingId`
- A private method called `createTrackingId()` that returns a `trackingId` by concatenating
  the `boxId` with a random id.
  - The `UUID` class has a method, `randomUUID()` that can be used to generate a random id.
- A constructor that accepts a single argument, `boxId`, and initializes
  both `boxId` and `trackingId`.


HINT:
[The UUID instance returned by randomUUID doesn't match the desired type for trackingId!](hints/hint-01.md)

When the `TrackedBoxTest` tests are passing, you have completed the try.
