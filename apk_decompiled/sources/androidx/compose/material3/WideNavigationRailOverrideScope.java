package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WideNavigationRailOverrideScope {
    public static final int $stable = 8;
    private final Arrangement.Vertical arrangement;
    private final WideNavigationRailColors colors;
    private final my content;
    private final my header;
    private final Modifier modifier;
    private final Shape shape;
    private final WideNavigationRailState state;
    private final WindowInsets windowInsets;

    public WideNavigationRailOverrideScope(Modifier modifier, WideNavigationRailState wideNavigationRailState, Shape shape, WideNavigationRailColors wideNavigationRailColors, my myVar, WindowInsets windowInsets, Arrangement.Vertical vertical, my myVar2) {
        this.modifier = modifier;
        this.state = wideNavigationRailState;
        this.shape = shape;
        this.colors = wideNavigationRailColors;
        this.header = myVar;
        this.windowInsets = windowInsets;
        this.arrangement = vertical;
        this.content = myVar2;
    }

    public final Arrangement.Vertical getArrangement() {
        return this.arrangement;
    }

    public final WideNavigationRailColors getColors() {
        return this.colors;
    }

    public final my getContent() {
        return this.content;
    }

    public final my getHeader() {
        return this.header;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public final WideNavigationRailState getState() {
        return this.state;
    }

    public final WindowInsets getWindowInsets() {
        return this.windowInsets;
    }
}
