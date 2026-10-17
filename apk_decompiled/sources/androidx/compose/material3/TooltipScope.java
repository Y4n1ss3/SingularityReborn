package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.window.PopupPositionProvider;
import defpackage.er;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface TooltipScope {
    @er
    /* synthetic */ Modifier drawCaret(Modifier modifier, my myVar);

    LayoutCoordinates obtainAnchorBounds(MeasureScope measureScope);

    PopupPositionProvider obtainPositionProvider();
}
