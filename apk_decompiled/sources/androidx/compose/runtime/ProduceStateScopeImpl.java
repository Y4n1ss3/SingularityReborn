package androidx.compose.runtime;

import defpackage.d41;
import defpackage.gg;
import defpackage.hm;
import defpackage.iy;
import defpackage.kn;
import defpackage.ky;
import defpackage.o;
import defpackage.p10;
import defpackage.tj;
import defpackage.vn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ProduceStateScopeImpl<T> implements ProduceStateScope<T>, MutableState<T> {
    private final /* synthetic */ MutableState<T> $$delegate_0;
    private final kn coroutineContext;

    public ProduceStateScopeImpl(MutableState<T> mutableState, kn knVar) {
        this.$$delegate_0 = mutableState;
        this.coroutineContext = knVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // androidx.compose.runtime.ProduceStateScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object awaitDispose(iy iyVar, hm hmVar) {
        ProduceStateScopeImpl$awaitDispose$1 produceStateScopeImpl$awaitDispose$1;
        int i;
        try {
            if (hmVar instanceof ProduceStateScopeImpl$awaitDispose$1) {
                produceStateScopeImpl$awaitDispose$1 = (ProduceStateScopeImpl$awaitDispose$1) hmVar;
                int i2 = produceStateScopeImpl$awaitDispose$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    produceStateScopeImpl$awaitDispose$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = produceStateScopeImpl$awaitDispose$1.result;
                    i = produceStateScopeImpl$awaitDispose$1.label;
                    if (i != 0) {
                        p10.Q(obj);
                        produceStateScopeImpl$awaitDispose$1.L$0 = iyVar;
                        produceStateScopeImpl$awaitDispose$1.label = 1;
                        gg ggVar = new gg(1, d41.C(produceStateScopeImpl$awaitDispose$1));
                        ggVar.u();
                        Object s = ggVar.s();
                        vn vnVar = vn.d;
                        if (s == vnVar) {
                            return vnVar;
                        }
                    } else {
                        if (i != 1) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iyVar = (iy) produceStateScopeImpl$awaitDispose$1.L$0;
                        p10.Q(obj);
                    }
                    throw new tj();
                }
            }
            if (i != 0) {
            }
            throw new tj();
        } catch (Throwable th) {
            iyVar.invoke();
            throw th;
        }
        produceStateScopeImpl$awaitDispose$1 = new ProduceStateScopeImpl$awaitDispose$1(this, hmVar);
        Object obj2 = produceStateScopeImpl$awaitDispose$1.result;
        i = produceStateScopeImpl$awaitDispose$1.label;
    }

    @Override // androidx.compose.runtime.MutableState
    public T component1() {
        return this.$$delegate_0.component1();
    }

    @Override // androidx.compose.runtime.MutableState
    public ky component2() {
        return this.$$delegate_0.component2();
    }

    @Override // androidx.compose.runtime.ProduceStateScope, defpackage.un
    public kn getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.runtime.MutableState, androidx.compose.runtime.State
    public T getValue() {
        return this.$$delegate_0.getValue();
    }

    @Override // androidx.compose.runtime.MutableState
    public void setValue(T t) {
        this.$$delegate_0.setValue(t);
    }
}
