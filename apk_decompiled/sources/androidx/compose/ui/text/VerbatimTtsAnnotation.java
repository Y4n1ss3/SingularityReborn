package androidx.compose.ui.text;

import defpackage.c21;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class VerbatimTtsAnnotation extends TtsAnnotation {
    public static final int $stable = 0;
    private final String verbatim;

    public VerbatimTtsAnnotation(String str) {
        super(null);
        this.verbatim = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VerbatimTtsAnnotation) && q10.b(this.verbatim, ((VerbatimTtsAnnotation) obj).verbatim);
    }

    public final String getVerbatim() {
        return this.verbatim;
    }

    public int hashCode() {
        return this.verbatim.hashCode();
    }

    public String toString() {
        return c21.a(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.verbatim, ')');
    }
}
