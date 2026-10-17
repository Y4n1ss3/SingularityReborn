package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.foundation.lazy.layout.PrefetchHandleProvider;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.node.TraversableNode;
import defpackage.ji0;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        DisposableEffectResult createContentLambda$lambda$0$0$0;
        DisposableEffectResult LazyLayoutPinnableItem$lambda$1$0;
        boolean _init_$lambda$0;
        TraversableNode.Companion.TraverseDescendantsAction resolveNestedPrefetchStates$lambda$1;
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                createContentLambda$lambda$0$0$0 = LazyLayoutItemContentFactory.CachedItemContent.createContentLambda$lambda$0$0$0((LazyLayoutItemContentFactory.CachedItemContent) obj2, (DisposableEffectScope) obj);
                return createContentLambda$lambda$0$0$0;
            case 1:
                LazyLayoutPinnableItem$lambda$1$0 = LazyLayoutPinnableItemKt.LazyLayoutPinnableItem$lambda$1$0((LazyLayoutPinnableItem) obj2, (DisposableEffectScope) obj);
                return LazyLayoutPinnableItem$lambda$1$0;
            case 2:
                _init_$lambda$0 = LazySaveableStateHolder._init_$lambda$0((SaveableStateRegistry) obj2, obj);
                return Boolean.valueOf(_init_$lambda$0);
            default:
                resolveNestedPrefetchStates$lambda$1 = PrefetchHandleProvider.HandleAndRequestImpl.resolveNestedPrefetchStates$lambda$1((ji0) obj2, (TraversableNode) obj);
                return resolveNestedPrefetchStates$lambda$1;
        }
    }
}
