package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import defpackage.dq;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class VerticalRuler extends Ruler {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    private VerticalRuler(my myVar) {
        super(myVar, null);
    }

    @Override // androidx.compose.ui.layout.Ruler
    public float calculateCoordinate$ui(float f, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        float mo6242getSizeYbymL2g = ((int) (layoutCoordinates.mo6242getSizeYbymL2g() & 4294967295L)) / 2.0f;
        return Float.intBitsToFloat((int) (layoutCoordinates2.mo6243localPositionOfR5De75A(layoutCoordinates, Offset.m4508constructorimpl((Float.floatToRawIntBits(mo6242getSizeYbymL2g) & 4294967295L) | (Float.floatToRawIntBits(f) << 32))) >> 32));
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final VerticalRuler derived(my myVar) {
            return new VerticalRuler(myVar, null);
        }

        public final VerticalRuler maxOf(VerticalRuler... verticalRulerArr) {
            return derived(new VerticalRuler$Companion$maxOf$1(verticalRulerArr));
        }

        public final VerticalRuler minOf(VerticalRuler... verticalRulerArr) {
            return derived(new VerticalRuler$Companion$minOf$1(verticalRulerArr));
        }

        private Companion() {
        }
    }

    public /* synthetic */ VerticalRuler(my myVar, dq dqVar) {
        this(myVar);
    }

    public VerticalRuler() {
        this(null);
    }
}
