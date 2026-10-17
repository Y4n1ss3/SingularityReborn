package androidx.compose.ui.semantics;

import defpackage.dq;
import defpackage.f30;
import defpackage.my;
import defpackage.z20;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SemanticsPropertyKey<T> {
    public static final int $stable = 8;
    private String accessibilityExtraKey;
    private boolean isImportantForAccessibility;
    private final my mergePolicy;
    private final String name;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.ui.semantics.SemanticsPropertyKey$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f30 implements my {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // defpackage.my
        public final T invoke(T t, T t2) {
            return t == null ? t2 : t;
        }
    }

    public /* synthetic */ SemanticsPropertyKey(String str, my myVar, int i, dq dqVar) {
        this(str, (i & 2) != 0 ? AnonymousClass1.INSTANCE : myVar);
    }

    public final String getAccessibilityExtraKey$ui() {
        return this.accessibilityExtraKey;
    }

    public final my getMergePolicy$ui() {
        return this.mergePolicy;
    }

    public final String getName() {
        return this.name;
    }

    public final T getValue(SemanticsPropertyReceiver semanticsPropertyReceiver, z20 z20Var) {
        Object throwSemanticsGetNotSupported;
        throwSemanticsGetNotSupported = SemanticsPropertiesKt.throwSemanticsGetNotSupported();
        return (T) throwSemanticsGetNotSupported;
    }

    public final boolean isImportantForAccessibility$ui() {
        return this.isImportantForAccessibility;
    }

    public final T merge(T t, T t2) {
        return (T) this.mergePolicy.invoke(t, t2);
    }

    public final void setAccessibilityExtraKey$ui(String str) {
        this.accessibilityExtraKey = str;
    }

    public final void setValue(SemanticsPropertyReceiver semanticsPropertyReceiver, z20 z20Var, T t) {
        semanticsPropertyReceiver.set(this, t);
    }

    public String toString() {
        return "AccessibilityKey: " + this.name;
    }

    public SemanticsPropertyKey(String str, my myVar) {
        this.name = str;
        this.mergePolicy = myVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(String str, boolean z) {
        this(str, (my) null, 2, (dq) (0 == true ? 1 : 0));
        this.isImportantForAccessibility = z;
    }

    public /* synthetic */ SemanticsPropertyKey(String str, boolean z, my myVar, String str2, int i, dq dqVar) {
        this(str, z, myVar, (i & 8) != 0 ? null : str2);
    }

    public SemanticsPropertyKey(String str, boolean z, my myVar, String str2) {
        this(str, myVar);
        this.isImportantForAccessibility = z;
        this.accessibilityExtraKey = str2;
    }
}
