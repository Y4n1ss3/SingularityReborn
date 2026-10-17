package androidx.compose.runtime;

import java.util.Comparator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int InvalidationLocationAscending$lambda$0;
        InvalidationLocationAscending$lambda$0 = GapComposerKt.InvalidationLocationAscending$lambda$0((Invalidation) obj, (Invalidation) obj2);
        return InvalidationLocationAscending$lambda$0;
    }
}
