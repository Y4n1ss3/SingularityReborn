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
import defpackage.bv;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NaturePeopleKt {
    private static ImageVector _naturePeople;

    public static final ImageVector getNaturePeople(Icons.Rounded rounded) {
        ImageVector imageVector = _naturePeople;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NaturePeople", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(4.5f, 9.5f, -1.5f, 0.0f);
        b.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        b.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(22.17f, 9.17f);
        b2.curveToRelative(0.0f, -3.91f, -3.19f, -7.06f, -7.11f, -7.0f);
        b2.curveToRelative(-3.83f, 0.06f, -6.99f, 3.37f, -6.88f, 7.19f);
        b2.curveToRelative(0.09f, 3.38f, 2.58f, 6.16f, 5.83f, 6.7f);
        bv.A(b2, 20.0f, 6.0f, -3.0f, 0.5f);
        b2.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        b2.verticalLineTo(13.0f);
        b2.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b2.horizontalLineTo(3.0f);
        b2.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b2.verticalLineToRelative(3.5f);
        b2.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        b2.horizontalLineTo(3.0f);
        b2.verticalLineToRelative(4.0f);
        b2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b2.horizontalLineToRelative(14.0f);
        b2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b2.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b2.horizontalLineToRelative(-2.0f);
        b2.verticalLineToRelative(-3.88f);
        b2.curveToRelative(3.47f, -0.41f, 6.17f, -3.36f, 6.17f, -6.95f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _naturePeople = build;
        build.getClass();
        return build;
    }
}
