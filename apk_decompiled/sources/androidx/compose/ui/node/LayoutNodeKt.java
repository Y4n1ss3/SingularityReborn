package androidx.compose.ui.node;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import defpackage.iy;
import defpackage.k4;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LayoutNodeKt {
    private static final boolean DebugChanges = false;
    private static final Density DefaultDensity = DensityKt.Density$default(1.0f, 0.0f, 2, null);

    public static final void add(LayoutNode layoutNode, LayoutNode layoutNode2) {
        layoutNode.insertAt$ui(layoutNode.getChildren$ui().size(), layoutNode2);
    }

    public static final Owner requireOwner(LayoutNode layoutNode) {
        Owner owner$ui = layoutNode.getOwner$ui();
        if (owner$ui != null) {
            return owner$ui;
        }
        throw k4.a("LayoutNode should be attached to an owner");
    }

    public static final <T> T withComposeStackTrace(LayoutNode layoutNode, iy iyVar) {
        try {
            return (T) iyVar.invoke();
        } catch (Throwable th) {
            layoutNode.rethrowWithComposeStackTrace(th);
            o.j();
            return null;
        }
    }
}
