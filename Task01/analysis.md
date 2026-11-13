# Task 1 – Understand the Problem and Identify the Objects

## Inputs
- Vehicle registration number and category (two-wheeler, car or electric vehicle).
- Entry and exit events and parking duration.
- Floor/slot capacities and pass validity.

## Outputs
- Allocated floor and slot, unique parking ticket, entry time, parking fee, and updated occupancy.
- A clear full-facility or invalid-operation response when a request cannot be completed.

## Candidate classes and responsibilities
- `Vehicle`: common registration details and vehicle behaviour.
- `TwoWheeler`, `Car`, `ElectricCar`: category-specific rates/charging behaviour.
- `ParkingFacility`: stores floors/slots and allocates/releases spaces.
- `ParkingTicket`: ticket number, vehicle, slot and entry time.
- `ParkingPass`: represents a valid monthly/one-day parking entitlement.

## Business rules
1. A slot can contain at most one vehicle.
2. A vehicle registration cannot have two active tickets.
3. Ticket numbers must be unique and must not be reused.
4. Invalid floor/slot positions and negative durations are rejected.
5. A full facility cannot allocate another slot.
6. Valid eligible passes reduce the parking fee to zero.

## Assumptions
- Floors and slot capacities are supplied at facility creation.
- The first available slot is allocated in floor-major order.
- A started hour is charged as a complete hour in the demonstration programs.
- The assignment's example rates are used where the brief supplies them.

## Alternative representation and complexity
With vehicle objects, fields and behaviour stay together. A linear search by registration is O(n); adding an attribute is localized to the relevant class. With parallel arrays (`regNo[]`, `type[]`, `entryTime[]`), a linear search is also O(n), but every insertion, deletion and new attribute must keep multiple arrays aligned. Both representations use O(n) storage for n vehicles; objects improve cohesion and extensibility.

**Evidence note:** This is an analysis task; the brief does not prescribe a standalone Java program for Task 1. The executable integrated model is provided in Task 11.
