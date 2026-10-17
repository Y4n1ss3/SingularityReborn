package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import defpackage.dq;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class VNode {
    public static final int $stable = 8;
    private ky invalidateListener;

    public /* synthetic */ VNode(dq dqVar) {
        this();
    }

    public abstract void draw(DrawScope drawScope);

    public ky getInvalidateListener$ui() {
        return this.invalidateListener;
    }

    public final void invalidate() {
        ky invalidateListener$ui = getInvalidateListener$ui();
        if (invalidateListener$ui != null) {
            invalidateListener$ui.invoke(this);
        }
    }

    public void setInvalidateListener$ui(ky kyVar) {
        this.invalidateListener = kyVar;
    }

    private VNode() {
    }
}
