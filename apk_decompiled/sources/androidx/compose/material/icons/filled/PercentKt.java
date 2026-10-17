package androidx.compose.material.icons.filled;

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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PercentKt {
    private static ImageVector _percent;

    public static final ImageVector getPercent(Icons.Filled filled) {
        ImageVector imageVector = _percent;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Percent", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(7.5f, 11.0f);
        b.curveTo(9.43f, 11.0f, 11.0f, 9.43f, 11.0f, 7.5f);
        b.reflectiveCurveTo(9.43f, 4.0f, 7.5f, 4.0f);
        b.reflectiveCurveTo(4.0f, 5.57f, 4.0f, 7.5f);
        b.reflectiveCurveTo(5.57f, 11.0f, 7.5f, 11.0f);
        b.close();
        b.moveTo(7.5f, 6.0f);
        b.curveTo(8.33f, 6.0f, 9.0f, 6.67f, 9.0f, 7.5f);
        b.reflectiveCurveTo(8.33f, 9.0f, 7.5f, 9.0f);
        b.reflectiveCurveTo(6.0f, 8.33f, 6.0f, 7.5f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 6.67f, 6.0f, 7.5f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(k4.e(4.002f, 18.583f, 14.587f, -14.587f), 1.414f, 1.414f, -14.587f, 14.587f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(16.5f, 13.0f);
        b2.curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f);
        b2.reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f);
        b2.reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f);
        b2.reflectiveCurveTo(18.43f, 13.0f, 16.5f, 13.0f);
        b2.close();
        b2.moveTo(16.5f, 18.0f);
        b2.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        b2.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        b2.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b2, 17.33f, 18.0f, 16.5f, 18.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _percent = build;
        build.getClass();
        return build;
    }
}
