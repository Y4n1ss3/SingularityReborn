package androidx.compose.material.icons.outlined;

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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DataThresholdingKt {
    private static ImageVector _dataThresholding;

    public static final ImageVector getDataThresholding(Icons.Outlined outlined) {
        ImageVector imageVector = _dataThresholding;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DataThresholding", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(19.0f, 3.0f, 5.0f);
        d.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        d.verticalLineToRelative(14.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(14.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(5.0f);
        d.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        af0.l(d, 19.0f, 19.0f, -1.73f);
        uf.o(d, 19.0f, 17.27f, 19.0f);
        d.moveTo(19.0f, 16.0f);
        kf0.B(d, -0.85f, -3.0f, 3.0f, -1.62f);
        d.lineToRelative(3.0f, -3.0f);
        r6.t(d, -2.12f, -3.0f, 3.0f, 9.8f);
        d.lineToRelative(3.0f, -3.0f);
        r6.t(d, -2.12f, -3.0f, 3.0f, 5.84f);
        d.lineToRelative(3.0f, -3.0f);
        d.horizontalLineTo(6.72f);
        d.lineTo(5.0f, 17.72f);
        d.verticalLineTo(5.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(d, 14.0f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(10.67f, 11.0f, 2.0f, 2.0f);
        e.lineToRelative(5.08f, -5.09f);
        e.lineToRelative(-1.41f, -1.41f);
        e.lineToRelative(-3.67f, 3.67f);
        e.lineToRelative(-2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, -4.42f, 4.42f, 1.41f, 1.41f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dataThresholding = build;
        build.getClass();
        return build;
    }
}
