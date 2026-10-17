package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.ui.Modifier;
import defpackage.dq;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NavigationBarOverrideScope {
    public static final int $stable = 0;
    private final long containerColor;
    private final ny content;
    private final long contentColor;
    private final Modifier modifier;
    private final float tonalElevation;
    private final WindowInsets windowInsets;

    public /* synthetic */ NavigationBarOverrideScope(Modifier modifier, long j, long j2, float f, WindowInsets windowInsets, ny nyVar, int i, dq dqVar) {
        this((i & 1) != 0 ? Modifier.Companion : modifier, j, j2, f, windowInsets, nyVar, null);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2174getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    public final ny getContent() {
        return this.content;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m2175getContentColor0d7_KjU() {
        return this.contentColor;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    /* renamed from: getTonalElevation-D9Ej5fM, reason: not valid java name */
    public final float m2176getTonalElevationD9Ej5fM() {
        return this.tonalElevation;
    }

    public final WindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    private NavigationBarOverrideScope(Modifier modifier, long j, long j2, float f, WindowInsets windowInsets, ny nyVar) {
        this.modifier = modifier;
        this.containerColor = j;
        this.contentColor = j2;
        this.tonalElevation = f;
        this.windowInsets = windowInsets;
        this.content = nyVar;
    }

    public /* synthetic */ NavigationBarOverrideScope(Modifier modifier, long j, long j2, float f, WindowInsets windowInsets, ny nyVar, dq dqVar) {
        this(modifier, j, j2, f, windowInsets, nyVar);
    }
}
