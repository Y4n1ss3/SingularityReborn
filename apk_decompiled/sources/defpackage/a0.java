package defpackage;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Collection e;

    public /* synthetic */ a0(int i, Collection collection) {
        this.d = i;
        this.e = collection;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        boolean retainAll$lambda$0;
        int i = this.d;
        Collection collection = this.e;
        switch (i) {
            case 0:
                retainAll$lambda$0 = AbstractPersistentList.retainAll$lambda$0(collection, obj);
                break;
            case 1:
                retainAll$lambda$0 = collection.contains(obj);
                break;
            case 2:
                retainAll$lambda$0 = collection.contains(obj);
                break;
            case 3:
                retainAll$lambda$0 = SnapshotStateList.retainAll$lambda$0(collection, (List) obj);
                break;
            default:
                retainAll$lambda$0 = SnapshotStateSet.retainAll$lambda$0(collection, (Set) obj);
                break;
        }
        return Boolean.valueOf(retainAll$lambda$0);
    }
}
