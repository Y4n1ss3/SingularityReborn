package androidx.compose.runtime.tooling;

import androidx.compose.runtime.InternalComposer;
import androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext;
import defpackage.dq;
import defpackage.in;
import defpackage.jn;
import defpackage.kn;
import defpackage.my;
import defpackage.v4;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CompositionErrorContextImpl implements CompositionErrorContext, OperationErrorContext, in {
    public static final int $stable = 0;
    public static final Key Key = new Key(null);
    private final InternalComposer composer;

    public CompositionErrorContextImpl(InternalComposer internalComposer) {
        this.composer = internalComposer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComposeStackTrace attachComposeStackTrace$lambda$0(CompositionErrorContextImpl compositionErrorContextImpl, Object obj) {
        return compositionErrorContextImpl.composer.stackTraceForValue$runtime(obj);
    }

    @Override // androidx.compose.runtime.tooling.CompositionErrorContext
    public boolean attachComposeStackTrace(Throwable th, Object obj) {
        return ComposeStackTraceKt.tryAttachComposeStackTrace(th, new v4(10, this, obj));
    }

    @Override // androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext
    public List<ComposeStackTraceFrame> buildStackTrace(Integer num) {
        return this.composer.parentStackTrace$runtime();
    }

    @Override // defpackage.kn
    public /* bridge */ <R> R fold(R r, my myVar) {
        return (R) y80.q(this, r, myVar);
    }

    @Override // defpackage.kn
    public /* bridge */ <E extends in> E get(jn jnVar) {
        return (E) y80.s(this, jnVar);
    }

    @Override // defpackage.in
    public jn getKey() {
        return Key;
    }

    @Override // androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext
    public boolean getSourceInformationEnabled() {
        return this.composer.getSourceMarkersEnabled$runtime();
    }

    @Override // defpackage.kn
    public /* bridge */ kn minusKey(jn jnVar) {
        return y80.F(this, jnVar);
    }

    @Override // defpackage.kn
    public /* bridge */ kn plus(kn knVar) {
        return y80.I(this, knVar);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Key implements jn {
        public /* synthetic */ Key(dq dqVar) {
            this();
        }

        public String toString() {
            return "CompositionErrorContext";
        }

        private Key() {
        }
    }
}
