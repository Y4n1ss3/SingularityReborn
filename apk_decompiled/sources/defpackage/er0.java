package defpackage;

import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifierKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import androidx.compose.ui.node.TraversableNode;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class er0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ ky e;
    public final /* synthetic */ ky f;

    public /* synthetic */ er0(int i, ky kyVar, ky kyVar2) {
        this.d = i;
        this.e = kyVar;
        this.f = kyVar2;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 mergedReadObserver$lambda$0;
        w01 mergedWriteObserver$lambda$0;
        w01 mergeObservers$lambda$1;
        boolean traverseTextContextMenuDataNodes$lambda$0;
        int i = this.d;
        ky kyVar = this.f;
        ky kyVar2 = this.e;
        switch (i) {
            case 0:
                mergedReadObserver$lambda$0 = SnapshotKt.mergedReadObserver$lambda$0(kyVar2, kyVar, obj);
                return mergedReadObserver$lambda$0;
            case 1:
                mergedWriteObserver$lambda$0 = SnapshotKt.mergedWriteObserver$lambda$0(kyVar2, kyVar, obj);
                return mergedWriteObserver$lambda$0;
            case 2:
                mergeObservers$lambda$1 = SnapshotObserverKt.mergeObservers$lambda$1(kyVar2, kyVar, obj);
                return mergeObservers$lambda$1;
            default:
                traverseTextContextMenuDataNodes$lambda$0 = TextContextMenuModifierKt.traverseTextContextMenuDataNodes$lambda$0(kyVar2, kyVar, (TraversableNode) obj);
                return Boolean.valueOf(traverseTextContextMenuDataNodes$lambda$0);
        }
    }
}
