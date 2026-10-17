package androidx.compose.ui.modifier;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class ModifierLocalMap {
    public static final int $stable = 0;

    public /* synthetic */ ModifierLocalMap(dq dqVar) {
        this();
    }

    public abstract boolean contains$ui(ModifierLocal<?> modifierLocal);

    public abstract <T> T get$ui(ModifierLocal<T> modifierLocal);

    /* renamed from: set$ui */
    public abstract <T> void mo6391set$ui(ModifierLocal<T> modifierLocal, T t);

    private ModifierLocalMap() {
    }
}
