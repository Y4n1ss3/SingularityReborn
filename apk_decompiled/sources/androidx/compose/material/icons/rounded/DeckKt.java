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
import defpackage.gy;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DeckKt {
    private static ImageVector _deck;

    public static final ImageVector getDeck(Icons.Rounded rounded) {
        ImageVector imageVector = _deck;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Deck", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.41f, 9.0f);
        b.curveToRelative(0.49f, 0.0f, 0.69f, -0.63f, 0.29f, -0.91f);
        b.lineTo(13.15f, 2.8f);
        b.curveToRelative(-0.69f, -0.48f, -1.61f, -0.48f, -2.29f, 0.0f);
        b.lineTo(3.3f, 8.09f);
        b.curveTo(2.9f, 8.37f, 3.1f, 9.0f, 3.59f, 9.0f);
        b.horizontalLineTo(11.0f);
        b.verticalLineToRelative(12.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.e(b, 9.0f, 20.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = r6.a(8.0f, 16.0f, 4.9f, -0.57f, -3.02f);
        a.curveToRelative(-0.1f, -0.54f, -0.62f, -0.9f, -1.17f, -0.8f);
        a.curveToRelative(-0.54f, 0.1f, -0.9f, 0.62f, -0.8f, 1.17f);
        a.lineTo(3.0f, 16.74f);
        a.verticalLineTo(21.0f);
        a.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        a.horizontalLineToRelative(0.01f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, -0.44f, 1.0f, -0.99f);
        r6.w(a, 5.02f, 18.0f, 7.0f, 3.0f);
        a.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        a.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        a.verticalLineToRelative(-4.0f);
        a.curveTo(9.0f, 16.45f, 8.55f, 16.0f, 8.0f, 16.0f);
        a.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(20.84f, 12.18f);
        b2.curveToRelative(-0.54f, -0.1f, -1.06f, 0.26f, -1.17f, 0.8f);
        b2.lineTo(19.1f, 16.0f);
        b2.horizontalLineTo(16.0f);
        b2.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b2.verticalLineToRelative(4.0f);
        b2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b2.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        gy.C(b2, -3.0f, 1.98f, 0.02f, 3.01f);
        b2.curveToRelative(0.0f, 0.55f, 0.45f, 0.99f, 1.0f, 0.99f);
        b2.horizontalLineTo(20.0f);
        b2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b2.verticalLineToRelative(-4.26f);
        b2.lineToRelative(0.64f, -3.39f);
        b2.curveTo(21.74f, 12.81f, 21.38f, 12.28f, 20.84f, 12.18f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _deck = build;
        build.getClass();
        return build;
    }
}
