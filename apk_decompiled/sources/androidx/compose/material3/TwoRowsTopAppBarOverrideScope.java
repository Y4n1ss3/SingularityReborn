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
public final class TwoRowsTopAppBarOverrideScope {
    public static final int $stable = 0;
    private final ny actions;
    private final float collapsedHeight;
    private final TopAppBarColors colors;
    private final float expandedHeight;
    private final Modifier modifier;
    private final my navigationIcon;
    private final TopAppBarScrollBehavior scrollBehavior;
    private final my smallSubtitle;
    private final TextStyle smallSubtitleTextStyle;
    private final my smallTitle;
    private final TextStyle smallTitleTextStyle;
    private final my subtitle;
    private final TextStyle subtitleTextStyle;
    private final my title;
    private final float titleBottomPadding;
    private final Alignment.Horizontal titleHorizontalAlignment;
    private final TextStyle titleTextStyle;
    private final WindowInsets windowInsets;

    private TwoRowsTopAppBarOverrideScope(Modifier modifier, my myVar, TextStyle textStyle, float f, my myVar2, TextStyle textStyle2, my myVar3, TextStyle textStyle3, my myVar4, TextStyle textStyle4, Alignment.Horizontal horizontal, my myVar5, ny nyVar, float f2, float f3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior) {
        this.modifier = modifier;
        this.title = myVar;
        this.titleTextStyle = textStyle;
        this.titleBottomPadding = f;
        this.smallTitle = myVar2;
        this.smallTitleTextStyle = textStyle2;
        this.subtitle = myVar3;
        this.subtitleTextStyle = textStyle3;
        this.smallSubtitle = myVar4;
        this.smallSubtitleTextStyle = textStyle4;
        this.titleHorizontalAlignment = horizontal;
        this.navigationIcon = myVar5;
        this.actions = nyVar;
        this.collapsedHeight = f2;
        this.expandedHeight = f3;
        this.windowInsets = windowInsets;
        this.colors = topAppBarColors;
        this.scrollBehavior = topAppBarScrollBehavior;
    }

    public final ny getActions() {
        return this.actions;
    }

    /* renamed from: getCollapsedHeight-D9Ej5fM, reason: not valid java name */
    public final float m2830getCollapsedHeightD9Ej5fM() {
        return this.collapsedHeight;
    }

    public final TopAppBarColors getColors() {
        return this.colors;
    }

    /* renamed from: getExpandedHeight-D9Ej5fM, reason: not valid java name */
    public final float m2831getExpandedHeightD9Ej5fM() {
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

    public final my getSmallSubtitle() {
        return this.smallSubtitle;
    }

    public final TextStyle getSmallSubtitleTextStyle() {
        return this.smallSubtitleTextStyle;
    }

    public final my getSmallTitle() {
        return this.smallTitle;
    }

    public final TextStyle getSmallTitleTextStyle() {
        return this.smallTitleTextStyle;
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

    /* renamed from: getTitleBottomPadding-D9Ej5fM, reason: not valid java name */
    public final float m2832getTitleBottomPaddingD9Ej5fM() {
        return this.titleBottomPadding;
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

    public /* synthetic */ TwoRowsTopAppBarOverrideScope(Modifier modifier, my myVar, TextStyle textStyle, float f, my myVar2, TextStyle textStyle2, my myVar3, TextStyle textStyle3, my myVar4, TextStyle textStyle4, Alignment.Horizontal horizontal, my myVar5, ny nyVar, float f2, float f3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, dq dqVar) {
        this(modifier, myVar, textStyle, f, myVar2, textStyle2, myVar3, textStyle3, myVar4, textStyle4, horizontal, myVar5, nyVar, f2, f3, windowInsets, topAppBarColors, topAppBarScrollBehavior);
    }
}
