package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import defpackage.dq;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class HorizontalRuler extends Ruler {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    private HorizontalRuler(my myVar) {
        super(myVar, null);
    }

    @Override // androidx.compose.ui.layout.Ruler
    public float calculateCoordinate$ui(float f, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        return Float.intBitsToFloat((int) (layoutCoordinates2.mo6243localPositionOfR5De75A(layoutCoordinates, Offset.m4508constructorimpl((Float.floatToRawIntBits(((int) (layoutCoordinates.mo6242getSizeYbymL2g() >> 32)) / 2.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L))) & 4294967295L));
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final HorizontalRuler derived(my myVar) {
            return new HorizontalRuler(myVar, null);
        }

        public final HorizontalRuler maxOf(HorizontalRuler... horizontalRulerArr) {
            return new HorizontalRuler(new HorizontalRuler$Companion$maxOf$1(horizontalRulerArr), null);
        }

        public final HorizontalRuler minOf(HorizontalRuler... horizontalRulerArr) {
            return new HorizontalRuler(new HorizontalRuler$Companion$minOf$1(horizontalRulerArr), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ HorizontalRuler(my myVar, dq dqVar) {
        this(myVar);
    }

    public HorizontalRuler() {
        this(null);
    }
}
