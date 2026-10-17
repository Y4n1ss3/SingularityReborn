package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import defpackage.bv;
import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Stroke extends DrawStyle {
    public static final float DefaultMiter = 4.0f;
    public static final float HairlineWidth = 0.0f;
    private final int cap;
    private final int join;
    private final float miter;
    private final PathEffect pathEffect;
    private final float width;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DefaultCap = StrokeCap.Companion.m5135getButtKaPHkGw();
    private static final int DefaultJoin = StrokeJoin.Companion.m5146getMiterLxFBmk8();

    public /* synthetic */ Stroke(float f, float f2, int i, int i2, PathEffect pathEffect, int i3, dq dqVar) {
        this((i3 & 1) != 0 ? 0.0f : f, (i3 & 2) != 0 ? 4.0f : f2, (i3 & 4) != 0 ? DefaultCap : i, (i3 & 8) != 0 ? DefaultJoin : i2, (i3 & 16) != 0 ? null : pathEffect, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stroke)) {
            return false;
        }
        Stroke stroke = (Stroke) obj;
        return this.width == stroke.width && this.miter == stroke.miter && StrokeCap.m5131equalsimpl0(this.cap, stroke.cap) && StrokeJoin.m5141equalsimpl0(this.join, stroke.join) && q10.b(this.pathEffect, stroke.pathEffect);
    }

    /* renamed from: getCap-KaPHkGw, reason: not valid java name */
    public final int m5404getCapKaPHkGw() {
        return this.cap;
    }

    /* renamed from: getJoin-LxFBmk8, reason: not valid java name */
    public final int m5405getJoinLxFBmk8() {
        return this.join;
    }

    public final float getMiter() {
        return this.miter;
    }

    public final PathEffect getPathEffect() {
        return this.pathEffect;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        int m5142hashCodeimpl = (StrokeJoin.m5142hashCodeimpl(this.join) + ((StrokeCap.m5132hashCodeimpl(this.cap) + bv.a(this.miter, Float.hashCode(this.width) * 31, 31)) * 31)) * 31;
        PathEffect pathEffect = this.pathEffect;
        return m5142hashCodeimpl + (pathEffect != null ? pathEffect.hashCode() : 0);
    }

    public String toString() {
        return "Stroke(width=" + this.width + ", miter=" + this.miter + ", cap=" + ((Object) StrokeCap.m5133toStringimpl(this.cap)) + ", join=" + ((Object) StrokeJoin.m5143toStringimpl(this.join)) + ", pathEffect=" + this.pathEffect + ')';
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getDefaultCap-KaPHkGw, reason: not valid java name */
        public final int m5406getDefaultCapKaPHkGw() {
            return Stroke.DefaultCap;
        }

        /* renamed from: getDefaultJoin-LxFBmk8, reason: not valid java name */
        public final int m5407getDefaultJoinLxFBmk8() {
            return Stroke.DefaultJoin;
        }

        private Companion() {
        }
    }

    private Stroke(float f, float f2, int i, int i2, PathEffect pathEffect) {
        super(null);
        this.width = f;
        this.miter = f2;
        this.cap = i;
        this.join = i2;
        this.pathEffect = pathEffect;
    }

    public /* synthetic */ Stroke(float f, float f2, int i, int i2, PathEffect pathEffect, dq dqVar) {
        this(f, f2, i, i2, pathEffect);
    }
}
