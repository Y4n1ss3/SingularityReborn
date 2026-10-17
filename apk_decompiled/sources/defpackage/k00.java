package defpackage;

import androidx.compose.foundation.ScrollNode;
import androidx.compose.foundation.lazy.LazyListMeasureResult;
import androidx.compose.foundation.lazy.LazyListState$prefetchScope$1;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.layout.Placeable;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class k00 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ k00(String str, List list, int i) {
        this.d = 0;
        this.f = str;
        this.g = list;
        this.e = i;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 composingText$lambda$0;
        w01 schedulePrefetch$lambda$1;
        w01 end$lambda$0$1;
        w01 measure_3p2s80s$lambda$0;
        int i = this.d;
        Object obj2 = this.g;
        int i2 = this.e;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                composingText$lambda$0 = ImeEditCommand_androidKt.setComposingText$lambda$0((String) obj3, (List) obj2, i2, (TextFieldBuffer) obj);
                return composingText$lambda$0;
            case 1:
                schedulePrefetch$lambda$1 = LazyListState$prefetchScope$1.schedulePrefetch$lambda$1((ky) obj3, i2, (LazyListMeasureResult) obj2, (LazyLayoutPrefetchState.PrefetchResultScope) obj);
                return schedulePrefetch$lambda$1;
            case 2:
                end$lambda$0$1 = RecomposeScopeImpl.end$lambda$0$1((RecomposeScopeImpl) obj3, i2, (ta0) obj2, (Composition) obj);
                return end$lambda$0$1;
            default:
                measure_3p2s80s$lambda$0 = ScrollNode.measure_3p2s80s$lambda$0((ScrollNode) obj3, i2, (Placeable) obj2, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$0;
        }
    }

    public /* synthetic */ k00(Object obj, int i, Object obj2, int i2) {
        this.d = i2;
        this.f = obj;
        this.e = i;
        this.g = obj2;
    }
}
