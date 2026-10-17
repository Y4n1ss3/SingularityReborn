package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import defpackage.kn;
import defpackage.l;
import defpackage.nn;
import defpackage.on;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1 extends l implements on {
    final /* synthetic */ CompositionErrorContextImpl $traceContext$inlined;
    final /* synthetic */ RememberedCoroutineScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1(nn nnVar, CompositionErrorContextImpl compositionErrorContextImpl, RememberedCoroutineScope rememberedCoroutineScope) {
        super(nnVar);
        this.$traceContext$inlined = compositionErrorContextImpl;
        this.this$0 = rememberedCoroutineScope;
    }

    @Override // defpackage.on
    public void handleException(kn knVar, Throwable th) {
        kn knVar2;
        kn knVar3;
        this.$traceContext$inlined.attachComposeStackTrace(th, this.this$0);
        knVar2 = this.this$0.overlayContext;
        nn nnVar = nn.d;
        on onVar = (on) knVar2.get(nnVar);
        if (onVar != null) {
            onVar.handleException(knVar, th);
            return;
        }
        knVar3 = this.this$0.parentContext;
        on onVar2 = (on) knVar3.get(nnVar);
        if (onVar2 == null) {
            throw th;
        }
        onVar2.handleException(knVar, th);
    }
}
