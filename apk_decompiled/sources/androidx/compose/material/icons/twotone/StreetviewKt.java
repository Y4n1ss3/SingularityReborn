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
import defpackage.af0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StreetviewKt {
    private static ImageVector _streetview;

    public static final ImageVector getStreetview(Icons.TwoTone twoTone) {
        ImageVector imageVector = _streetview;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Streetview", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.56f, 14.33f);
        b.curveToRelative(-0.34f, 0.27f, -0.56f, 0.7f, -0.56f, 1.17f);
        b.verticalLineTo(21.0f);
        b.horizontalLineToRelative(7.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.verticalLineToRelative(-5.98f);
        b.curveToRelative(-0.94f, -0.33f, -1.95f, -0.52f, -3.0f, -0.52f);
        b.curveToRelative(-2.03f, 0.0f, -3.93f, 0.7f, -5.44f, 1.83f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = af0.b(18.0f, 6.0f, -5.0f, 0.0f);
        b2.arcToRelative(5.0f, 5.0f, 0.0f, true, true, 10.0f, 0.0f);
        b2.arcToRelative(5.0f, 5.0f, 0.0f, true, true, -10.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b3 = uf.b(11.5f, 6.0f);
        b3.curveToRelative(0.0f, -1.08f, 0.27f, -2.1f, 0.74f, -3.0f);
        b3.horizontalLineTo(5.0f);
        b3.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b3.verticalLineToRelative(14.0f);
        b3.curveToRelative(0.0f, 0.55f, 0.23f, 1.05f, 0.59f, 1.41f);
        b3.lineToRelative(9.82f, -9.82f);
        b3.curveTo(12.23f, 9.42f, 11.5f, 7.8f, 11.5f, 6.0f);
        b3.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _streetview = build;
        build.getClass();
        return build;
    }
}
