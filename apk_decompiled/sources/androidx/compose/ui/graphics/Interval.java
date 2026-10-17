package androidx.compose.ui.graphics;

import defpackage.bv;
import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public class Interval<T> {
    public static final int $stable = 0;
    private final T data;
    private final float end;
    private final float start;

    public Interval(float f, float f2, T t) {
        this.start = f;
        this.end = f2;
        this.data = t;
    }

    public final boolean contains(float f) {
        return f <= this.end && this.start <= f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Interval interval = (Interval) obj;
            return this.start == interval.start && this.end == interval.end && q10.b(this.data, interval.data);
        }
        return false;
    }

    public final T getData() {
        return this.data;
    }

    public final float getEnd() {
        return this.end;
    }

    public final float getStart() {
        return this.start;
    }

    public int hashCode() {
        int a = bv.a(this.end, Float.hashCode(this.start) * 31, 31);
        T t = this.data;
        return a + (t != null ? t.hashCode() : 0);
    }

    public final boolean overlaps(Interval<T> interval) {
        return this.start <= interval.end && this.end >= interval.start;
    }

    public String toString() {
        return "Interval(start=" + this.start + ", end=" + this.end + ", data=" + this.data + ')';
    }

    public /* synthetic */ Interval(float f, float f2, Object obj, int i, dq dqVar) {
        this(f, f2, (i & 4) != 0 ? null : obj);
    }

    public final boolean overlaps(float f, float f2) {
        return this.start <= f2 && this.end >= f;
    }
}
