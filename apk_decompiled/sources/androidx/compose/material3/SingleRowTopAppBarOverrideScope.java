package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import defpackage.dq;
import defpackage.my;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SingleRowTopAppBarOverrideScope {
    public static final int $stable = 0;
    private final ny actions;
    private final TopAppBarColors colors;
    private final float expandedHeight;
    private final Modifier modifier;
    private final my navigationIcon;
    private final TopAppBarScrollBehavior scrollBehavior;
    private final my subtitle;
    private final TextStyle subtitleTextStyle;
    private final my title;
    private final Alignment.Horizontal titleHorizontalAlignment;
    private final TextStyle titleTextStyle;
    private final WindowInsets windowInsets;

    private SingleRowTopAppBarOverrideScope(Modifier modifier, my myVar, TextStyle textStyle, my myVar2, TextStyle textStyle2, Alignment.Horizontal horizontal, my myVar3, ny nyVar, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior) {
        this.modifier = modifier;
        this.title = myVar;
        this.titleTextStyle = textStyle;
        this.subtitle = myVar2;
        this.subtitleTextStyle = textStyle2;
        this.titleHorizontalAlignment = horizontal;
        this.navigationIcon = myVar3;
        this.actions = nyVar;
        this.expandedHeight = f;
        this.windowInsets = windowInsets;
        this.colors = topAppBarColors;
        this.scrollBehavior = topAppBarScrollBehavior;
    }

    public final ny getActions() {
        return this.actions;
    }

    public final TopAppBarColors getColors() {
        return this.colors;
    }

    /* renamed from: getExpandedHeight-D9Ej5fM, reason: not valid java name */
    public final float m2390getExpandedHeightD9Ej5fM() {
        return this.expandedHeight;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public final my getNavigationIcon() {
        return this.navigationIcon;
    }

    public final TopAppBarScrollBehavior getScrollBehavior() {
        return this.scrollBehavior;
    }

    public final my getSubtitle() {
        return this.subtitle;
    }

    public final TextStyle getSubtitleTextStyle() {
        return this.subtitleTextStyle;
    }

    public final my getTitle() {
        return this.title;
    }

    public final Alignment.Horizontal getTitleHorizontalAlignment() {
        return this.titleHorizontalAlignment;
    }

    public final TextStyle getTitleTextStyle() {
        return this.titleTextStyle;
    }

    public final WindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    public /* synthetic */ SingleRowTopAppBarOverrideScope(Modifier modifier, my myVar, TextStyle textStyle, my myVar2, TextStyle textStyle2, Alignment.Horizontal horizontal, my myVar3, ny nyVar, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, dq dqVar) {
        this(modifier, myVar, textStyle, myVar2, textStyle2, horizontal, myVar3, nyVar, f, windowInsets, topAppBarColors, topAppBarScrollBehavior);
    }
}
