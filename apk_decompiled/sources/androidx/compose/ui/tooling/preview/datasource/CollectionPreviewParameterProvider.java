package androidx.compose.ui.tooling.preview.datasource;

import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import defpackage.ao0;
import defpackage.cc;
import java.util.Collection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class CollectionPreviewParameterProvider<T> implements PreviewParameterProvider<T> {
    public static final int $stable = 8;
    private final Collection<T> collection;

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionPreviewParameterProvider(Collection<? extends T> collection) {
        this.collection = collection;
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public ao0 getValues() {
        Collection<T> collection = this.collection;
        collection.getClass();
        return new cc(collection, 1);
    }
}
