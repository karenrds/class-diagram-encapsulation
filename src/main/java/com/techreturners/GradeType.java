package com.techreturners;

public enum GradeType {
    A, B, C, D, E;

    public GradeType downgrade() {
        return this.ordinal() < GradeType.values().length - 1
                ? GradeType.values()[this.ordinal() + 1]
                : GradeType.values()[this.ordinal()];
    }

    public GradeType upgrade() {
        return this.ordinal() < GradeType.values().length - 1
                ? GradeType.values()[this.ordinal() - 1]
                : GradeType.values()[this.ordinal()];
    }
}