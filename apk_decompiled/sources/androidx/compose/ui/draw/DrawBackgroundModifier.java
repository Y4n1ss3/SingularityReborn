package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DrawBackgroundModifier extends Modifier.Node implements DrawModifierNode {
    public static final int $stable = 8;
    private ky onDraw;

    public DrawBackgroundModifier(ky kyVar) {
        this.onDraw = kyVar;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        this.onDraw.invoke(contentDrawScope);
        contentDrawScope.drawContent();
    }

    public final ky getOnDraw() {
        return this.onDraw;
    }

    public final void setOnDraw(ky kyVar) {
        this.onDraw = kyVar;
    }
}
