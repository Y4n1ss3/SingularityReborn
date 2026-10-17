package androidx.compose.runtime;

import defpackage.hm;
import defpackage.iy;
import defpackage.kn;
import defpackage.un;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface ProduceStateScope<T> extends MutableState<T>, un {
    Object awaitDispose(iy iyVar, hm hmVar);

    @Override // defpackage.un
    /* synthetic */ kn getCoroutineContext();
}
