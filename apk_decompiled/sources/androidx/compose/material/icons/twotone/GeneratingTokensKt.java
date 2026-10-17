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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GeneratingTokensKt {
    private static ImageVector _generatingTokens;

    public static final ImageVector getGeneratingTokens(Icons.TwoTone twoTone) {
        ImageVector imageVector = _generatingTokens;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.GeneratingTokens", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(9.0f, 6.0f);
        b.curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
        b.reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f);
        b.reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f);
        b.reflectiveCurveTo(12.31f, 6.0f, 9.0f, 6.0f);
        r6.B(b, 12.0f, 10.5f, -2.0f, 5.0f);
        uf.B(b, 8.0f, -5.0f, 6.0f, 9.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(b, 6.0f, 10.5f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(9.0f, 4.0f);
        b2.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        b2.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        b2.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        b2.curveTo(17.0f, 7.58f, 13.42f, 4.0f, 9.0f, 4.0f);
        b2.close();
        b2.moveTo(9.0f, 18.0f);
        b2.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        b2.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        b2.reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f);
        b2.reflectiveCurveTo(12.31f, 18.0f, 9.0f, 18.0f);
        r6.B(b2, 12.0f, 10.5f, -2.0f, 5.0f);
        uf.B(b2, 8.0f, -5.0f, 6.0f, 9.0f);
        uo.r(b2, 6.0f, 10.5f, 20.25f, 3.75f);
        b2.lineTo(23.0f, 5.0f);
        b2.lineToRelative(-2.75f, 1.25f);
        b2.lineTo(19.0f, 9.0f);
        b2.lineToRelative(-1.25f, -2.75f);
        b2.lineTo(15.0f, 5.0f);
        b2.lineToRelative(2.75f, -1.25f);
        r6.C(b2, 19.0f, 1.0f, 20.25f, 3.75f);
        b2.moveTo(20.25f, 17.75f);
        b2.lineTo(23.0f, 19.0f);
        b2.lineToRelative(-2.75f, 1.25f);
        b2.lineTo(19.0f, 23.0f);
        b2.lineToRelative(-1.25f, -2.75f);
        b2.lineTo(15.0f, 19.0f);
        b2.lineToRelative(2.75f, -1.25f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b2, 19.0f, 15.0f, 20.25f, 17.75f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _generatingTokens = build;
        build.getClass();
        return build;
    }
}
