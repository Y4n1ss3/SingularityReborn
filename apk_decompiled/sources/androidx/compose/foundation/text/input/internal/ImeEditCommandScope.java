package androidx.compose.foundation.text.input.internal;

import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface ImeEditCommandScope {
    boolean beginBatchEdit();

    void edit(ky kyVar);

    boolean endBatchEdit();

    /* renamed from: mapFromTransformed-GEjPoXI */
    long mo1267mapFromTransformedGEjPoXI(long j);

    /* renamed from: mapToTransformed-GEjPoXI */
    long mo1268mapToTransformedGEjPoXI(long j);
}
