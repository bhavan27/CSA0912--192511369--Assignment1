# Task 2 – Choose the Data Representation

| Data | Java representation | Reason |
|---|---|---|
| Registration number | `String` | Alphanumeric identifier |
| Floor and slot | `int` | Whole-number indexes |
| Entry time | `LocalDateTime` | Date and time without manual string parsing |
| Duration | `int` minutes / `long` elapsed minutes | Whole-minute billing input |
| Fee | `double` in the demonstration | Supports fractional monetary calculations |
| Occupancy | `String[][]` | Jagged array supports different slot counts per floor |

A jagged array is suitable because each floor may have a different number of slots. `int` division truncates: `90 / 60` gives `1`, which undercharges if every started hour is billed. The implementation uses ceiling arithmetic `(minutes + 59) / 60`; for 90 minutes this returns 2 billable hours. Inputs can be read with `Scanner`; the complete-code demonstrations also use fixed test data for reproducible expected output.

## Alternative representation and complexity
A one-dimensional array needs a mapping from floor/slot to a flat index and additional capacity information when floor sizes differ. An `ArrayList<String[]>` can represent variable floor sizes but adds collection overhead. Direct jagged-array indexing is O(1); scanning for a free slot is O(total slots). All representations require O(total slots) storage.

**Evidence note:** Task 2 is a design/data-representation analysis task; the brief does not prescribe a separate standalone Java program. The selected representation is implemented in Task 3 and reused in Tasks 11–12.
