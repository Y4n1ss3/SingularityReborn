package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.ui.Modifier;
import defpackage.dq;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShortNavigationBarOverrideScope {
    public static final int $stable = 0;
    private final int arrangement;
    private final long containerColor;
    private final my content;
    private final long contentColor;
    private final Modifier modifier;
    private final WindowInsets windowInsets;

    private ShortNavigationBarOverrideScope(Modifier modifier, long j, long j2, WindowInsets windowInsets, int i, my myVar) {
        this.modifier = modifier;
        this.containerColor = j;
        this.contentColor = j2;
        this.windowInsets = windowInsets;
        this.arrangement = i;
        this.content = myVar;
    }

    /* renamed from: getArrangement-LnnQw40, reason: not valid java name */
    public final int m2387getArrangementLnnQw40() {
        return this.arrangement;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2388getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    public final my getContent() {
        return this.content;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m2389getContentColor0d7_KjU() {
        return this.contentColor;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public final WindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    public /* synthetic */ ShortNavigationBarOverrideScope(Modifier modifier, long j, long j2, WindowInsets windowInsets, int i, my myVar, dq dqVar) {
        this(modifier, j, j2, windowInsets, i, myVar);
    }
}
