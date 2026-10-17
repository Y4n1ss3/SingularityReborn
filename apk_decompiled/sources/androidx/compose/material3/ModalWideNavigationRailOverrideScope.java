package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import defpackage.dq;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ModalWideNavigationRailOverrideScope {
    public static final int $stable = 8;
    private final Arrangement.Vertical arrangement;
    private final Shape collapsedShape;
    private final WideNavigationRailColors colors;
    private final my content;
    private final float expandedHeaderTopPadding;
    private final ModalWideNavigationRailProperties expandedProperties;
    private final Shape expandedShape;
    private final my header;
    private final Modifier modifier;
    private final boolean shouldHideOnCollapse;
    private final WideNavigationRailState state;
    private final WindowInsets windowInsets;

    private ModalWideNavigationRailOverrideScope(Modifier modifier, WideNavigationRailState wideNavigationRailState, boolean z, Shape shape, Shape shape2, WideNavigationRailColors wideNavigationRailColors, my myVar, float f, WindowInsets windowInsets, Arrangement.Vertical vertical, ModalWideNavigationRailProperties modalWideNavigationRailProperties, my myVar2) {
        this.modifier = modifier;
        this.state = wideNavigationRailState;
        this.shouldHideOnCollapse = z;
        this.collapsedShape = shape;
        this.expandedShape = shape2;
        this.colors = wideNavigationRailColors;
        this.header = myVar;
        this.expandedHeaderTopPadding = f;
        this.windowInsets = windowInsets;
        this.arrangement = vertical;
        this.expandedProperties = modalWideNavigationRailProperties;
        this.content = myVar2;
    }

    public final Arrangement.Vertical getArrangement() {
        return this.arrangement;
    }

    public final Shape getCollapsedShape() {
        return this.collapsedShape;
    }

    public final WideNavigationRailColors getColors() {
        return this.colors;
    }

    public final my getContent() {
        return this.content;
    }

    /* renamed from: getExpandedHeaderTopPadding-D9Ej5fM, reason: not valid java name */
    public final float m2153getExpandedHeaderTopPaddingD9Ej5fM() {
        return this.expandedHeaderTopPadding;
    }

    public final ModalWideNavigationRailProperties getExpandedProperties() {
        return this.expandedProperties;
    }

    public final Shape getExpandedShape() {
        return this.expandedShape;
    }

    public final my getHeader() {
        return this.header;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public final boolean getShouldHideOnCollapse() {
        return this.shouldHideOnCollapse;
    }

    public final WideNavigationRailState getState() {
        return this.state;
    }

    public final WindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    public /* synthetic */ ModalWideNavigationRailOverrideScope(Modifier modifier, WideNavigationRailState wideNavigationRailState, boolean z, Shape shape, Shape shape2, WideNavigationRailColors wideNavigationRailColors, my myVar, float f, WindowInsets windowInsets, Arrangement.Vertical vertical, ModalWideNavigationRailProperties modalWideNavigationRailProperties, my myVar2, dq dqVar) {
        this(modifier, wideNavigationRailState, z, shape, shape2, wideNavigationRailColors, myVar, f, windowInsets, vertical, modalWideNavigationRailProperties, myVar2);
    }
}
