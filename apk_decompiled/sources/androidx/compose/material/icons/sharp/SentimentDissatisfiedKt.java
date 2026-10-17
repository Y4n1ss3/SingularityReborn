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
import defpackage.af0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SentimentDissatisfiedKt {
    private static ImageVector _sentimentDissatisfied;

    public static final ImageVector getSentimentDissatisfied(Icons.Sharp sharp) {
        ImageVector imageVector = _sentimentDissatisfied;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SentimentDissatisfied", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(15.5f, 9.5f, -1.5f, 0.0f);
        b.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        b.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = af0.b(8.5f, 9.5f, -1.5f, 0.0f);
        b2.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        b2.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b3 = uf.b(12.0f, 14.0f);
        b3.curveToRelative(-2.33f, 0.0f, -4.32f, 1.45f, -5.12f, 3.5f);
        b3.horizontalLineToRelative(1.67f);
        b3.curveToRelative(0.69f, -1.19f, 1.97f, -2.0f, 3.45f, -2.0f);
        b3.reflectiveCurveToRelative(2.75f, 0.81f, 3.45f, 2.0f);
        b3.horizontalLineToRelative(1.67f);
        b3.curveToRelative(-0.8f, -2.05f, -2.79f, -3.5f, -5.12f, -3.5f);
        b3.close();
        b3.moveTo(11.99f, 2.0f);
        b3.curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b3.reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f);
        b3.curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        b3.reflectiveCurveTo(17.52f, 2.0f, 11.99f, 2.0f);
        b3.close();
        b3.moveTo(12.0f, 20.0f);
        b3.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        b3.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
        b3.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b3, -3.58f, 8.0f, -8.0f, 8.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sentimentDissatisfied = build;
        build.getClass();
        return build;
    }
}
