package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorValueInfo;
import defpackage.ky;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
class ComposedModifier extends InspectorValueInfo implements Modifier.Element {
    private final ny factory;

    public ComposedModifier(ky kyVar, ny nyVar) {
        super(kyVar);
        this.factory = nyVar;
    }

    public final ny getFactory() {
        return this.factory;
    }
}
