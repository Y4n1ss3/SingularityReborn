package androidx.compose.ui.modifier;

import defpackage.dq;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class ModifierLocal<T> {
    public static final int $stable = 0;
    private final iy defaultFactory;

    private ModifierLocal(iy iyVar) {
        this.defaultFactory = iyVar;
    }

    public final iy getDefaultFactory$ui() {
        return this.defaultFactory;
    }

    public /* synthetic */ ModifierLocal(iy iyVar, dq dqVar) {
        this(iyVar);
    }
}
