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
public final class HighlightOffKt {
    private static ImageVector _highlightOff;

    public static final ImageVector getHighlightOff(Icons.TwoTone twoTone) {
        ImageVector imageVector = _highlightOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.HighlightOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 4.0f);
        b.curveToRelative(-4.41f, 0.0f, -8.0f, 3.59f, -8.0f, 8.0f);
        b.reflectiveCurveToRelative(3.59f, 8.0f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(8.0f, -3.59f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(-3.59f, -8.0f, -8.0f, -8.0f);
        k4.r(b, 16.0f, 14.59f, 14.59f, 16.0f);
        b.lineTo(12.0f, 13.41f);
        b.lineTo(9.41f, 16.0f);
        b.lineTo(8.0f, 14.59f);
        b.lineTo(10.59f, 12.0f);
        b.lineTo(8.0f, 9.41f);
        b.lineTo(9.41f, 8.0f);
        b.lineTo(12.0f, 10.59f);
        b.lineTo(14.59f, 8.0f);
        b.lineTo(16.0f, 9.41f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 13.41f, 12.0f, 16.0f, 14.59f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(14.59f, 8.0f, 12.0f, 10.59f);
        i.lineTo(9.41f, 8.0f);
        i.lineTo(8.0f, 9.41f);
        i.lineTo(10.59f, 12.0f);
        i.lineTo(8.0f, 14.59f);
        i.lineTo(9.41f, 16.0f);
        i.lineTo(12.0f, 13.41f);
        i.lineTo(14.59f, 16.0f);
        i.lineTo(16.0f, 14.59f);
        r6.C(i, 13.41f, 12.0f, 16.0f, 9.41f);
        i.moveTo(12.0f, 2.0f);
        i.curveTo(6.47f, 2.0f, 2.0f, 6.47f, 2.0f, 12.0f);
        i.reflectiveCurveToRelative(4.47f, 10.0f, 10.0f, 10.0f);
        i.reflectiveCurveToRelative(10.0f, -4.47f, 10.0f, -10.0f);
        i.reflectiveCurveTo(17.53f, 2.0f, 12.0f, 2.0f);
        i.close();
        i.moveTo(12.0f, 20.0f);
        i.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        i.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        i.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, -3.59f, 8.0f, -8.0f, 8.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _highlightOff = build;
        build.getClass();
        return build;
    }
}
