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
import defpackage.bv;
import defpackage.c21;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SaveAsKt {
    private static ImageVector _saveAs;

    public static final ImageVector getSaveAs(Icons.TwoTone twoTone) {
        ImageVector imageVector = _saveAs;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SaveAs", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(16.17f, 5.0f, 5.0f, 14.0f, 9.4f);
        i.lineToRelative(4.6f, -4.6f);
        bv.k(i, 7.83f, 16.17f, 5.0f);
        i.moveTo(12.0f, 18.0f);
        i.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        i.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        i.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        i.reflectiveCurveTo(13.66f, 18.0f, 12.0f, 18.0f);
        c21.d(i, 15.0f, 10.0f, 6.0f, 6.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(i, 9.0f, 10.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i2 = bv.i(21.0f, 12.4f, 7.0f, -4.0f, -4.0f);
        i2.horizontalLineTo(5.0f);
        i2.curveTo(3.89f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        i2.verticalLineToRelative(14.0f);
        i2.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        r6.t(i2, 7.4f, 2.0f, -2.0f, 5.0f);
        i2.verticalLineTo(5.0f);
        i2.horizontalLineToRelative(11.17f);
        i2.lineTo(19.0f, 7.83f);
        kf0.t(i2, 6.57f, 21.0f, 12.4f);
        i2.moveTo(15.0f, 15.0f);
        i2.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        i2.reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f);
        i2.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        i2.reflectiveCurveTo(15.0f, 13.34f, 15.0f, 15.0f);
        r6.B(i2, 6.0f, 6.0f, 9.0f, 4.0f);
        bv.s(i2, 6.0f, 6.0f, 19.99f, 16.25f);
        i2.lineToRelative(1.77f, 1.77f);
        r6.w(i2, 16.77f, 23.0f, 15.0f, -1.77f);
        uo.l(i2, 19.99f, 16.25f, 23.25f, 16.51f);
        i2.lineToRelative(-0.85f, 0.85f);
        i2.lineToRelative(-1.77f, -1.77f);
        i2.lineToRelative(0.85f, -0.85f);
        i2.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        i2.lineToRelative(1.06f, 1.06f);
        i2.curveTo(23.45f, 16.0f, 23.45f, 16.32f, 23.25f, 16.51f);
        i2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _saveAs = build;
        build.getClass();
        return build;
    }
}
