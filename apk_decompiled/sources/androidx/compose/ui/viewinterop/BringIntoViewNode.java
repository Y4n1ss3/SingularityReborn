package androidx.compose.ui.viewinterop;

import androidx.compose.ui.Modifier;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class BringIntoViewNode extends Modifier.Node {
    private ky onRequesterReady;
    private final ky requester = new BringIntoViewNode$requester$1(this);

    public BringIntoViewNode(ky kyVar) {
        this.onRequesterReady = kyVar;
    }

    public final ky getOnRequesterReady() {
        return this.onRequesterReady;
    }

    public final ky getRequester() {
        return this.requester;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.onRequesterReady.invoke(this.requester);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.onRequesterReady.invoke(null);
    }

    public final void setOnRequesterReady(ky kyVar) {
        this.onRequesterReady = kyVar;
    }

    public final void update(ky kyVar) {
        this.onRequesterReady = kyVar;
        if (isAttached()) {
            kyVar.invoke(this.requester);
        }
    }
}
