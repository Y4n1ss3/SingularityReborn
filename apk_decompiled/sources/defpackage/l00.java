package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class l00 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l00(int i, Collection collection) {
        this.d = 3;
        this.e = i;
        this.f = collection;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 commitText$lambda$0;
        w01 prefetchState$lambda$0;
        w01 prefetchState$lambda$02;
        boolean addAll$lambda$0;
        int i = this.d;
        Object obj2 = this.f;
        int i2 = this.e;
        switch (i) {
            case 0:
                commitText$lambda$0 = ImeEditCommand_androidKt.commitText$lambda$0((String) obj2, i2, (TextFieldBuffer) obj);
                return commitText$lambda$0;
            case 1:
                prefetchState$lambda$0 = LazyGridState.prefetchState$lambda$0((LazyGridState) obj2, i2, (NestedPrefetchScope) obj);
                return prefetchState$lambda$0;
            case 2:
                prefetchState$lambda$02 = LazyListState.prefetchState$lambda$0((LazyListState) obj2, i2, (NestedPrefetchScope) obj);
                return prefetchState$lambda$02;
            default:
                addAll$lambda$0 = SnapshotStateList.addAll$lambda$0(i2, (Collection) obj2, (List) obj);
                return Boolean.valueOf(addAll$lambda$0);
        }
    }

    public /* synthetic */ l00(Object obj, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.e = i;
    }
}
