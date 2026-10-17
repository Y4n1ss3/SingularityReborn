package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import defpackage.dq;
import defpackage.k4;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class Shadow {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Shadow None = new Shadow(0, 0, 0.0f, 7, null);
    private final float blurRadius;
    private final long color;
    private final long offset;

    public /* synthetic */ Shadow(long j, long j2, float f, int i, dq dqVar) {
        this((i & 1) != 0 ? ColorKt.Color(4278190080L) : j, (i & 2) != 0 ? Offset.Companion.m4532getZeroF1C5BW0() : j2, (i & 4) != 0 ? 0.0f : f, null);
    }

    /* renamed from: copy-qcb84PM$default, reason: not valid java name */
    public static /* synthetic */ Shadow m5101copyqcb84PM$default(Shadow shadow, long j, long j2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = shadow.color;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = shadow.offset;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            f = shadow.blurRadius;
        }
        return shadow.m5104copyqcb84PM(j3, j4, f);
    }

    /* renamed from: copy-qcb84PM, reason: not valid java name */
    public final Shadow m5104copyqcb84PM(long j, long j2, float f) {
        return new Shadow(j, j2, f, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        return Color.m4762equalsimpl0(this.color, shadow.color) && Offset.m4513equalsimpl0(this.offset, shadow.offset) && this.blurRadius == shadow.blurRadius;
    }

    public final float getBlurRadius() {
        return this.blurRadius;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m5105getColor0d7_KjU() {
        return this.color;
    }

    /* renamed from: getOffset-F1C5BW0, reason: not valid java name */
    public final long m5106getOffsetF1C5BW0() {
        return this.offset;
    }

    public int hashCode() {
        return Float.hashCode(this.blurRadius) + ((Offset.m4518hashCodeimpl(this.offset) + (Color.m4768hashCodeimpl(this.color) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        kp0.i(this.color, sb, ", offset=");
        sb.append((Object) Offset.m4524toStringimpl(this.offset));
        sb.append(", blurRadius=");
        return k4.g(sb, this.blurRadius, ')');
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final Shadow getNone() {
            return Shadow.None;
        }

        private Companion() {
        }

        public static /* synthetic */ void getNone$annotations() {
        }
    }

    public static /* synthetic */ void getBlurRadius$annotations() {
    }

    /* renamed from: getColor-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m5102getColor0d7_KjU$annotations() {
    }

    /* renamed from: getOffset-F1C5BW0$annotations, reason: not valid java name */
    public static /* synthetic */ void m5103getOffsetF1C5BW0$annotations() {
    }

    private Shadow(long j, long j2, float f) {
        this.color = j;
        this.offset = j2;
        this.blurRadius = f;
    }

    public /* synthetic */ Shadow(long j, long j2, float f, dq dqVar) {
        this(j, j2, f);
    }
}
