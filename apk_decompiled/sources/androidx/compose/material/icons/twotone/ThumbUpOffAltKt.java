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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ThumbUpOffAltKt {
    private static ImageVector _thumbUpOffAlt;

    public static final ImageVector getThumbUpOffAlt(Icons.TwoTone twoTone) {
        ImageVector imageVector = _thumbUpOffAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ThumbUpOffAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(13.34f, 4.66f, -4.34f, 4.34f);
        e.lineToRelative(0.0f, 10.0f);
        e.lineToRelative(9.0f, 0.0f);
        e.lineToRelative(3.0f, -7.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 0.0f, -2.0f, -8.77f, 0.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(21.0f, 8.0f, -6.31f, 0.95f, -4.57f);
        i.lineToRelative(0.03f, -0.32f);
        i.curveToRelative(0.0f, -0.41f, -0.17f, -0.79f, -0.44f, -1.06f);
        i.lineTo(14.17f, 1.0f);
        i.lineTo(7.59f, 7.59f);
        i.curveTo(7.22f, 7.95f, 7.0f, 8.45f, 7.0f, 9.0f);
        i.verticalLineToRelative(10.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(9.0f);
        i.curveToRelative(0.83f, 0.0f, 1.54f, -0.5f, 1.84f, -1.22f);
        i.lineToRelative(3.02f, -7.05f);
        i.curveTo(22.95f, 12.5f, 23.0f, 12.26f, 23.0f, 12.0f);
        i.verticalLineToRelative(-2.0f);
        i.curveTo(23.0f, 8.9f, 22.1f, 8.0f, 21.0f, 8.0f);
        k4.x(i, 21.0f, 12.0f, -3.0f, 7.0f);
        i.horizontalLineTo(9.0f);
        i.verticalLineTo(9.0f);
        i.lineToRelative(4.34f, -4.34f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.g(i, 12.23f, 10.0f, 21.0f, 12.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(1.0f, 9.0f, 4.0f, 12.0f, -4.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbUpOffAlt = build;
        build.getClass();
        return build;
    }
}
