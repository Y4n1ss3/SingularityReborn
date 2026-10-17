package androidx.compose.ui.viewinterop;

import android.view.ViewParent;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import defpackage.f30;
import defpackage.iy;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidViewHolder$runUpdate$1 extends f30 implements iy {
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$runUpdate$1(AndroidViewHolder androidViewHolder) {
        super(0);
        this.this$0 = androidViewHolder;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m7864invoke() {
        boolean z;
        OwnerSnapshotObserver snapshotObserver;
        ky kyVar;
        z = this.this$0.hasUpdateBlock;
        if (z && this.this$0.isAttachedToWindow()) {
            ViewParent parent = this.this$0.getView().getParent();
            AndroidViewHolder androidViewHolder = this.this$0;
            if (parent == androidViewHolder) {
                snapshotObserver = androidViewHolder.getSnapshotObserver();
                AndroidViewHolder androidViewHolder2 = this.this$0;
                kyVar = AndroidViewHolder.OnCommitAffectingUpdate;
                snapshotObserver.observer.observeReads(androidViewHolder2, kyVar, this.this$0.getUpdate());
            }
        }
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m7864invoke();
        return w01.a;
    }
}
