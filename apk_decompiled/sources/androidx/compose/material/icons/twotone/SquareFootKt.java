package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SquareFootKt {
    private static ImageVector _squareFoot;

    public static final ImageVector getSquareFoot(Icons.TwoTone twoTone) {
        ImageVector imageVector = _squareFoot;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SquareFoot", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(k4.e(7.0f, 17.0f, 5.76f, 0.0f), -5.76f, -5.76f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(17.66f, 17.66f, -1.06f, 1.06f);
        e.lineToRelative(-0.71f, -0.71f);
        e.lineToRelative(1.06f, -1.06f);
        e.lineToRelative(-1.94f, -1.94f);
        e.lineToRelative(-1.06f, 1.06f);
        e.lineToRelative(-0.71f, -0.71f);
        e.lineToRelative(1.06f, -1.06f);
        e.lineToRelative(-1.94f, -1.94f);
        e.lineToRelative(-1.06f, 1.06f);
        e.lineToRelative(-0.71f, -0.71f);
        e.lineToRelative(1.06f, -1.06f);
        e.lineTo(9.7f, 9.7f);
        e.lineToRelative(-1.06f, 1.06f);
        e.lineToRelative(-0.71f, -0.71f);
        e.lineToRelative(1.06f, -1.06f);
        e.lineTo(7.05f, 7.05f);
        e.lineTo(5.99f, 8.11f);
        e.lineTo(5.28f, 7.4f);
        e.lineToRelative(1.06f, -1.06f);
        e.lineTo(4.0f, 4.0f);
        e.verticalLineToRelative(14.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        gy.n(e, 14.0f, 17.66f, 17.66f);
        e.moveTo(7.0f, 17.0f);
        e.verticalLineToRelative(-5.76f);
        e.lineTo(12.76f, 17.0f);
        e.horizontalLineTo(7.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _squareFoot = build;
        build.getClass();
        return build;
    }
}
