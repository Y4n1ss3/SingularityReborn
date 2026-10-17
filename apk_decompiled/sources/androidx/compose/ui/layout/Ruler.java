package androidx.compose.ui.layout;

import defpackage.dq;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class Ruler {
    public static final int $stable = 0;
    private final my calculate;

    private Ruler(my myVar) {
        this.calculate = myVar;
    }

    public abstract float calculateCoordinate$ui(float f, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2);

    public final my getCalculate$ui() {
        return this.calculate;
    }

    public /* synthetic */ Ruler(my myVar, dq dqVar) {
        this(myVar);
    }
}
