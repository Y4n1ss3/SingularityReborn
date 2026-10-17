package androidx.compose.material.icons.sharp;

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

    public static final ImageVector getBookmarkRemove(Icons.Sharp sharp) {
        ImageVector imageVector = _bookmarkRemove;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.BookmarkRemove", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = fc.n(21.0f, 7.0f, -6.0f, 5.0f, 6.0f);
        bv.t(n, 7.0f, 19.0f, 10.9f);
        n.curveToRelative(-0.64f, 0.13f, -1.32f, 0.14f, -2.02f, 0.0f);
        n.curveToRelative(-1.91f, -0.38f, -3.47f, -1.92f, -3.87f, -3.83f);
        n.curveTo(12.79f, 5.54f, 13.18f, 4.1f, 14.0f, 3.0f);
        n.lineTo(5.0f, 3.0f);
        n.verticalLineToRelative(18.0f);
        n.lineToRelative(7.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.j(n, 7.0f, 3.0f, 10.9f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bookmarkRemove = build;
        build.getClass();
        return build;
    }
}
