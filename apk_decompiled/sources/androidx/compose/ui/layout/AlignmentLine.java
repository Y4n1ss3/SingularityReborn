package androidx.compose.ui.layout;

import defpackage.dq;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class AlignmentLine {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final int Unspecified = Integer.MIN_VALUE;
    private final my merger;

    private AlignmentLine(my myVar) {
        this.merger = myVar;
    }

    public final my getMerger$ui() {
        return this.merger;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ AlignmentLine(my myVar, dq dqVar) {
        this(myVar);
    }
}
