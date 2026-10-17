package androidx.compose.ui.layout;

import defpackage.pl0;
import defpackage.xa0;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface WindowInsetsRulerProvider {
    xa0 getCutoutRects();

    List<RectRulers> getCutoutRulers();

    InsetsListener getInsetsListener();

    pl0 getInsetsValues();
}
