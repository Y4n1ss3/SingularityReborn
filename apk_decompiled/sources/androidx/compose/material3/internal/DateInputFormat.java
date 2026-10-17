package androidx.compose.material3.internal;

import defpackage.ks0;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DateInputFormat {
    public static final int $stable = 0;
    private final char delimiter;
    private final String patternWithDelimiters;
    private final String patternWithoutDelimiters;

    public DateInputFormat(String str, char c) {
        this.patternWithDelimiters = str;
        this.delimiter = c;
        this.patternWithoutDelimiters = ks0.b0(str, String.valueOf(c), "");
    }

    public static /* synthetic */ DateInputFormat copy$default(DateInputFormat dateInputFormat, String str, char c, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dateInputFormat.patternWithDelimiters;
        }
        if ((i & 2) != 0) {
            c = dateInputFormat.delimiter;
        }
        return dateInputFormat.copy(str, c);
    }

    public final String component1() {
        return this.patternWithDelimiters;
    }

    public final char component2() {
        return this.delimiter;
    }

    public final DateInputFormat copy(String str, char c) {
        return new DateInputFormat(str, c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateInputFormat)) {
            return false;
        }
        DateInputFormat dateInputFormat = (DateInputFormat) obj;
        return q10.b(this.patternWithDelimiters, dateInputFormat.patternWithDelimiters) && this.delimiter == dateInputFormat.delimiter;
    }

    public final char getDelimiter() {
        return this.delimiter;
    }

    public final String getPatternWithDelimiters() {
        return this.patternWithDelimiters;
    }

    public final String getPatternWithoutDelimiters() {
        return this.patternWithoutDelimiters;
    }

    public int hashCode() {
        return Character.hashCode(this.delimiter) + (this.patternWithDelimiters.hashCode() * 31);
    }

    public String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.patternWithDelimiters + ", delimiter=" + this.delimiter + ')';
    }
}
