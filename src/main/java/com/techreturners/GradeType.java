package com.techreturners;

public enum GradeType {
    A, B, C, D, E;

    public GradeType downgrade() {
       /* if (this.ordinal() == GradeType.values().length - 1) {
            return GradeType.values()[this.ordinal()];
        }
        return GradeType.values()[this.ordinal() + 1];*/
        return this.ordinal() == GradeType.values().length - 1
                ? GradeType.values()[this.ordinal()]
                : GradeType.values()[this.ordinal() + 1];
    }

    public GradeType upgrade() {
      /*  if (this.ordinal() == 0) {
            return GradeType.values()[this.ordinal()];
        }
        return GradeType.values()[this.ordinal() - 1];*/

        return this.ordinal() == 0
                ? GradeType.values()[this.ordinal()]
                : GradeType.values()[this.ordinal() - 1];
    }
}