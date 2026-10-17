package androidx.compose.runtime.tooling;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ParameterSourceInformation {
    public static final int $stable = 0;
    private final String inlineClass;
    private final String name;
    private final int sortedIndex;

    public /* synthetic */ ParameterSourceInformation(int i, String str, String str2, int i2, dq dqVar) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2);
    }

    public final String getInlineClass() {
        return this.inlineClass;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSortedIndex() {
        return this.sortedIndex;
    }

    public ParameterSourceInformation(int i, String str, String str2) {
        this.sortedIndex = i;
        this.name = str;
        this.inlineClass = str2;
    }
}
