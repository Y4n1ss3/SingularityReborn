package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.ui.Modifier;
import defpackage.dq;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NavigationRailOverrideScope {
    public static final int $stable = 0;
    private final long containerColor;
    private final ny content;
    private final long contentColor;
    private final ny header;
    private final Modifier modifier;
    private final WindowInsets windowInsets;

    public /* synthetic */ NavigationRailOverrideScope(Modifier modifier, long j, long j2, ny nyVar, WindowInsets windowInsets, ny nyVar2, int i, dq dqVar) {
        this((i & 1) != 0 ? Modifier.Companion : modifier, j, j2, nyVar, windowInsets, nyVar2, null);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2238getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    public final ny getContent() {
        return this.content;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m2239getContentColor0d7_KjU() {
        return this.contentColor;
    }

    public final ny getHeader() {
        return this.header;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public final WindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    private NavigationRailOverrideScope(Modifier modifier, long j, long j2, ny nyVar, WindowInsets windowInsets, ny nyVar2) {
        this.modifier = modifier;
        this.containerColor = j;
        this.contentColor = j2;
        this.header = nyVar;
        this.windowInsets = windowInsets;
        this.content = nyVar2;
    }

    public /* synthetic */ NavigationRailOverrideScope(Modifier modifier, long j, long j2, ny nyVar, WindowInsets windowInsets, ny nyVar2, dq dqVar) {
        this(modifier, j, j2, nyVar, windowInsets, nyVar2);
    }
}
