package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CacheDrawScope$record$1$1 extends f30 implements ky {
    final /* synthetic */ ky $block;
    final /* synthetic */ Density $density;
    final /* synthetic */ LayoutDirection $layoutDirection;
    final /* synthetic */ Density $prevDensity;
    final /* synthetic */ LayoutDirection $prevLayoutDirection;
    final /* synthetic */ ContentDrawScope $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheDrawScope$record$1$1(ky kyVar, ContentDrawScope contentDrawScope, Density density, LayoutDirection layoutDirection, Density density2, LayoutDirection layoutDirection2) {
        super(1);
        this.$block = kyVar;
        this.$scope = contentDrawScope;
        this.$density = density;
        this.$layoutDirection = layoutDirection;
        this.$prevDensity = density2;
        this.$prevLayoutDirection = layoutDirection2;
    }

    public final void invoke(DrawScope drawScope) {
        DrawContext drawContext = drawScope.getDrawContext();
        Density density = this.$density;
        LayoutDirection layoutDirection = this.$layoutDirection;
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        try {
            this.$block.invoke(this.$scope);
        } finally {
            DrawContext drawContext2 = drawScope.getDrawContext();
            Density density2 = this.$prevDensity;
            LayoutDirection layoutDirection2 = this.$prevLayoutDirection;
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
        }
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return w01.a;
    }
}
