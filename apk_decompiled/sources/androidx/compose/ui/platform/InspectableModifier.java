package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import defpackage.er;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes2.dex */
public final class InspectableModifier extends InspectorValueInfo implements Modifier.Element {
    public static final int $stable = 0;
    private final End end;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class End implements Modifier.Element {
        public End() {
        }
    }

    public InspectableModifier(ky kyVar) {
        super(kyVar);
        this.end = new End();
    }

    public final End getEnd() {
        return this.end;
    }
}
