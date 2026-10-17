package defpackage;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class t8 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ ky f;

    public /* synthetic */ t8(MutableState mutableState, ky kyVar, int i) {
        this.d = i;
        this.e = mutableState;
        this.f = kyVar;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 ClickableText_4YKlhWE$lambda$3$0;
        int i = this.d;
        ky kyVar = this.f;
        MutableState mutableState = this.e;
        switch (i) {
            case 0:
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                List list = (List) mutableState.getValue();
                lazyListScope.items(list.size(), null, new xa(list, 3), ComposableLambdaKt.composableLambdaInstance(802480018, true, new ya(1, kyVar, list)));
                return w01.a;
            default:
                ClickableText_4YKlhWE$lambda$3$0 = ClickableTextKt.ClickableText_4YKlhWE$lambda$3$0(mutableState, kyVar, (TextLayoutResult) obj);
                return ClickableText_4YKlhWE$lambda$3$0;
        }
    }
}
