package androidx.compose.material.icons.rounded;

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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NatKt {
    private static ImageVector _nat;

    public static final ImageVector getNat(Icons.Rounded rounded) {
        ImageVector imageVector = _nat;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Nat", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uo.b(6.82f, 13.0f, 11.0f, -2.0f, 6.82f);
        b.curveTo(6.4f, 9.84f, 5.3f, 9.0f, 4.0f, 9.0f);
        b.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        b.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        b.curveTo(5.3f, 15.0f, 6.4f, 14.16f, 6.82f, 13.0f);
        b.close();
        b.moveTo(4.0f, 13.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        b.curveTo(5.0f, 12.55f, 4.55f, 13.0f, 4.0f, 13.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(22.47f, 12.4f);
        b2.curveToRelative(0.27f, -0.2f, 0.27f, -0.6f, 0.0f, -0.8f);
        af0.m(b2, 19.0f, 9.0f, 2.0f, -4.05f);
        b2.curveToRelative(-0.47f, -4.69f, -4.16f, -8.42f, -8.83f, -8.94f);
        b2.curveTo(5.52f, 2.0f, 5.0f, 2.46f, 5.0f, 3.06f);
        b2.verticalLineToRelative(0.0f);
        b2.curveToRelative(0.0f, 0.5f, 0.37f, 0.93f, 0.87f, 0.99f);
        b2.curveTo(9.88f, 4.48f, 13.0f, 7.87f, 13.0f, 12.0f);
        b2.reflectiveCurveToRelative(-3.12f, 7.52f, -7.13f, 7.95f);
        b2.curveTo(5.37f, 20.01f, 5.0f, 20.44f, 5.0f, 20.94f);
        b2.verticalLineToRelative(0.0f);
        b2.curveToRelative(0.0f, 0.6f, 0.52f, 1.07f, 1.11f, 1.0f);
        b2.curveToRelative(4.67f, -0.52f, 8.37f, -4.25f, 8.83f, -8.94f);
        b2.horizontalLineTo(19.0f);
        b2.verticalLineToRelative(2.0f);
        b2.lineTo(22.47f, 12.4f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nat = build;
        build.getClass();
        return build;
    }
}
