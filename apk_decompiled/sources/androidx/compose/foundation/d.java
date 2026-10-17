package androidx.compose.foundation;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.Placeable;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 invoke$lambda$0;
        w01 draw$lambda$0$0;
        w01 measure_3p2s80s$lambda$0;
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                invoke$lambda$0 = ClickableNode$createPointerInputNodeIfNeeded$1.invoke$lambda$0((ClickableNode) obj2, (Offset) obj);
                return invoke$lambda$0;
            case 1:
                draw$lambda$0$0 = MarqueeModifierNode.draw$lambda$0$0((ContentDrawScope) obj2, (DrawScope) obj);
                return draw$lambda$0$0;
            default:
                measure_3p2s80s$lambda$0 = MarqueeModifierNode.measure_3p2s80s$lambda$0((Placeable) obj2, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$0;
        }
    }
}
