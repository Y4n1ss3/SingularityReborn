package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BookmarksKt {
    private static ImageVector _bookmarks;

    public static final ImageVector getBookmarks(Icons.Outlined outlined) {
        ImageVector imageVector = _bookmarks;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Bookmarks", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(15.0f, 7.0f, 12.97f, -4.21f, -1.81f);
        n.lineToRelative(-0.79f, -0.34f);
        n.lineToRelative(-0.79f, 0.34f);
        n.lineTo(5.0f, 19.97f);
        n.lineTo(5.0f, 7.0f);
        n.horizontalLineToRelative(10.0f);
        n.moveToRelative(4.0f, -6.0f);
        n.lineTo(8.99f, 1.0f);
        n.curveTo(7.89f, 1.0f, 7.0f, 1.9f, 7.0f, 3.0f);
        n.horizontalLineToRelative(10.0f);
        n.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        n.verticalLineToRelative(13.0f);
        n.lineToRelative(2.0f, 1.0f);
        n.lineTo(21.0f, 3.0f);
        n.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(n, 15.0f, 5.0f, 5.0f, 5.0f);
        n.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        n.verticalLineToRelative(16.0f);
        n.lineToRelative(7.0f, -3.0f);
        n.lineToRelative(7.0f, 3.0f);
        n.lineTo(17.0f, 7.0f);
        n.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        n.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, n.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bookmarks = build;
        build.getClass();
        return build;
    }
}
