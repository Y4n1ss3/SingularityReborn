package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.window.PopupPositionProvider;
import defpackage.er;
import defpackage.iy;
import defpackage.my;
import defpackage.te0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TooltipScopeImpl implements TooltipScope {
    public static final int $stable = 0;
    private final iy getAnchorBounds;
    private final PopupPositionProvider positionProvider;

    public TooltipScopeImpl(iy iyVar, PopupPositionProvider popupPositionProvider) {
        this.getAnchorBounds = iyVar;
        this.positionProvider = popupPositionProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult drawCaret$lambda$0(my myVar, TooltipScopeImpl tooltipScopeImpl, CacheDrawScope cacheDrawScope) {
        return (DrawResult) myVar.invoke(cacheDrawScope, tooltipScopeImpl.getAnchorBounds.invoke());
    }

    @Override // androidx.compose.material3.TooltipScope
    @er
    public /* synthetic */ Modifier drawCaret(Modifier modifier, my myVar) {
        return DrawModifierKt.drawWithCache(modifier, new te0(18, myVar, this));
    }

    public final iy getGetAnchorBounds() {
        return this.getAnchorBounds;
    }

    public final PopupPositionProvider getPositionProvider() {
        return this.positionProvider;
    }

    @Override // androidx.compose.material3.TooltipScope
    public LayoutCoordinates obtainAnchorBounds(MeasureScope measureScope) {
        return (LayoutCoordinates) this.getAnchorBounds.invoke();
    }

    @Override // androidx.compose.material3.TooltipScope
    public PopupPositionProvider obtainPositionProvider() {
        return this.positionProvider;
    }
}
