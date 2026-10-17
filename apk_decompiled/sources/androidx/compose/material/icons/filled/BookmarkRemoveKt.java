package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.fc;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BookmarkRemoveKt {
    private static ImageVector _bookmarkRemove;

    public static final ImageVector getBookmarkRemove(Icons.Filled filled) {
        ImageVector imageVector = _bookmarkRemove;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.BookmarkRemove", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = fc.n(21.0f, 7.0f, -6.0f, 5.0f, 6.0f);
        bv.t(n, 7.0f, 19.0f, 10.9f);
        n.curveToRelative(-0.32f, 0.07f, -0.66f, 0.1f, -1.0f, 0.1f);
        n.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        n.curveToRelative(0.0f, -1.13f, 0.37f, -2.16f, 1.0f, -3.0f);
        n.lineTo(7.0f, 3.0f);
        n.curveTo(5.9f, 3.0f, 5.0f, 3.9f, 5.0f, 5.0f);
        n.verticalLineToRelative(16.0f);
        n.lineToRelative(7.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.j(n, 7.0f, 3.0f, 10.9f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bookmarkRemove = build;
        build.getClass();
        return build;
    }
}
